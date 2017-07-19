package com.cd.coe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cd.coe.model.Author;
import com.cd.coe.model.Book;
import com.cd.coe.model.Category;
import com.cd.coe.model.Edition;
import com.cd.coe.model.Publisher;
import com.cd.coe.model.User;

@Transactional
@Repository
public class BookDaoImpl implements BookDao {

	@PersistenceContext
	protected EntityManager entityManager;
	
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		
		CriteriaBuilder builder = entityManager.
				getCriteriaBuilder();
		CriteriaQuery<Book> cq = builder.createQuery(Book.class);
//select *from
		Root<Book> r = cq.from(Book.class);
		cq.select(r);
		TypedQuery<Book> query = entityManager.createQuery(cq);
		List<Book> bookList = query.getResultList();
		
		return bookList;
	}

	public Book findBook(int bookID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean addPublisher(Publisher p)
	{
		CriteriaBuilder builder = entityManager.
				getCriteriaBuilder();
		CriteriaQuery<Publisher> cq = builder.createQuery(Publisher.class);
//select *from
		Root<Publisher> r = cq.from(Publisher.class);
		cq.select(r);
		Predicate pubeq = builder.equal(r.get("publisherName"),p.getPublisherName());
		cq.where(pubeq);
		Publisher pub = (Publisher) entityManager.createQuery(cq).getSingleResult();
		

		//	System.out.println(user);
			return pub == null;
		
	
	}
	public boolean addCategory(Category c)
	{
		CriteriaBuilder builder = entityManager.
				getCriteriaBuilder();
		CriteriaQuery<Category> cq = builder.createQuery(Category.class);
//select *from
		Root<Category> r = cq.from(Category.class);
		cq.select(r);
		Predicate cateq = builder.equal(r.get("categoryName"),c.getCategoryName());
		cq.where(cateq);
		Category cat = (Category) entityManager.createQuery(cq).getSingleResult();
		

		//	System.out.println(user);
			return cat == null;
	}
	
	public boolean addEdition(Edition e)
	{
		CriteriaBuilder builder = entityManager.
				getCriteriaBuilder();
		CriteriaQuery<Edition> cq = builder.createQuery(Edition.class);
//select *from
		Root<Edition> r = cq.from(Edition.class);
		cq.select(r);
		Predicate edeq1 = builder.equal(r.get("ISBN"),e.getISBN());
		Predicate edeq = builder.equal(r.get("edition"),e.getEdition());
		Predicate predicate = builder.and(edeq,edeq1);
		cq.where(predicate);
		Edition ed = (Edition) entityManager.createQuery(cq).getSingleResult();
		

		//	System.out.println(user);
			return ed == null;
	}

	public boolean addBook(int bookID,String bookName, String categoryName, Set<Author> authors1, String publisherName,
			String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity) {
		// TODO Auto-generated method stub
		Publisher p = new Publisher(publisherName);
		Category c = new Category(categoryName);
		Book b = new Book(bookID,bookName, c.getCategoryID(), p.getPublisherID(),authors1);
		Edition e = new Edition(bookID,isbn, price, pages, purchaseDate,
				 edition,  rent, quantity, quantity); 
		entityManager.persist(b);
		
		if(this.addPublisher(p)){entityManager.persist(p);}
		if(this.addCategory(c)){entityManager.persist(c);}
		if(this.addEdition(e)){entityManager.persist(e);}
        return true;
		
	}

	public void issuebook(int bookID, int edition, int userID, Date issueDate, Date dueDate, double baseRent,
			int status) {
		// TODO Auto-generated method stub
		
	}

	
	
	 
}

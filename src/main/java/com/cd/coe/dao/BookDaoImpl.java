package com.cd.coe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cd.coe.model.Author;
import com.cd.coe.model.Book;
import com.cd.coe.model.Category;
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

	public boolean addBook(int bookID, String bookName, String categoryName, String authorName, String publisherName,
			String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity) {
		// TODO Auto-generated method stub
		Publisher p = new Publisher(publisherName);
		Author a = new Author(authorName);
		Category c = new Category(categoryName);
		Book b = new Book(bookID,bookName, c.getCategoryID(), p.getPublisherID());
		entityManager.persist(b);
        return true;
		
	}

	public void issuebook(int bookID, int edition, int userID, Date issueDate, Date dueDate, double baseRent,
			int status) {
		// TODO Auto-generated method stub
		
	}
	
	 
}

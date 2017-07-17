package com.cd.coe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cd.coe.model.Book;
public class BookDaoImpl implements BookDao {
	
	 @Autowired
	 BookDao bookDao;
	 
	 @Override
	    public List<Book> listBooks() {
	        return bookDao.findAll();
	}
}

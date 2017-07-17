package com.cd.coe.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;



public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	/* @Autowired
	 protected EntityManager entityManager;
	 
	public T persist(T entity) {
	  this.entityManager.persist(entity);
		return entity;

	}*/

}

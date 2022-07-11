package com.br.dao;

import javax.persistence.EntityManager;

import com.br.entities.client.Sex;

public class SexDao {
	private EntityManager em;
	
	public void post(Sex sex) {
		this.em.persist(sex);
	}
	
	public void update(Sex sex) {
		this.em.merge(sex);
	}
	
	public void delete(Sex sex) {
		this.em.getTransaction().begin();
		Sex toDelete = this.em.merge(sex);
		this.em.remove(toDelete);
	}

	public SexDao(EntityManager em) {
		
		this.em = em;
	}

}

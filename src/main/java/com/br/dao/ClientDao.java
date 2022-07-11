package com.br.dao;

import javax.persistence.EntityManager;

import com.br.entities.client.Client;


public class ClientDao {
	EntityManager em;
	
	
	public ClientDao(EntityManager em) {
		this.em = em;
	}


	public void post(Client client) {
		this.em.persist(client);
	}
	
	public void update(Client client) {
		this.em.merge(client);
	}
	
	public void delete(Client client) {
		this.em.getTransaction().begin();
		Client toRemove = this.em.merge(client);
		this.em.remove(toRemove);
	}
}

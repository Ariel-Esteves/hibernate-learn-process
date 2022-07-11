package com.br.application;

import javax.persistence.EntityManager;

import com.br.dao.ClientDao;
import com.br.dao.SexDao;
import com.br.entities.client.Client;
import com.br.entities.client.GENDER;
import com.br.entities.client.Sex;
import com.br.persist.JPAUtil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sex sex = new Sex();
		sex.setGen(GENDER.MALE);
		Client client = new Client();
		client.setName("Ariel");
		client.setAge(23);
		client.setGender(sex);
		
		EntityManager em = JPAUtil.em();
		
		SexDao sex0 = new SexDao(em);
		sex0.post(sex);
		
		ClientDao client0 = new ClientDao(em);
		client0.post(client);
		
		em.getTransaction().begin();

	}

}

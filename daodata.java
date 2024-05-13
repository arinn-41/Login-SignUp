package com.Flipkart;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class daodata {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("gold");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(dtodata dtz) {
		et.begin();
		em.persist(dtz);
		et.commit();
	}

	public dtodata fetchByemail(String newemail) {
		javax.persistence.Query q1 = em.createQuery("select d from dtodata d where cgmail=?1");
		q1.setParameter(1, newemail);

		dtodata ret = (dtodata) q1.getSingleResult();

		return ret;
	}
}
https://training.deepneuron.in/courses/full-stack-power-bi-course-march-batch/lessons/installation-of-power-bi-desktopcopy-3/

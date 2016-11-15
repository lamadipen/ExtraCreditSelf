package edu.mum.ex2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import edu.mum.ex2.util.HibernetUtil;

public class BeneficiaryDaoImpl implements GenericDao {

	public BeneficiaryDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void create(Object obj) {
		// TODO Auto-generated method stub
		EntityManager em =HibernetUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			em.persist(obj);
			
			
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive())) tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen())) em.close();
		}
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}


	public void readAll() {
		// TODO Auto-generated method stub

	}

	public Object readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package edu.mum.ex2.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class TaskDaoImpl{

	@Autowired
	private SessionFactory sf;

	public TaskDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void create(Object obj) {
		sf.getCurrentSession().persist(obj);
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

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

}

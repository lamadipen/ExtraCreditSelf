package edu.mum.ex2.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ex2.domain.Role;
import edu.mum.ex2.domain.User;

@Repository
public class UserDaoImpl {

	@Autowired
	private SessionFactory sf;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Transactional
	public void create(Object obj) {

		User user = new User();
		user.setName("Dipen");
		user.setPhone("9849261881");
		user.setCity("Fairfield");
		user.setRole(Role.ADMINISTRATOR);

		if (sf == null) {
			System.out.println("sf is null");
		} else {
			System.out.println("sf is not null");
			sf.getCurrentSession().persist(user);
		}

		/*User user2 = new User();
		user2.setName("Suman");
		user2.setPhone("9849261881");
		user2.setCity("Fairfield");
		user2.setRole(Role.VOLUNTEER);
		em.persist(user2);*/

	}

	/*
	 * public void update() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * public void delete() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * public void readAll() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	@Transactional
	public User readById(int id) {
		return (User) sf.getCurrentSession().get(User.class, id);
	}

}

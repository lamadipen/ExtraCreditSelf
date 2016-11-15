package edu.mum.ex2.dao;

public interface GenericDao {
	
	public void create(Object obj);
	public void update();
	public void delete();
	public void readAll();
	public Object readById(int id);
	
}

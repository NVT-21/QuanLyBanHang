package DAO;

import java.util.ArrayList;

import model.HoaDon;


/**
 *
 * @author Acer
 */
public interface DAOinterface<T> {
	
	public int insert(T t);
	
	public int update(T t);
	
	public int delete(String t);
	
	public ArrayList<T> selectAll();
	
	public ArrayList<T> findByName(String t);

	

	

	

	
	
}

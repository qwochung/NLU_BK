package Data_Access_Obj;

import java.util.ArrayList;

public interface DAO_Interface <T> {
	public int insert (T t) ;
	public int del (T t) ;
	public int update (T t) ;
	
	
	public ArrayList<T> sellectAll() ;
	
	public T sellectByID (T t) ;	
	
	public ArrayList<T> sellectByCondition  ( String condition) ;
	
	
	

}

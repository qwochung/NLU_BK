package Control;

import Modun_Strategy.Covert;

public class Event_Singleton {
	public static Event_Singleton instance;
	public static Covert covert = new Covert() {
		
		@Override
		public Object converTo(int input) {
			
			return null;
		}
	};
	
	
	
	public static Event_Singleton getInstance () {
		if (instance == null) {
			return new Event_Singleton();
		}
		else {
			return instance;
		}
	}



	
	public static Covert getCovert() {
		return  covert ;
	}



	public static void setCovert(Covert covert) {
		Event_Singleton.covert = covert;
	}
	
	
	public static void main(String[] args) {
		System.out.println( Event_Singleton.getInstance().getCovert().converTo(1000, Covert.BIN));
		
		
	}
	
	

}

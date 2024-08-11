package Ant;

import java.util.ArrayList;

public class Ant {
	static ArrayList<Ant> dsAnts ;
	static int tongAnt = 0;
	String ten ;
	int id;
	public Ant(String ten, int id) {
		super();
		this.ten = ten;
		this.id = id;
		dsAnts.add(this);
		tongAnt++;
	}

	public static int sizeAnt() {
		return tongAnt
				;
		
	}
}

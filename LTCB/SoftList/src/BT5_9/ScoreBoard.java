package BT5_9;

public  class ScoreBoard {
	String name, Class;
	ILoGrade loGrade;
	/**
	 * @param name
	 * @param class1
	 * @param loGrade
	 */
	public ScoreBoard(String name, String class1, ILoGrade loGrade) {
		super();
		this.name = name;
		Class = class1;
		this.loGrade = loGrade;
	}
	
	
	
	@Override
	public String toString() {
		return "ScoreBoard -- name : " + name + ", Class : " + Class + " , loGrade :  " + "\n" + loGrade.toString() ;
	}
	
	
	public int howManyCredit () {
		return loGrade.howManyCredit();
	}
	
	
	
	public double gradeAverage () {
		return  (this.loGrade.tichDiemSo() / this.loGrade.howManyCredit()  )	;
	}
	
	
	public ILoGrade greaterThanList (int num) {
		return loGrade.greaterThanList ( num);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

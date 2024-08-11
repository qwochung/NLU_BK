package BT5_9;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	
	ILoGrade i1 = new MTLoGrade();
	ILoGrade i2 = new ConsLoGrade(new GradeRecord(new Course(8, "asD", 4), 5), i1);
	ILoGrade i3 = new ConsLoGrade(new GradeRecord(new Course(12, "sasa", 3), 8), i2);
	ILoGrade i4 = new ConsLoGrade(new GradeRecord(new Course(10, "zxc", 3), 10	), i3);
	
	ScoreBoard lst1 = new ScoreBoard("Hung", "DH22DTA", i3	);
	ScoreBoard lst2 = new ScoreBoard("nam", "DH22DTA", i4);
	
		public void testConstructer() {
			System.out.println( lst1);
		
			
		}

	// test howmanycredit
		
		public void testHowManyCredit () {
			System.out.println( lst1.howManyCredit());
		}
		
		
	// Test gradeAverage
		
		
		public void testGradeAverage () {
			System.out.println(lst1.gradeAverage());
		}
		
		
		
		
	// test sort 
		public void testSort () {
			System.out.println("sap sep ");
			System.out.println( i4.sortByGradeDec());
		}

		
		
		
	// test greaterThanList 
		 public void testgreaterThanList () {
			 System.out.println("greaterThanList");
			 System.out.println(lst2.greaterThanList(4) );
		 }
		
		
		
		
		
		
		
}

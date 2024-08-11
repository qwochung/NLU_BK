package bai7;

public class weather {
	Date ngay;
	EmperatureRange today;
	EmperatureRange nomal;
	EmperatureRange record;
	double precipitation;
	
	 weather( Date ngay,	EmperatureRange today, EmperatureRange nomal, EmperatureRange record, double precipitation	) {
		 this.ngay=ngay;
		 this.today=today;
		 this.nomal=nomal;
		 this.record=record;
		 this.precipitation=precipitation;
		 
	
	}
	

}

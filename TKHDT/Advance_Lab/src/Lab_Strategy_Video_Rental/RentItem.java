package Lab_Strategy_Video_Rental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentItem {
	LocalDate startRent ;
	MovieType movie;
	
	
	
	public RentItem(LocalDate startRent, MovieType movie) {
		super();
		this.startRent = startRent;
		this.movie = movie;
	}
	
	
//	Tính số ngày thuê
	public int getRentDays() {
		return Math.abs((int) LocalDate.now().until(startRent, ChronoUnit.DAYS));

	}
	
//	 Tính số tiền thuê
	public double getCharge() {
		return movie.getCharge(getRentDays());
	}


// 	 Tính số điểm tích lũy
	public int getPoint() {
		return movie.getPoint( getRentDays());
	}
	
	
}

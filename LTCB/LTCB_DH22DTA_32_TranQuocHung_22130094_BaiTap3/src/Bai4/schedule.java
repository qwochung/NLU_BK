package Bai4;

public class schedule {
	
	clockTime clockTimeLeave;
	clockTime clockTimeArrivel;
	public schedule( clockTime clockTimeLeave, clockTime clockTimeArrivel) {
		super();
		
		this.clockTimeLeave = clockTimeLeave;
		this.clockTimeArrivel = clockTimeArrivel;
	}
	
	/**
	 * delegate from trainStrip
	 * @return : value of clocTimeLeave
	 */
	public clockTime whatTime() {
		// TODO Auto-generated method stub
		
		return this.clockTimeLeave.whatTime();
	}

	public clockTime howLong() {
		// TODO Auto-generated method stub
		if ((clockTimeArrivel.getMinute()- clockTimeLeave.getMinute()) < 0)
			return new clockTime(clockTimeArrivel.getHour()-clockTimeLeave.getHour()-1,
					(int)(Math.sqrt(clockTimeArrivel.getMinute() - clockTimeLeave.getMinute()))) ;
		else
			return new clockTime(clockTimeArrivel.getHour()-clockTimeLeave.getHour(),
					(clockTimeArrivel.getMinute() - clockTimeLeave.getMinute())) ;
			
	}

	}



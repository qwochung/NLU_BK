package Event;

public class PublicEvent {
	private static PublicEvent instance;
	private static EventImageView eventImageView;
	private static EventChat eventChat;
	private static EventLogin eventLogin;
	private static EventMain eventMain;
	private static EventMenuLeft eventMenuLeft;
	
	

	public static PublicEvent getInstance() {
		if (instance == null) {
			instance = new PublicEvent(); 
		}
		return instance;
	}

	
	
	
	public  void addEventImageView(EventImageView event) {
		PublicEvent.eventImageView = event;
	}
	
	
	public void addEventChat(EventChat eventChat) {
		PublicEvent.eventChat = eventChat; 
	}
	

	public  EventImageView getEventImageView() {
		return eventImageView;
	}

	public EventChat getEventChat() {
		return eventChat;
	}
	
	
	public void addEventLogin( EventLogin eventLogin) {
		PublicEvent.eventLogin = eventLogin;
	}
	public EventLogin getEventLogin() {
		return eventLogin;
	}




	public  EventMain getEventMain() {
		return eventMain;
	}


	public  void addEventMain(EventMain eventMain) {
		PublicEvent.eventMain = eventMain;
	}




	public  EventMenuLeft getEventMenuLeft() {
		return eventMenuLeft;
	}




	public  void addEventMenuLeft(EventMenuLeft eventMenuLeft) {
		PublicEvent.eventMenuLeft = eventMenuLeft;
	}
	
	
	
	
	
}

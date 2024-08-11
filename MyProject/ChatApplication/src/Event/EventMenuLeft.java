package Event;

import java.util.List;

import Model.Model_User_Account_Client;

public interface EventMenuLeft {
	public void newUser(List<Model_User_Account_Client> users);
	public void userConnect(int userID);
	public void userDisconnect(int userID);

}

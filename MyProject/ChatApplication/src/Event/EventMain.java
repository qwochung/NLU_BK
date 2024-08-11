package Event;

import Model.Model_User_Account_Client;

public interface EventMain {
	public void showLoading(boolean show);
	public void initChat();
	public void selectUser( Model_User_Account_Client user);
	public void updateUser(Model_User_Account_Client user);
	

}

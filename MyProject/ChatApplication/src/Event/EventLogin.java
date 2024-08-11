package Event;

import Model.Model_Login_Client;
import Model.Model_Register_Client;

public interface EventLogin {
	public void login(Model_Login_Client data);
	public void register(Model_Register_Client register_Client, EventMessage message);
	public void goLogin( );
	public void goRegister();
}

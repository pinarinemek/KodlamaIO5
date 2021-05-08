package business.abstracts;

import entity.concretes.User;

public interface UserControlService {
	boolean passwordControl(User user);
	boolean firstLastNameControl(User user);
	void logIn (User user);
}

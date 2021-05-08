package core.concretes;
import core.abstracts.LogService;
import dataccess.abstracts.UserDao;
import entity.concretes.User;
import googleAccount.GoogleAccountManager;

public class GoogleAccountAdapter implements LogService{

	@Override
	public void log(String message) {
		System.out.println(message);
		
	}

	

}

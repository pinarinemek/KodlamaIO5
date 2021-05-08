import business.abstracts.UserControlService;
import business.concretes.UserControlManager;
import core.abstracts.LogService;
import core.concretes.EMailValidation;
import core.concretes.GoogleAccountAdapter;
import dataccess.abstracts.UserDao;

import dataccess.concretes.HibernateUserDao;
import dataccess.concretes.NewDataUserDao;
import entity.abstracts.UserService;
import entity.concretes.User;
import googleAccount.GoogleAccountManager;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Pýnar","Ýnemek","123456","pinarinemek@gmail.com");
		User user1 = new User(2,"Alpay","Özer","12345","alpayözer@gmail.com");
		
		EMailValidation eMailValidation = new EMailValidation();
		eMailValidation.eMailValidation(user);
		
		UserDao hibernate = new HibernateUserDao();
		hibernate.addUser(user);
		hibernate.addUser(user1);
		
		LogService googleAccount = new GoogleAccountAdapter();
		googleAccount.log("Google hesabý ile eklendi");
		
		UserControlService controlService = new UserControlManager();
		controlService.logIn(user);
		controlService.logIn(user1);
		
	}

}

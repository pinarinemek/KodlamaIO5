package dataccess.concretes;

import business.abstracts.UserControlService;
import business.concretes.UserControlManager;
import core.abstracts.EMailService;

import core.abstracts.LogService;
import core.concretes.EMailLog;
import core.concretes.EMailValidation;

import dataccess.abstracts.UserDao;
import entity.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void addUser(User user) {
		
		UserControlService control = new UserControlManager();
		
		if(EMailValidation.isEmailValid(user) && control.passwordControl(user) && control.firstLastNameControl(user) ) {
			System.out.println("Kiþi hibernate ile sisteme eklendi: " + user.getFirtsName() + user.getLastName());
			
			LogService logService = new EMailLog();
			logService.log("doðrulama e maili gönderildi");
		}else {
			System.out.println("kiþi eklenemedi");
		}
	}

}

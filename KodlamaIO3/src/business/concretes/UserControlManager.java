package business.concretes;

import business.abstracts.UserControlService;
import core.abstracts.LogService;
import core.concretes.EMailLog;
import core.concretes.EMailValidation;
import entity.concretes.User;

public class UserControlManager implements UserControlService {

	@Override
	public boolean passwordControl(User user) {
		if(user.getPassword().length()>=6) {
			//System.out.println("parola kullanýlabilir.");
			return true;
		}else {
			System.out.println("parola geçersiz.");
			return false;
		}
		
	}

	@Override
	public boolean firstLastNameControl(User user) {
		if(user.getFirtsName().length()>=2 && user.getLastName().length()>=2) {
			//System.out.println("Ýsim soyisim kullanýlabilir.");
			return true;
		}else {
			System.out.println("isim soyisim geçersiz");
			return false;
		}
		
	}

	@Override
	public void logIn(User user) {

		UserControlService control = new UserControlManager();
		
		if(EMailValidation.isEmailValid(user) && control.passwordControl(user) && control.firstLastNameControl(user) ) {
			System.out.println("oturum açýldý: " + user.getFirtsName() + user.getLastName());
			
			
		}else {
			System.out.println("oturum açýlamadý.");
		}
		
	}

}

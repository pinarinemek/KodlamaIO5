package core.concretes;



import java.util.regex.Pattern;

import core.abstracts.EMailService;
import entity.concretes.User;

public class EMailValidation implements EMailService {
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	public static boolean isEmailValid(User user) {
	Pattern pattern = Pattern.compile(EMAIL_PATTERN,
	Pattern.CASE_INSENSITIVE);
	return pattern.matcher(user.geteMail()).find();
	
	
	}
	
	
	@Override
	public void eMailValidation(User user) {
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.geteMail()).find()) {
			System.out.println("email kullanýlabilir");
			}else {
				System.out.println("email geçersiz");
			}
	}

	
	
}



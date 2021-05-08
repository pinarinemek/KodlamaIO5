package core.concretes;

import core.abstracts.LogService;

public class EMailLog implements LogService {

	@Override
	public void log(String message) {
		System.out.println(message);
		
	}

}

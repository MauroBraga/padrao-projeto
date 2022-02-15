package br.com.cod3r.factory.apple.factory.halfSimple;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		}else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		}
		
		return null;
	}

}

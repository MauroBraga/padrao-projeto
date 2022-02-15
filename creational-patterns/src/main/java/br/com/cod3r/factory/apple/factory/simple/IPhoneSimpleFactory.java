package br.com.cod3r.factory.apple.factory.simple;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

	public IPhone orderIPhone(String generation, String level) {
		IPhone device= null;
		
		if(generation.equals("X")){
			if(level.equals("standard")) {
				device = new IPhoneX();
			}else if(level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		}else if(generation.equals("11")) {
			if(level.equals("standard")) {
				device = new IPhone11();
			}else if(level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		
		if(device!=null) {
			
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}
		
		return device;
	}
}

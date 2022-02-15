package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class Client {
	
	
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
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	public static void main(String[] args) {
		//Client client = new Client();
		IPhoneFactory iphoneFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		
		System.out.println("### Ordering an iPhone X");
		//IPhone iphone =  client.orderIPhone("X", "standard");
		IPhone iphone =  iphoneFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		//IPhone iphone2 = client.orderIPhone("11", "highEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
	}
}

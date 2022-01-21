package com.bajaj.prac;

//component 
interface FeaturesMobile
{
	
public void calling(); //calling 2g
public void sendSMS();
public void playGame();
	
}

abstract class SimCardHolder
{

	//non abstract method
	public void simCard()
	{
		System.out.println("Normal Sim card");
	}
	// abstract method
	abstract void hybridSimCard();
	
	
	
	
}

class SmartMobile extends SimCardHolder implements FeaturesMobile
{
	@Override
	void hybridSimCard()
	{
		
	}

	public void OS()
	{
		System.out.println("Android ");
	}
	
	public void vidoCalling()
	{
		System.out.println("video calling");
	}
	
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("5 calling ");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Play games");
	}
	
}

class Nokia implements FeaturesMobile
{

	public void brand() {
		System.out.println("Nokia");
	}
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("2 calling ");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		
	}
	
}

class Sumsung implements FeaturesMobile
{
	
	public void brand() {
		System.out.println("sumsung");
	}
	

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		
	}
	
}



public class MyMobile {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		
	
		//child class reference to parent
		FeaturesMobile mobile=new Nokia();
		mobile.calling();
		mobile.sendSMS();
		
		
		FeaturesMobile mobile2=new Sumsung();
		mobile2.calling();
		//mobile2.
		
		//abstract class
		SimCardHolder sim=new SimCardHolder() {
			
			@Override
			void hybridSimCard() {
				System.out.println("My sim card");
				
			}
		};
		
		sim.hybridSimCard();
		sim.simCard();
		
		SimCardHolder ss = new SimCardHolder() {
			
			@Override
			void hybridSimCard() {
				// TODO Auto-generated method stub
				System.out.println("Jio sim card");
			}
		};
		ss.hybridSimCard();
		
		//interface 
		FeaturesMobile featuresMobile=new FeaturesMobile() {
			
			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calling() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}


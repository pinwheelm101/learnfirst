package com.LearnWork1;

public class Testphone {
	  public static Phone p1=new Featurephone("G502","索尼爱立信");
	 
	  
	  public static void main(String[] args) {
		 
		 Phone p2=new Intelligentphone("T9100","HTC");
		  
		  
		  p1.show();
		((Featurephone)p1).playmusic();
	    ((Featurephone)p1).sandmessages();
	    ((Featurephone)p1).call();
	    System.out.println("");
	    p2.show();
	    ((Intelligentphone)p2).web();
	    ((Intelligentphone)p2).video();
	    ((Intelligentphone)p2).photo();
	    ((Intelligentphone)p2).sendPhoto();
	    ((Intelligentphone)p2).videoCall();
	     
	}
}

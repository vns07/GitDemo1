package gitdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class demo {
	
	public static final Logger logger = Logger.getLogger(demo.class.getName());
	
	public static void main(String[] args ) {
		   PropertyConfigurator.configure("log4j.properties");

		int n1=0,n2=1,n3,i,count=10;    
		 //System.out.print(n1+" "+n2);//printing 0 and 1    
		 logger.warn("printing  output is "   +n1+" "+n2);
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);  
		logger.warn(" "+n3);
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}

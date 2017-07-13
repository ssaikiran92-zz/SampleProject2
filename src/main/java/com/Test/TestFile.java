package com.Test;

// you are an idiot 

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.PortInformation.PortInformation;

public class TestFile {
    

	public static void main(String[] args) {
		try{
			
			 KieServices ks = KieServices.Factory.get();
			 System.out.println("atk session");
	    	KieContainer kContainer = ks.getKieClasspathContainer();
	    	System.out.println("atk sessio n2  ");
	        KieSession kSession = kContainer.newKieSession("ksession-process");
	        System.out.println("atk sessio n3  ");
	        PortInformation  PortObject = new PortInformation();
	        System.out.println("atk sessio n4  ");
	        System.out.println("Executing the results");
	        PortObject.setPortSpeedIsSelected(true);
	        PortObject.setPortBillingOptionSelectedValue("Highcap Flex");
	        kSession.insert(PortObject);
	        
	        kSession.fireAllRules();
	        System.out.println("Executed the results");
	        System.out.println(PortObject.getNativeIpValue());
	        System.out.println(PortObject.getPortBillingOptionDropdownList());
			
		}catch(Exception e){
			
			e.printStackTrace();
		}

	}

}

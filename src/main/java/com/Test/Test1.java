package com.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.PortInformation.Port;
import com.PortInformation.PortInformation;

public class Test1 {
    

	public static void main(String[] args) {
		try{
			
			 KieServices ks = KieServices.Factory.get();
	    	KieContainer kContainer = ks.getKieClasspathContainer();
	        KieSession kSession = kContainer.newKieSession("ksession-rules");
	        
	        Port PortObject = new Port();
	        kSession.insert(PortObject);
	        
	        System.out.println(PortObject.getNativeIP().value);
	        
			
		}catch(Exception e){
			
			e.printStackTrace();
		}

	}

}

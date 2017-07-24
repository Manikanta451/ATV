package com.atv.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {
	
	private static final long serialVersionUID = -5841500346110682370L;
	
			 
					
			// ---Login------//
					
					public String Email ="";
					
					public String Password ="";
			
	     //----Login Getter and  Setters-------//			
	 				
					public String getEmail() {
						return Email;
					}
					
					public void setEmail(String email) {
						Email = email;
					}
					public String getPassword() {
						return Password;
					}
					public void setPassword(String password) {
						Password = password;
					}
					
		
}	
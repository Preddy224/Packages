package com.school.app;


import com.school.staff.Principal;

import com.school.managment.School;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school= new School();
		school.setName("Malla ");
		school.setLocation("Maisammaguda");
		
		Principal principal =new Principal();
		principal.setExperienceYears(10);
		principal.setPrincipalName("Rama Krishna");
		
		
		school.showSchoolInfo();
		principal.showPrincipalInfo();
		

	}

}

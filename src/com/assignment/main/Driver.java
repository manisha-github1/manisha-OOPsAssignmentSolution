package com.assignment.main;

import com.assignment.module.*;


public class Driver {
	
	public static void main (String[] args) {
		
	   Admin dept = new Admin();
		
	   String chkDeptname,chkTodayswork,chkworkdeadline,chkHoliday, chkStack,chkdoActivity;
		
		   chkDeptname = dept.departmentName();
		   chkTodayswork = dept.getTodaysWork();
		   chkworkdeadline = dept.getWorkDeadline();
		   chkHoliday = dept.isTodayHoliday();
			
		   //System.out.println();
		   System.out.println("Welcom to "+chkDeptname);
		   System.out.println(chkTodayswork);
		   System.out.println(chkworkdeadline);
		   System.out.println(chkHoliday);
			
		
		
		Hr dept2 = new Hr();
		
		   chkDeptname = dept2.departmentName();
		   chkdoActivity = dept2.doActivity();
		   chkTodayswork = dept2.getTodaysWork();
		   chkworkdeadline = dept2.getWorkDeadline();
		   chkHoliday = dept2.isTodayHoliday();
			
		   System.out.println();
		   System.out.println("Welcom to "+chkDeptname);
		   System.out.println(chkdoActivity);
		   System.out.println(chkTodayswork);
		   System.out.println(chkworkdeadline);
		   System.out.println(chkHoliday);
		
		
		Tech dept3 = new Tech();
		
		   chkDeptname = dept3.departmentName();
		   chkTodayswork = dept3.getTodaysWork();
		   chkStack = dept3.getTechStackInformation();
		   chkHoliday = dept3.isTodayHoliday();
			
		   System.out.println();
		   System.out.println("Welcom to "+chkDeptname);
		   System.out.println(chkTodayswork);
		   System.out.println(chkStack);
		   System.out.println(chkHoliday);
		
		
	}
	

}

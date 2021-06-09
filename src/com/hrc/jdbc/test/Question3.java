package com.hrc.jdbc.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter year value");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    int dayOfWeek = Calendar.SUNDAY;
	    Calendar cal = new GregorianCalendar();
	    cal.set(year, 0, 1, 0, 0);
	    cal.set(Calendar.DAY_OF_WEEK, dayOfWeek);
	    while (cal.get(Calendar.YEAR) == year) {
	      System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
	      cal.add(Calendar.DAY_OF_MONTH, 7);
	    }
	  }

}

package com.capgemini.filehandling.domain;

public class DateFormatCheck {
public static String convert1(String date) {
		
		if(date.length()!=8)
		{
			System.out.println("Enter correct format");
			return null;
		}

		String modified="";
		modified=date.substring(0, 2)+"/"+date.substring(2, 4)+"/"+date.substring(4);
		
		return modified;
	}

	public static String convert2(String date) {
		
		if(date.length()!=8)
		{
			System.out.println("Enter correct format");
			return null;
		}

		String modified="";
		String n=""+date.charAt(2)+date.charAt(3);
		int mo= Integer.parseInt(n);
		String m="";
		switch(mo)
		{
		case 1: 
			m="jan";break;
		case 2: 
			m="feb";break;
		case 3: 
			m="mar";break;
		case 4: 
			m="apr";break;
		case 5:
			m="may";break;
		case 6:
			m="jun";break;
		case 7:
			m="jul";break;
		case 8:
			m="aug";break;
		case 9:
			m="sep";break;
		case 10:
			m="oct";break;
		case 11:
			m="nov";break;
		case 12:
			m="dec";break;
		default:
			System.out.println("Month Error");
			
		}
		
		modified=date.substring(0, 2)+" "+m+","+date.substring(4);
		
		return modified;
	}

}

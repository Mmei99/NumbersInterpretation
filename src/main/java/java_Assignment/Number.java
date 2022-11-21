package java_Assignment;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Number {

	
	private String Number;
	
	
	
	
	public Number(String str) {
		this.Number=str;
	}
	

	public String getNumber() {
		return Number;
	}

	public void setNumber(String str) {
		this.Number = str;
	}
	
	
	public static List<String> find_ambiguity(String string){
		
		List<String> items = Arrays.asList(string.trim().split("\\s+"));
		
		List<String> myList = new ArrayList<>();
		String[] arrOfStr = string.split(" ");
		

		int i = 0;
		int j = 0;
		while (i < items.size()) {
			
			String s="";
			String s1 ="";
			if((items.get(i).startsWith("20")||items.get(i).startsWith("30")||items.get(i).startsWith("40")||items.get(i).startsWith("50")||items.get(i).startsWith("60")||items.get(i).startsWith("70")||items.get(i).startsWith("80")||items.get(i).startsWith("90"))){
				System.out.println(1);	
				if(items.get(i+1).length()==1){
					
					for ( j=0;j<(i+1)-1;j++) {
						s+= arrOfStr[j];
					}
					s1=s;
					s1+=items.get(i).charAt(0);
					for ( j=(i);j<items.size();j++) {
						s+= arrOfStr[j];
					}
					for ( j=(i+1);j<items.size();j++) {
						s1+= arrOfStr[j];
					}
					
					myList.add(s);
					myList.add(s1);

				}
			}

			
			i++;			
				
			
        }
		
		i=0;
		j=0;
		while (i < items.size()) {
			
			String s="";
			String s1 ="";
			if(Integer.parseInt((items.get(i)))>12 && Integer.parseInt((items.get(i)))<100){
				System.out.println(1);	
				
					
					for ( j=0;j<(i+1)-1;j++) {
						s+= arrOfStr[j];
					}
					s1=s;
					s1+=items.get(i).charAt(0);
					s1+='0';
					s1+=items.get(i).charAt(1);
					for ( j=(i);j<items.size();j++) {
						s+= arrOfStr[j];
					}
					for ( j=(i+1);j<items.size();j++) {
						s1+= arrOfStr[j];
					}
					
					myList.add(s);
					myList.add(s1);

				
			}

			
			i++;			
				
			
        }

		
		return myList;
	}
	
		
		
	
	public static void is_number_valid(String string){

		String str_1=remove_spaces(string);
		int num=count_number(string);
		switch (num) {
			case 10:			
				if(str_1.startsWith("2")||str_1.startsWith("69")){
					System.out.println("phone number: VALID");
				}
				else{System.out.println("phone number: INVALID");}
			  break;
			case 14:
				if(str_1.startsWith("00302")||str_1.startsWith("003069")){
					System.out.println("phone number: VALID");
				}
				else{System.out.println("phone number: INVALID");}
			  break;
			default:
				System.out.println("phone number: INVALID too many numbers");
			  break;
			
		  }



	}
	

	public static boolean only_numbers(String string){
		char[] chars = string.toCharArray();
		
		for(char c : chars){
	         if(Character.isAlphabetic(c)){
	        	 return false;
	         }
		
	}
	
	return true;
		
	}


	public static boolean less_than_4(String string){
		char[] chars = string.toCharArray();
		
		int i=0;
		for(char c : chars){
			i++;
	         if(c == ' '){
	        	 i=0;
	        	 
	         }
	         if (i>3) {
	        	 return false;
				
			}
	         
		}
		
		
		
		return true;

	}
	
	public static String remove_spaces(String string){
		
		
		return (string.replaceAll("\\s+",""));
		
		
	

	}
	
	public static int count_number(String string){
		String str=remove_spaces(string);
		System.out.println(str);
		int count=0;
		for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
		return (count);
		
		
	

	}

	

	
	public static void main(String[] args) {
		
		
		String str="2 10 6 9 30 6 6 4";
		
		List<String> items = find_ambiguity(str);
		int i;
		
		for (i = 0; i < items.size(); i++) {

			is_number_valid(items.get(i));
		}
		
		


		
		
		
		
	}
}

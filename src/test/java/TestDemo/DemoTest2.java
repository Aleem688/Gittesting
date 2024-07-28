package TestDemo;

import java.util.HashSet;

public class DemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String str="my name is arshad my arshad";
		    
		    //occurence of each word
		 String str2[]  = str.split(" ");
		 
		 HashSet<String> hs=new HashSet<>();
		 
		 for (int i = 0; i < str2.length; i++) {
			 
			 hs.add( str2[i]);
			
		}
		 for(String m:hs)
		 {
			 int count=0;
			 for (int i = 0; i < str2.length; i++) {
				 
				 if(m.equalsIgnoreCase(str2[i]))
				 {
					 count++;
				 }
				
			}
			 System.out.println(m+"occurence"+count);
		 }
	}

	}


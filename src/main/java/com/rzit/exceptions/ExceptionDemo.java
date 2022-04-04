package com.rzit.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Ranjith on 7/7/2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //NoClassDefFoundError error comes when new
        //ClassNotFoundException exception comes when Class.forName("")
    	
   	
    	String s1= "a";
    	String s2 = null;
    	try {
    	if(s2.equals(s1)) {
    		System.out.println("both same");
    	} else {
    		System.out.println("Not same");
    	}
    	} catch (Exception e) {
			// TODO: handle exception
    		System.out.println("Handled exception  ");
		}
    	
        File f = new File("");
       // try {
           // FileInputStream stream = new FileInputStream(f);
        /*} catch (FileNotFoundException e) {
          System.out.println("Specified file not found reason "+ e.getMessage());
        } catch (Exception e) {
        	System.out.println("Exception ....");
        }*/
    }
}

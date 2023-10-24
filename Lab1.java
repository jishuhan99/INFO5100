package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {
        /*
         * Initiate two integer arrays, x, and y, each containing 5 numbers.
         Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
         Organize a nice-looking output to the terminal that looks like the following:
         Array x = { array x values here separated by coma }

         Array y = { array y values here separated by coma }

         Array z = x + y = { array z values here separated by coma }
         */

       
       
       int[] x = {1, 2, 3, 4, 5};
       int[] y = {10, 11, 12, 13, 14};
       int[] z = new int[5];
       for (int i = 0; i < 5; i++) {
           z[i] = Math.max(x[i], y[i]);
           System.out.println(z[i]);
       }
       


 
  
        String resultx = "Array x ={";
        for (int i = 0; i < x.length; i++) {
          if (i == x.length - 1) {
            resultx = resultx+x[i];
            
          } else {
            resultx = resultx+x[i]+",";
          }

       } 
       resultx = resultx+"}";
       System.out.println(resultx);


       String resulty = "Array y ={";
        for (int i = 0; i < y.length; i++) {
          if (i == y.length - 1) {
            resulty = resulty+y[i];
            
          } else {
            resulty = resulty+y[i]+",";
          }

       } 
       resulty = resulty+"}";
       System.out.println(resulty);
  



       String resultz = "Array z=x+y ={";
        for (int i = 0; i < z.length; i++) {
          if (i == z.length - 1) {
            resultz = resultz+z[i];
            
          } else {
            resultz = resultz+z[i]+",";
          }

       } 
       resultz = resultz+"}";
       System.out.println(resultz);


    





          /*Initiate an ArrayList that contain 5 names
          Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, 
        but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
       Organize a nice-looking output to the terminal that looks like the following:
       Names = { list of names here separated by coma }

         Names (switched) = { list of names with switched first and last letters here separated by coma } */
         
       
         ArrayList<String> names = new ArrayList<>();
         names.add("Steven");
         names.add("Sharon");
         names.add("Mike");
         names.add("Kate");
         names.add("Ella");

         ArrayList<String> switchedNames = new ArrayList<>();
 
      
         for (String name : names) {
             char firstLetter = name.charAt(0);
             char lastLetter = name.charAt(name.length() - 1);
             String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
             switchedNames.add(switchedName);
         }


         System.out.print("Names = {");
         for (int i = 0; i < names.size(); i++) {
          if (i < names.size() - 1) {
            System.out.print(" " + names.get(i) + ","); 
          } else {
            System.out.print(" " + names.get(i) +  "");
          }
         }
         System.out.println("}");
 
         
         System.out.print("Names (switched) = {");
         for (int i = 0; i < switchedNames.size(); i++) {
          if (i < switchedNames.size() - 1) {
            System.out.print(" " + switchedNames.get(i) +  ",");
          } else {
            System.out.print(" " + switchedNames.get(i) +  "");
          }
             
         }
         System.out.println("}");
     


    }
}

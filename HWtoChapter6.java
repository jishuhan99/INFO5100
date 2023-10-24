package edu.neu.mgen;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class HWtoChapter6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalTime startTime = LocalTime.now();
        System.out.println("Enter any word:");
        String word = sc.next(); 


        if (word == "") {
            System.out.println("You did not enter any word");
            
        } else {
            if (word.length()<= 5) {
                 LocalTime endTime = LocalTime.now();
                 Duration gap = Duration.between(startTime,endTime);
                 long timeGap = gap.toMillis()/1000;  

                System.out.println("Your word is "+word);
                System.out.println("It is a short word");
                System.out.println("The length of the word is "+word.length());
                System.out.println("Your reaction time is "+ timeGap +" seconds");

                
            } else if(word.length()>5 && word.length()<10){
                LocalTime endTime = LocalTime.now();
                 Duration gap = Duration.between(startTime,endTime);
                 long timeGap = gap.toMillis()/1000;  

                System.out.println("Your word is "+word);
                System.out.println("It is a medium word");
                System.out.println("The length of the word is "+word.length());
                System.out.println("Your reaction time is "+ timeGap +" seconds");
                
            }else if(word.length()>=10){
                LocalTime endTime = LocalTime.now();
                 Duration gap = Duration.between(startTime,endTime);
                 long timeGap = gap.toMillis()/1000;  

                System.out.println("Your word is "+word);
                System.out.println("It is a long word");
                System.out.println("The length of the word is "+word.length());
                System.out.println("Your reaction time is "+ timeGap +" seconds");
            }
            
        }

    }
}

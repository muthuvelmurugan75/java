package com.Contacts.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guess_game {
	  public static void main(String args[])throws IOException
	    {
	        int b=0; // to add the first numbers of each list of numbers in which the player's number is present, so as to arrive at the original number that the user entered in the beginning;
	        int infinity=1; // used to keep the game running forever unless the player decides to end it;
	        String checker=""; // to check if the user wants to keep playing this game or wants to exit;
	        String a=""; // accepting the first input from the player (Yes or No);
	        String c=""; // accepting the second input from the player (Yes or No);
	        String d=""; // accepting the third input from the player (Yes or No);
	        String e=""; // accepting the fourth input from the player (Yes or No);
	        String f=""; // accepting the fifth input from the player (Yes or No);
	        String g=""; // accepting the sixth input from the player (Yes or No);
	        String h=""; // accepting the seventh input from the player (Yes or No);

	        /* After referring to all the comments mentioned above,
	         * you must be able to understand the working of this program as it is very easy.
	         * If you find it complicated,
	         * feel free to visit www.theadarshmehta.in
	         * and contact The Adarsh Mehta.
	         * Have fun!
	         */

	        InputStreamReader isr=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(isr);
	        while(infinity>0)
	        {
	            b=0;
	            // This variable has been given its default value once again to avoid any issues;
	            System.out.println("Yo!!!");
	            System.out.println("Here's a Cool Number Trick which tells you which number you have selected out of a hundred numbers!!!");
	            System.out.println("");
	            System.out.println("####################");
	            System.out.println("");
	            System.out.println("INSTRUCTIONS:");
	            System.out.println("You will be Asked 7 'Yes-No' Questions.");
	            System.out.println("If your Answer is Yes, type 1 or Yes.");
	            System.out.println("And If your Answer is No, type 0 or No.");
	            System.out.println("Please do not enter any other input or else it might cause some unexpected errors.");
	            System.out.println("");
	            System.out.println("####################");
	            System.out.println("");
	            System.out.println("Choose a Number Between 1 and 99 and keep it in your mind.");
	            System.out.println("");
	            System.out.println("Below is a list of numbers. Is your number here?");
	            System.out.println("2,   3,   6,   7,   10,");
	            System.out.println("11,  14,  15,  18,  19,");
	            System.out.println("22,  23,  26,  27,  30,");
	            System.out.println("31,  34,  35,  38,  39,");
	            System.out.println("42,  43,  46,  47,  50,");
	            System.out.println("51,  54,  55,  58,  59,");
	            System.out.println("62,  63,  66,  67,  70,");
	            System.out.println("71,  74,  75,  78,  79,");
	            System.out.println("82,  83,  86,  87,  90,");
	            System.out.println("91,  94,  95,  98,  99,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            a=br.readLine();
	            if(a.equalsIgnoreCase("Yes")||a.equalsIgnoreCase("Yes.")||a.equals("1")||a.equals("1.")||a.equalsIgnoreCase(" Yes")||a.equalsIgnoreCase(" Yes.")||a.equalsIgnoreCase("Yes ")||a.equalsIgnoreCase("Yes. ")||a.equals(" 1")||a.equals(" 1.")||a.equals("1 ")||a.equals("1. "))
	            {
	                b=b+2;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is your number here?");
	            System.out.println("4,  5,  6,  7,  12,  13,  14,");
	            System.out.println("15,  20,  21,  22,  23,  28,  29,");
	            System.out.println("30,  31,  36,  37,  38,  39,  44,");
	            System.out.println("45,  46,  47,  52,  53,  54,  55,");
	            System.out.println("60,  61,  62,  63,  68,  69,  70,");
	            System.out.println("71,  76, 77,  78,  79,  84,  85,");
	            System.out.println("86,  87,  92,  93,  94,  95,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            c=br.readLine();
	            if(c.equalsIgnoreCase("Yes")||c.equalsIgnoreCase("Yes.")||c.equals("1")||c.equals("1.")||c.equalsIgnoreCase(" Yes")||c.equalsIgnoreCase(" Yes.")||c.equalsIgnoreCase("Yes ")||c.equalsIgnoreCase("Yes. ")||c.equals(" 1")||c.equals(" 1.")||c.equals("1 ")||c.equals("1. "))
	            {
	                b=b+4;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is Your Number Here?");
	            System.out.println("1,  3,  5,  7,  9,");
	            System.out.println("11,  13,  15,  17,  19,");
	            System.out.println("21,  23,  25,  27,  29,");
	            System.out.println("31,  33,  35,  37,  39,");
	            System.out.println("41,  43,  45,  47,  49,");
	            System.out.println("51,  53,  55,  57,  59,");
	            System.out.println("61,  63,  65,  67,  69,");
	            System.out.println("71,  73,  75,  77,  79,");
	            System.out.println("81,  83,  85,  87,  89,");
	            System.out.println("91,  93,  95,  97,  99,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            d=br.readLine();
	            if(d.equalsIgnoreCase("Yes")||d.equalsIgnoreCase("Yes.")||d.equals("1")||d.equals("1.")||d.equalsIgnoreCase(" Yes")||d.equalsIgnoreCase(" Yes.")||d.equalsIgnoreCase("Yes ")||d.equalsIgnoreCase("Yes. ")||d.equals(" 1")||d.equals(" 1.")||d.equals("1 ")||d.equals("1. "))
	            {
	                b=b+1;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is Your Number Here?");
	            System.out.println("16,  17,  18,  19,");
	            System.out.println("20,  21,  22,  23,");
	            System.out.println("24,  25,  26,  27,");
	            System.out.println("28,  29,  30,  31,");
	            System.out.println("48,  49,  50,  51,");
	            System.out.println("52,  53,  54,  55,");
	            System.out.println("56,  57,  58,  59,");
	            System.out.println("60,  61,  62,  63,");
	            System.out.println("80,  81,  82,  83,");
	            System.out.println("84,  85,  86,  87,");
	            System.out.println("88,  89,  90,  91,");
	            System.out.println("92,  93,  94,  95,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            e=br.readLine();
	            if(e.equalsIgnoreCase("Yes")||e.equalsIgnoreCase("Yes.")||e.equals("1")||e.equals("1.")||e.equalsIgnoreCase(" Yes")||e.equalsIgnoreCase(" Yes.")||e.equalsIgnoreCase("Yes ")||e.equalsIgnoreCase("Yes. ")||e.equals(" 1")||e.equals(" 1.")||e.equals("1 ")||e.equals("1. "))
	            {
	                b=b+16;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is Your Number Here?");
	            System.out.println("8,  9,  10,  11,");
	            System.out.println("12,  13,  14,  15,");
	            System.out.println("24,  25,  26,  27,");
	            System.out.println("28,  29,  30,  31,");
	            System.out.println("40,  41,  42,  43,");
	            System.out.println("44,  45,  46,  47,");
	            System.out.println("56,  57,  58,  59,");
	            System.out.println("60,  61,  62,  63,");
	            System.out.println("72,  73,  74,  75,");
	            System.out.println("76,  77,  78,  79,");
	            System.out.println("88,  89,  90,  91,");
	            System.out.println("92,  93,  94,  95,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            f=br.readLine();
	            if(f.equalsIgnoreCase("Yes")||f.equalsIgnoreCase("Yes.")||f.equals("1")||f.equals("1.")||f.equalsIgnoreCase(" Yes")||f.equalsIgnoreCase(" Yes.")||f.equalsIgnoreCase("Yes ")||f.equalsIgnoreCase("Yes. ")||f.equals(" 1")||f.equals(" 1.")||f.equals("1 ")||f.equals("1. "))
	            {
	                b=b+8;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is Your Number Here?");
	            System.out.println("32,  33,  34,  35,  36,  37,");
	            System.out.println("38,  39,  40,  41,  42,  43,");
	            System.out.println("44,  45,  46,  47,  48,  49,");
	            System.out.println("50,  51,  52,  53,  54,  55,");
	            System.out.println("56,  57,  58,  59,  60,  61,");
	            System.out.println("62,  63,  96,  97,  98,  99,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            g=br.readLine();
	            if(g.equalsIgnoreCase("Yes")||g.equalsIgnoreCase("Yes.")||g.equals("1")||g.equals("1.")||g.equalsIgnoreCase(" Yes")||g.equalsIgnoreCase(" Yes.")||g.equalsIgnoreCase("Yes ")||g.equalsIgnoreCase("Yes. ")||g.equals(" 1")||g.equals(" 1.")||g.equals("1 ")||g.equals("1. "))
	            {
	                b=b+32;
	            }
	            else
	            {
	                b=b;
	            }
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("Is Your Number Here?");
	            System.out.println("64,  65,  66,  67,  68,  69,");
	            System.out.println("70,  71,  72,  73,  74,  75,");
	            System.out.println("76,  77,  78,  79,  80,  81,");
	            System.out.println("82,  83,  84,  85,  86,  87,");
	            System.out.println("88,  89,  90,  91,  92,  93,");
	            System.out.println("94,  95,  96,  97,  98,  99,");
	            System.out.println("Type Your Answer");
	            System.out.println("");
	            h=br.readLine();
	            if(h.equalsIgnoreCase("Yes")||h.equalsIgnoreCase("Yes.")||h.equals("1")||h.equals("1.")||h.equalsIgnoreCase(" Yes")||h.equalsIgnoreCase(" Yes.")||h.equalsIgnoreCase("Yes ")||h.equalsIgnoreCase("Yes. ")||h.equals(" 1")||h.equals(" 1.")||h.equals("1 ")||h.equals("1. "))
	            {
	                b=b+64;
	            }
	            else
	            {
	                b=b;
	            }
	            if(b<100)
	            {
	                System.out.println("");
	                System.out.println("******************");
	                System.out.println("******************");
	                System.out.println("Your number is "+b);
	                System.out.println("******************");
	                System.out.println("******************");
	                System.out.println("");
	                System.out.println("If you wish to end this game, type 'exit' and hit enter, else, press any other key and hit enter...");
	                checker=br.readLine();
	                if(checker.equalsIgnoreCase("Exit")||checker.equalsIgnoreCase(" Exit")||checker.equalsIgnoreCase("Exit ")||checker.equalsIgnoreCase("Exit.")||checker.equalsIgnoreCase(" Exit.")||checker.equalsIgnoreCase("Exit. "))
	                {
	                    infinity=1;
	                    System.out.print('\f');
	                    System.out.println("Good Bye!");
	                    break;
	                }
	                else
	                {
	                    System.out.print('\f');
	                }

	            }
	            else
	            {
	                System.out.println("");
	                System.out.println("You did not follow the instructions properly. :P");
	                System.out.println("You tried to be oversmart. :P");
	                System.out.println("");
	                System.out.println("If you wish to end this game, type 'exit' and hit enter, else, press any other key and hit enter...");
	                checker=br.readLine();
	                if(checker.equalsIgnoreCase("Exit")||checker.equalsIgnoreCase(" Exit")||checker.equalsIgnoreCase("Exit ")||checker.equalsIgnoreCase("Exit.")||checker.equalsIgnoreCase(" Exit.")||checker.equalsIgnoreCase("Exit. "))
	                {
	                    infinity=1;
	                    System.out.print('\f');
	                    System.out.println("Good Bye!");
	                    break;
	                }
	                else
	                {
	                    System.out.print('\f');
	                }

	            }
	        }
	    }

	

}

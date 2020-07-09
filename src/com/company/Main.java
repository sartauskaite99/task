package com.company;

import java.util.Scanner;

public class Main {
    public void pi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a second word");
        String str = scanner.nextLine();

        if(str.equals("pi")|| str.equals("PI") || str.equals("Pi")){
            System.out.println("3.14\n");
        }
    }
    public void duplicate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String str = scanner.nextLine();
        int count = 0;

        System.out.println("Duplicate characters in a given string: \n");
        //Counts each character present in the string

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j-1) == str.charAt(j) ) {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    str = str.substring(0,j-1)+'0' +str.substring(j+1,str.length());
                }
            }
            //A character is considered as duplicate if count is greater than 1
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) != '0')
                System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
	 Main main = new Main();
	 main.duplicate();
	 main.pi();
    }
}

    

import java.util.Scanner;

public class switch_case_L18 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextByte();


        switch (age) {
            case 18:
                System.out.println("your are able to give a vote now but its a different case that is does not matter");
                break;
            case 24:
                System.out.println("your can get a wife now well done my son");
                break;
            case 34:
                System.out.println("i dont know what to write so why are you till alive");
                break;
            default:
                System.out.println("just die don't do any thing");
        }


        /*
        if (age>54){
            System.out.println("your are a experienced man");

        }
        else if (age>45){
            System.out.println("your are a Semi-experienced man");

        }
        else  if(age>=35){
            System.out.println("your are a Less-experienced man");

        }
        else {
            System.out.println("your are not a experienced man");

        }
        */


    }

}

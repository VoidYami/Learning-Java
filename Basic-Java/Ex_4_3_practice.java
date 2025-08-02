    

import java.util.Scanner;

public class Ex_4_3_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url");
        String url = sc.next();

        if (url.endsWith("com")){
            System.out.println("This is a commercial site");
        }
        else if (url.endsWith("org")) {
            System.out.println("This is a Organisation site");
        }
        else if (url.endsWith("in")) {
            System.out.println("This is a indian website");
        }
        else {
            System.out.println("google it i don't know");
        }

    }
}

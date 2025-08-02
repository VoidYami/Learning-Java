    

import java.util.Locale;

public class Ex_3_1 {

    public static void main(String[] args) {
        String name  = "darkDevil";
        System.out.println(name.toUpperCase(Locale.ROOT));



    /// / ex - no_2

//    String word = "   dark is Devil";
//        System.out.println( word.trim());
        String word = "to Upper Case";
        word = word.replace(" ", "_");
        System.out.println(word);




        /// / ex - no_3

//        String name = "yash";
//        String letter = "Dear <|name|>,thanks a lot";
//        System.out.println(letter);
//        System.out.println(letter.replace("<|name|>",name));

        /// / ex - no_4
        System.out.println("Dear Yash \n Your doing well just dont lose hope \nThank You");

        /// / ex - no_5
        String mystring = "your doing well  don't lose it";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));




    }
}

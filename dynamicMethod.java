

public class dynamicMethod {



        static class Phone {
            public void greet() {
                System.out.println("good morning to everyone");
            }

            public void on() {
                System.out.println("Turning on Phone");
            }
        }

        static class SmartPhone extends Phone {

            public void swagat() {
                System.out.println("swagat hai");
            }

            public void on() {
                System.out.println("Turning on SmartPhone");
            }


        }


    public static void main(String[] args) {
            Phone obj = new SmartPhone();
            obj.on();
           

    }
}

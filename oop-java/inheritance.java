   

public class inheritance {

    static class animal{
        public void leg(){
            System.out.println("it has four leg");
        }
        public void eye(){
            System.out.println("it have two eye");
        }
    }

    static class Dog extends animal{
        public void sound(){
            System.out.println("bark");
        }

    }

    static class base {
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void printMe(){
            System.out.println("constructor");
        }
    }

     static class derived extends base {
        int y;


         public int getY() {
             return y;
         }

         public void setY(int y) {
             this.y = y;
         }
     }

    public static void main(String[] args) {
       derived b = new derived();
//        bs.setX(5);
//        System.out.println(bs.getX());
//
//        bs.setY(8);
//        System.out.println(bs.getY());

        Dog Mydog= new Dog();
        Mydog.sound();
        Mydog.leg();



    }
}

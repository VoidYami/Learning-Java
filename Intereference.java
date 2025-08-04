

    interface Bycycle {
        int a = 30;
        void applyBreak(int increment);
        void speedUp(int decrement);
    
    }

    interface bycycleHorn {
        void blowHorn();
    }

    class Cycle implements Bycycle, bycycleHorn{

        public void Horn (){
            System.out.println("pe peee epepep");

        }
        public void applyBreak(int increment){
                    System.out.println("apply break");
                }
        public void speedUp(int decrement){
                    System.out.println("accelarate speed");
                }

               public void blowHorn(){
                    System.out.println("main hoo na");
                }
    }
    public class Intereference {
    public static void main(String[] args) {
        Cycle Mycycle = new Cycle();

        Mycycle.applyBreak(5);
        Mycycle.blowHorn();
        Mycycle.Horn();
        
    }
    
}


    interface camera{
        void takeSnap();
        void recordVideo();
        private void greet(){
            System.out.println("good morning");
        }
       default void recordIn4k(){
        greet();
        System.out.println("record in 4k");
       };
    }

    interface wifi{
        String[] getNetwork();
        void connectToNetwork(String network);
    }



     class cellPhone{
        
        public void callNumber(int phoneNumber){
            System.out.println("calling"+phoneNumber);
        }
        void pickcall(){
            System.out.println();
        }
        public void takeSnap(){
            System.out.println("take a snap...");
        }
     }

     class SmartPhone extends cellPhone implements wifi , camera{

        @Override
        public void recordVideo() {
            System.out.println("recording video..");
        }

        // public void recordIn4k(){
        //     System.out.println("take snap and record it in 4k");
        // }

        @Override
        public String[] getNetwork() {
            System.out.println("getting network List...");
            String[] networkList = {"dat" , "paaa", "anjali"};
            return networkList;
           
        }

        @Override
        public void connectToNetwork(String network) {
            System.out.println("connecting" +network);
        } 

     }
     public class default_method {
    public static void main(String[] args) {
        // cellPhone ph = new cellPhone();
        SmartPhone sm = new SmartPhone();
        // sm.getNetwork();
        sm.recordIn4k();
        String [] ar = sm.getNetwork();
        for (String item : ar) {
            System.out.println(item);
            
        }
        
        
    }
}

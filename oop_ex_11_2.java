abstract class TelePhone2{
    void pick(){
        System.out.println("picking call..");
    }
    void lift(){
        System.out.println("Lifting phone..");
    }

    abstract void disconnect();
}
class SmartPhone3 extends TelePhone2{
    @Override
    void disconnect() {
        System.out.println("disconnecting...");
    }

    void camera(){
        System.out.println("taking photo");
    }
}

public class oop_ex_11_2 {
    public static void main(String[] args) {
        TelePhone2 myTelePhone = new SmartPhone3();
        myTelePhone.disconnect();
        myTelePhone.pick();
        
    }
}

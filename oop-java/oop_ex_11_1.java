 interface basicAnimal{
    void eat();
    void sleep();
 }

 class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("bitting..");
    }

 }

 class humans extends Monkey implements basicAnimal{
    public void eat(){
        System.out.println("eating...");

    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    void greed(){
        System.out.println("greed");
    }

 }

public class oop_ex_11_1 {
    public static void main(String[] args) {
        // humans hm = new humans();
        // hm.bite();
        // hm.eat();
        // hm.jump();
        
    
    Monkey m = new humans();
    m.bite();
    
    }
    
}

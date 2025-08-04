 abstract class Pen{
   abstract void write();

   abstract void refil();
       
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("writing...");
    }

   public void refil(){
      System.out.println("refilling..");
   }

   void ChangeNib(){
    System.out.println("changing nib...");
   }


}

public class oop_ex_11 {
    public static void main(String[] args) {
        FountainPen fPen = new FountainPen();
        fPen.ChangeNib();
        fPen.refil();
        
    }
    
}

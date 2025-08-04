

public class constructor_inheritance {

    static class base{

        base(){
            System.out.println("we are calling from 911");
        }

        base(int a){
            System.out.println("we are calling from 911 i repeat :" +a);
        }

    }

    static class deriverd extends base{


        deriverd(){
            super(911);
            System.out.println("we are not calling from 911 'YASH........' ");
        }
        deriverd(int x,int y){
            System.out.println("we are calling overloaded derived Yash...");
        }
    }

    static class childDerived extends deriverd{
        childDerived(){
            super(0,5);
            System.out.println("i am a child of derived class ");
        }
        childDerived(int a){
            System.out.println("you made a mistake");

        }

    }

   static class parent{
       parent(String name){
           System.out.println("Parent constructor " + name);
       }
   }

   static class child extends parent{
       child(String name){
           super(name);
           System.out.println("child constructor " + name);
       }

   }

    public static void main(String[] args) {
//       child c = new child("pankaj");

        childDerived cD= new childDerived(5);

    }
}

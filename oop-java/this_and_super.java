   

//   class Ekclass{
//       int a;
//
//       public int getA() {
//           return a;
//       }
//
//       Ekclass(int v ){
//           this.a = v;
//
//
//       }
//       public int returnone(){
//           return 1;
//       }
//
//   }
//
//   class doClass extends Ekclass{
//       doClass(int c){
//           super(55);
//           System.out.println("i am a constuctor");
//       }
//   }

  class person{
    String name;
    person(String name){
        this.name=name;
        System.out.println("person constuctor : Name =" +this.name);
    }
  }
  class student extends person{
      int rollNo;

      student(String name ,int rollNo){
          super(name);

          this.rollNo = rollNo;
          System.out.println("student constructor : Roll Number =" + rollNo);
      }
  }

public class this_and_super {
    public static void main(String[] args) {
//       Ekclass Ek = new Ekclass(5);
//        System.out.println(Ek.getA());
//
//        doClass dodo = new doClass(59);

        student s1 =new student("pankaj" ,32);
    }
}

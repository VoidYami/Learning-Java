   

  class A{
      public int dark(){
          return 32;
      }
      public void meth2(){
          System.out.println("method 2 of class A");
      }
  }
  class B extends A{
      @Override
      public void meth2(){
          System.out.println("method 3 of class B");
      }

      public void meth3(){
          System.out.println("method 3 of class B");
      }

  }

public class method_overloading {

    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}

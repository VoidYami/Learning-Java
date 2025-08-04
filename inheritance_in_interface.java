interface simple{
    void meth1();
    void meth2();
}
interface child extends simple{
   
    void meth3();
    void meth4();

} 

class mysimple implements child{
    public void meth3(){
        System.out.println("this is meth3");
    }
    public void meth4(){
        System.out.println("this is meth4");
    }public void meth1(){
        System.out.println("this is meth1");
    }
    public void meth2(){
        System.out.println("this is meth2");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        mysimple dark = new mysimple();
        dark.meth2();
        
    }
}

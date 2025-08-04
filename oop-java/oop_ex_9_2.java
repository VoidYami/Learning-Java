   

public class oop_ex_9_2 {



 static class cylinder{
    private int radius;
     private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

     public double surfaceArea(){
         return 2*3.14*radius*radius+2*3.14*radius*height;
     }

     public double volume(){
         return 3.14 *radius *radius*height;
     }
}

    public static void main(String[] args) {

    cylinder mydark = new cylinder(5,6);

        double Area = mydark.surfaceArea();
        double volume = mydark.volume();
        System.out.println(Area);
        System.out.println(volume);



    }
}

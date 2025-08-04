package com.dark.Ex_shape;

public class Ex_Cylinder extends Ex_shape{

   
    public Ex_Cylinder(int dia1){
     super(dia1 , -1);
 
    }
    public double area(){
     return (2* Math.PI * this.dia1 * this.dia2)+(2*Math.PI *this.dia1 * this.dia1);
    }
    
}

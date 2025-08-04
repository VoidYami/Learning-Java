package com.dark.Ex_shape;

public class Ex_Circle extends Ex_shape{

   
    public Ex_Circle(int dia1){
     super(dia1 , -1);
 
    }
    public double area(){
     return (Math.PI * this.dia1);
    }
    
}

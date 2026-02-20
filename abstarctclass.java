//example 1
// abstract class bank{
//     abstract int getintrest();
// }
// class sbi extends bank{
//     public int getintrest(){
//         return 7;
//     }}
// class icici extends bank{
//     public int getintrest(){
//         return 8;
//     }}
// class axis extends bank{
//     public int getintrest(){
//         return 9;
//     }}

// public class abstarctclass{
//     public static void main(String[] args){
//         bank b;
//         b=new sbi();
//         System.out.println("sbi intrsest is"+b.getintrest()+"%");
//         b=new icici();
//         System.out.println("icici intrest is"+b.getintrest()+"%");
//         b=new axis();
//         System.out.println("axis intrestt is"+b.getintrest()+"%");

//     }
// }

//example 2

import java.util.Scanner;
abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        int r;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        r=inp.nextInt();
        double circle_area=Math.PI*r*r;
        System.out.println("the area of circle is "+circle_area);
        inp.close();
        


    }
}
class triangle extends shape{
    void area(){
        int b,h;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the base value of traingle ");
        b=inp.nextInt();
        System.out.println("enter the height value of traingle ");
        h=inp.nextInt();
        double triangle_area=0.5*b*h;
        System.out.println("the area of triangle is "+triangle_area);
        inp.close();


    }
}
public class abstarctclass{
    public static void main(String[] args){
        shape s=new circle();
        s.area();
        shape s1=new triangle();
        s1.area();

    }
}
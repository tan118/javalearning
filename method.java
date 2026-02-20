package javalearning;
import java.util.Scanner;
public class method{
    String unm;
    method(){

        System.out.println("this is default constructor");
        
    }
    method(String name1){
        unm=name1;
    }
    public static void add(int n1,int n2){
        System.out.println("the addition is "+(n1+n2));
    }
    public static void sub(int n1,int n2){
        System.out.println("the sub is "+(n1-n2));
    }
    public static int mul(int n1,int n2){
        return n1*n2;
    }
            
    public static int div(int n1,int n2){
        return n1/n2;
    }
    public void display(){
        System.out.println("the name is "+unm);
    }
            
        public static void main(String[] args){
            int num1,num2;
            Scanner inp=new Scanner(System.in);
            System.out.println("enter first no");
            num1=inp.nextInt();
            System.out.println("enter second no");
            num2=inp.nextInt();
            method s1=new method();
            method s2=new method("tanu");
            s2.display();
            s1.display();
                add(num1,num2);
                sub(num1,num2);

            
            int result = mul(num1,num2);
            System.out.println("the mul is " + result);
            result = div(num1,num2);
            System.out.println("the div is " + result);
            inp.close();



            



    //           method overloading same method name but parameters can change 
    //      String unm;
    // method(){

    //     System.out.println("this is default constructor");
        
    // }
    // method(String name1){
    //     unm=name1;
    // }
    // public static void add(int n1,int n2){
    //     System.out.println("the addition is "+(n1+n2));
    // }
    // public static void add(int n1,int n2,int n3){
    //     System.out.println("the addition is "+(n1+n3+n2));
    // }
    // public static int add(int n1,int n2,int n3,int n4){
    //     return n1+n2+n3+n4;
    // }
            
    // public void display(){
    //     System.out.println("the name is "+unm);
    // }
            
    //     public static void main(String[] args){
    //         int n1,n2,n3,n4;
    //         Scanner inp=new Scanner(System.in);
    //         System.out.println("enter first no");
    //         n1=inp.nextInt();
    //         System.out.println("enter second no");
    //         n2=inp.nextInt();
    //         System.out.println("enter third no");
    //         n3=inp.nextInt();
    //         System.out.println("enter fourth no");
    //         n4=inp.nextInt();
    //         method s1=new method();
    //         method s2=new method("tanu");
    //         s2.display();
    //         s1.display();
    //         add(n1,n2);
    //         add(n1,n2,n3);
    //         int result=add(n1,n2,n3,n4);
    //         System.out.println("the addition is"+result);
    //         inp.close();






              // method overriding same method name and same parameters but different class and diffrent implementation

//     method(){
//         System.out.println("this is default constructor");
//     }
//     public static int add(int n1,int n2){
//         return n1+n2;
//     }
//     public static int add(int n1,int n2,int n3){
//         return n1+n2+n3;
//     }
//     public static int add(int n1,int n2,float f1){
//         return n1+n2+ (int)f1;
//     }
//     public static void main(String[] args){
//         int n1,n2,n3;
//         float f1;
//         method2 m=new method2();
//         m.display();
//         Scanner inp=new Scanner(System.in);
//         System.out.println("choose from the options");
//         System.out.println("1.add two no");
//         System.out.println("2. add three no");
//         System.out.println("3.add int and float values ");
//         int opt=inp.nextInt();
//         int result;
//         if(opt==1){
//             System.out.println("enter first no");
//             n1=inp.nextInt();
//             System.out.println("enter second no");
//             n2=inp.nextInt();
//             result=add(n1,n2);
//             System.out.println("the addition is "+result);

//         }
//         else if(opt==2){
//             System.out.println("enter first no");
//             n1=inp.nextInt();
//             System.out.println("enter second no");
//             n2=inp.nextInt();
//             System.out.println("enter third no");
//             n3=inp.nextInt();
//             result=add(n1,n2,n3);
//             System.out.println("the additon is"+result);
//         }
//         else if(opt==3){
//             System.out.println("enter first no");
//             n1=inp.nextInt();
//             System.out.println("enter second no");
//             n2=inp.nextInt();
//             System.out.println("enter third no");
//             f1=inp.nextFloat();
//             result=add(n1,n2,f1);
//             System.out.println("the additon is"+result);
//             inp.close();
//         }
//     }
// }

// class method2 extends method{
//     void display(){
//         System.out.println("this is method overriding");

    }
}


            
            
               



         

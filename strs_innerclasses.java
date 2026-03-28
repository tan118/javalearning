import java.util.Scanner;


public class strs_innerclasses {

    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);
        System.out.println("enter the first no :");
        int var1=inp.nextInt();
        System.out.println("enter the second no :");
        int var2=inp.nextInt();
        inp.close();
        System.out.println("before swapping the values (inside main),var1="+var1+" var2 ="+var2);
        swapfunc(var1,var2);
        System.out.println("after swapping the values (inside main),var1="+var1+" var2="+var2);


    }
    public static void swapfunc(int num1 ,int num2){
        System.out.println("befor swapping the values (Inside ),num1="+num1+"num2="+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping the values (Inside ),num1="+num1+"num2="+num2);

    }
}

     // comapring two strings

// ascii A=65 a=97
// package javalearning;
// import java.util.Scanner;
// public class strs_innerclasses {
//     public static void main (String[] args){
//         Scanner inp=new Scanner(System.in);
//         System.out.println("enter a string 1");
//         String varstr1=inp.next();
        
//         System.out.println("enter a string 2");
//         String varstr2=inp.next();
//         int com=varstr1.compareTo(varstr2);
//         if(com<0){
//             System.out.println("\""+varstr1+"\""+"is less than"+"\""varstr2+"\"");
//         }
//         else if(com==0){
//             System.out.println("\""+varstr1+"\""+"is equal to"+"\""varstr2+"\"");
//         }
//         else{
//             System.out.println("\""+varstr1+"\""+"is greater than"+"\""varstr2+"\"");
        
//     }
// }
// }

// public class strs_innerclasses {
//     public static void main (String[] args){Scanner inp=new Scanner(System.in);
//         System.out.println("enter a string 1");
//         String varstr1=inp.next();
        
//         System.out.println("enter a string 2");
//         String varstr2=inp.next();
//         CharSequence cal1="javaprogramming.com";
//         inp.close();
//         System.out.println("comparing varstr1 and cal1"+varstr1+ "and" +cal1+ ":" +varstr1.contentEquals(cal1));
//         System.out.println("comparing varstr2 and cal1"+varstr2+ "and" +cal1+ ":" +varstr2.contentEquals(cal1));
//     }

// }
    

// import java.util.Scanner;
// public class strs_innerclasses {
//     public static void main (String[] args){Scanner inp=new Scanner(System.in);
//         System.out.println("enter a string 1");
//         String varstr1=inp.nextLine();
        
//         System.out.println("enter the word u want to replace ");
//         CharSequence varstr2=inp.next();
//         String newstr=varstr1.replace(varstr2,"replaced");
//         inp.close();
//         System.out.println("original string"+varstr1);;
//         System.out.println("string after replacement "+newstr);
//     }

// }
    





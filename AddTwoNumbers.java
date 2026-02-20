// package javalearning;
// import java.util.Scanner;

// public class day1{
//     public static void main(String[] args){
    //         Scanner inp =new Scanner(System.in);
//         String fnm,lnm;
//         System.out.println("enter ur name ");
//         fnm=inp.next();
//         System.out.println("enter ur last name");
//         lnm=inp.next();
//         System.out.println("wlcome mr/ms"+fnm+" "+lnm);
//     }

// }
// public class day1{
    //     public static void main(String[] args){
        //         Scanner inp =new Scanner(System.in);
        //         int num1,num2,sum;
        //         System.out.println("enter num1");
        //         num1=inp.nextInt();
        //         System.out.println("enter num2");
        //         num2=inp.nextInt();
        //         sum=num1+num2;
        //         System.out.println("sum of numbers is "+sum);
        //     }
        
        // }
// package javalearning;
// public class day1{
//     public static void main (String[] args){
//         Boolean b=true;//true/false
//         byte b1=10;//-128-127
//         short s1=10000;//-32768-32767
//         long l1=10000000;//2^63
//         int n1=2888880;//-2^31
//         float f1=2.678f;
//         double d1=23.5765;
//         char c1='a';
//         System.out.println(b);
//         System.out.println(b1);
//         System.out.println(s1);
//         System.out.println(l1);
//         System.out.println(n1);
//         System.out.println(f1);
//         System.out.println(d1);
//         System.out.println(c1);



//     }

// }

// package javalearning;
// public class day1{
//     public static void main(String[] args){
//         int n1 = 20,n2=-10,n3=45,n4=4;
//         boolean b=true,b1=false;
//         int num1=20,num2=2,num3=40,res;
//         int n5=10;
//         System.out.println("post increment is:"+(n1++));
//         System.out.println("pre increment is:"+(++n1));
//         System.out.println("pre decrement is:"+(n1--));
//         System.out.println("pre decrement is:"+(--n1));
//         System.out.println("pre decrement is:"+(~n1));//-20-1=-21
//         System.out.println("pre decrement is:"+(~n2));//10-1=9
//         System.out.println("pre decrement is:"+((100+4)*3-(8/1)));// unles brackkets it follows bodmas 100+12-8 
//         System.out.println("pre decrement is:"+(n1+=1));


//     }
// }

// import javax.swing.*;
// import java.awt.event.*;
// public class AddTwoNumbers{
//     public static void main(String[] args){
//         JFrame f=new JFrame("ADDDTION FORM");
//         JLabel l=new JLabel("enter no 1");
//         l.setBounds(30,30,150,25);
//         JLabel l1=new JLabel("enter no2");
//         l1.setBounds(30,70,150,25);
//         JLabel l2=new JLabel("RESULT");
//         l2.setBounds(30,150,150,25);
//       //create text fields
//         JTextField t1=new JTextField();
//         t1.setBounds(180,30,100,25);
//         JTextField t2=new JTextField();
//         t2.setBounds(180,70,100,25);
//         JTextField t3= new JTextField();
//         t3.setBounds(180,150,100,25);
//         t3.setEditable(false);
//       //create buttons
//         JButton b=new JButton("add");
//         b.setBounds(100,110,80,30);
//         //button action
//         b.addActionListener(new ActionListener(){
//             public void actionPerformed(ActionEvent e){
//                 int a =Integer.parseInt(t1.getText());
//                 int b=Integer.parseInt(t2.getText());
//                 int sum=a+b;
//                 t3.setText(String.valueOf(sum));

//                         }
//         });
//         //add to screen finally
//         f.add(l);
//         f.add(l1);
//         f.add(l2);
//         f.add(t1);
//         f.add(t2);
//         f.add(t3);
//         f.add(b);

//         // Frame Settings
//         f.setSize(350, 250);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

// import java.util.Scannner;
// import javax.swing.*;
// import java.awt.event.*;

// public class loops{
//     public static void main(String[] args){
//         JFrame f1=new JFrame("calculator basics");
//         JLabel j1=new JLabel("enetr a no 1");
//         j1.setBounds(30,30,150,25);
//         JLabel j2=new JLabel("enetr a no 2");
//         j2.setBounds(30,70,150,25);
//         JLabel j3=new JLabel("operators");
//         j3.setBounds(30,110,150,25);
//         JLabel j4=new JLabel("Result");
//         j4.setBounds(30,190,150,25);
//         // text fields
//         JTextField t1=new JTextField();
//         t1.setBounds(180,30,100,25);
//         JTextField t2=new JTextField();
//         t2.setBounds(180,70,100,25);
//         JTextField t3=new JTextField();
//         t3.setBounds(180,70,100,25);
//         // combo box
//         String operators[]={"+","-","*","/"};
//         JComboBox<String> c1=new JComboBox<>(operators);
//         c1.setBounds(180,190,100,25);
        
//         // button
//         JButton b1 = new JButton("Result");
//         b1.addActionListner(new ActionListner(){
//             public void actionPerformed(ActionEvent e){
//                 int a = Integer.parseInt(t1.gettext());
//                 int b=Integer.parseInt(t2.gettext());
//                 String op =(String) c1.getSelectedItem();

//                 int result=0;
//                 if(op.equals("+")){
//                     result=a+b;
//                 else if(op.equals("-"))
//                     result=a-b;
//                 else if(op.equals("*"))
//                     result=a*b;
//                 else if(op.equals("/"))
//                     result=a/b;
//                 t3.setText(String.valueOf(result));

//                 }

//             });
        
//          // Add components
//         f1.add(j1);
//         f1.add(j2);
//         f1.add(j3);
//         f1.add(j4);
//         f1.add(t1);
//         f1.add(t2);
//         f1.add(t3);
//         f1.add(c1);
//         f1.add(b1);

//         // Frame settings
//         f1.setSize(350, 300);
//         f1.setLayout(null);
//         f1.setVisible(true);
//         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }




        


        
//     }
// }
        

import javax.swing.*;
import java.awt.event.*;

public class AddTwoNumbers {
    public static void main(String[] args) {

        JFrame f1 = new JFrame("Calculator Basics");

        // Labels
        JLabel j1 = new JLabel("Enter No 1");
        j1.setBounds(30, 30, 150, 25);

        JLabel j2 = new JLabel("Enter No 2");
        j2.setBounds(30, 70, 150, 25);

        JLabel j3 = new JLabel("Operator");
        j3.setBounds(30, 110, 150, 25);

        JLabel j4 = new JLabel("Result");
        j4.setBounds(30, 190, 150, 25);

        // Text fields
        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 100, 25);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 100, 25);

        JTextField t3 = new JTextField();
        t3.setBounds(180, 190, 100, 25);
        t3.setEditable(false);

        // Combo box (operators)
        String operators[] = { "+", "-", "*", "/" };
        JComboBox<String> c1 = new JComboBox<>(operators);
        c1.setBounds(180, 110, 100, 25);

        // Button
        JButton b1 = new JButton("Calculate");
        b1.setBounds(100, 150, 120, 30);

        // Button action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                String op = (String) c1.getSelectedItem();

                int result = 0;

                if (op.equals("+"))
                    result = a + b;
                else if (op.equals("-"))
                    result = a - b;
                else if (op.equals("*"))
                    result = a * b;
                else if (op.equals("/"))
                    result = a / b;

                t3.setText(String.valueOf(result));
            }
        });

        // Add components
        f1.add(j1);
        f1.add(j2);
        f1.add(j3);
        f1.add(j4);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(c1);
        f1.add(b1);

        // Frame settings
        f1.setSize(350, 300);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

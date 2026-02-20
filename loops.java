// package javalearning;
// public class loops{
//     public static void main(String[] args){
//         int num1=11;
//         while(num1<=10){
//             System.out.println(num1);
//             num1++;
//         // do{
//         //     System.out.println(num1);
//         //     num1++;
//         // }while(num1<=10);
//         }
//     }
// }

// package javalearning;
// import java.util.Scanner;
// public class loops{
//     public static void  main(String[] args){
        // Scanner inp=new Scanner(System.in);
        // System.out.println("enter first");
        // int num1=inp.nextInt();
        // System.out.println("enter last number");
        // int num2=inp.nextInt();
        // int sum=0;
        // int i=num1;
        // while(i<=num2){
        //     sum+=i;
        //     i++;
        // }
  
      // for(int i=num1;i<=num2;++i){
        //     sum+=i;
        // }

        // System.out.println("sum of numbers from" +num1+ " to "+num2+ " is "+sum);
        



// 

// 
// import javax.swing.*;
// import java.awt.event.*;

// public class loops {
//     public static void main(String[] args) {

//         JFrame f1 = new JFrame("Calculator Basics");

//         // Labels
//         JLabel j1 = new JLabel("Enter No 1");
//         j1.setBounds(30, 30, 150, 25);

//         JLabel j2 = new JLabel("Enter No 2");
//         j2.setBounds(30, 70, 150, 25);

//         JLabel j3 = new JLabel("Operator");
//         j3.setBounds(30, 110, 150, 25);

//         JLabel j4 = new JLabel("Result");
//         j4.setBounds(30, 190, 150, 25);

//         // Text fields
//         JTextField t1 = new JTextField();
//         t1.setBounds(180, 30, 100, 25);

//         JTextField t2 = new JTextField();
//         t2.setBounds(180, 70, 100, 25);

//         JTextField t3 = new JTextField();
//         t3.setBounds(180, 190, 100, 25);
//         t3.setEditable(false);

//         // Combo box (operators)
//         String operators[] = { "+", "-", "*", "/" };
//         JComboBox<String> c1 = new JComboBox<>(operators);
//         c1.setBounds(180, 110, 100, 25);

//         // Button
//         JButton b1 = new JButton("Calculate");
//         b1.setBounds(100, 150, 120, 30);

//         // Button action
//         b1.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {

//                 int a = Integer.parseInt(t1.getText());
//                 int b = Integer.parseInt(t2.getText());
//                 String op = (String) c1.getSelectedItem();

//                 int result = 0;

//                 if (op.equals("+"))
//                     result = a + b;
//                 else if (op.equals("-"))
//                     result = a - b;
//                 else if (op.equals("*"))
//                     result = a * b;
//                 else if (op.equals("/"))
//                     result = a / b;

//                 t3.setText(String.valueOf(result));
//             }
//         });

//         // Add components
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
// }

// import javax.swing.*;
// import java.awt.event.*;

// public class loops {
//     public static void main(String[] args){

//         JFrame f1 = new JFrame("PALINDROME");
//         // Labels
//         JLabel j1 = new JLabel("Enter a word");
//         j1.setBounds(30, 30, 150, 25);

//         JLabel j2 = new JLabel("Reverse string");
//         j2.setBounds(30, 70, 150, 25);

      
//         // Text fields
//         JTextField t1 = new JTextField();
//         t1.setBounds(180, 30, 100, 25);

//         JTextField t2 = new JTextField();
//         t2.setBounds(180, 70, 100, 25);
//         t2.setEditable(false);

//         JButton b1 =new JButton("check");
//         b1.setBounds(110,110,100,30);

//         b1.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){

                
//                 String str=t1.getText();
//                 String reversestr="";
//                 int len=str.length();
//                 for(int i=(len-1);i>=0;--i){
//                     reversestr=reversestr+str.charAt(i);
//                 }
//                     t2.setText(reversestr);
//                 if(str.toLowerCase().equals(reversestr.toLowerCase())){
//                     JOptionPane.showMessageDialog(t2,"String is a palindrome");
//                 }
//                 else{
//                     JOptionPane.showMessageDialog(t2,"String is not a palindrome");
//                 }
//             }
//         });
//         //    Add components
//         f1.add(j1);
//         f1.add(j2);
//         f1.add(b1);

//         f1.add(t1);
//         f1.add(t2);
        
      

//         // Frame settings
//         f1.setSize(350, 300);
//         f1.setLayout(null);
//         f1.setVisible(true);
//         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  




//     }
// }
package javalearning;
import javax.swing.*;
import java.awt.event.*;

public class loops {
    public static void main(String[] args){

        JFrame f1 = new JFrame("PALINDROME");

        // Labels
        JLabel j1 = new JLabel("Enter a word");
        j1.setBounds(30, 30, 150, 25);

        JLabel j2 = new JLabel("Reverse string");
        j2.setBounds(30, 70, 150, 25);

        // Text fields
        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 100, 25);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 100, 25);
        t2.setEditable(false);

        // Button
        JButton b1 = new JButton("Check");
        b1.setBounds(110, 110, 100, 30);

        // Button action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String str = t1.getText();
                String reversestr = "";

                int len = str.length();
                for(int i = len - 1; i >= 0; i--){
                    reversestr = reversestr + str.charAt(i);
                }

                t2.setText(reversestr);

                if(str.equalsIgnoreCase(reversestr)){
                    JOptionPane.showMessageDialog(f1, "String is a palindrome");
                } else {
                    JOptionPane.showMessageDialog(f1, "String is not a palindrome");
                }
            }
        });

        // Add components (THIS WAS MISSING)
        f1.add(j1);
        f1.add(j2);
        f1.add(t1);
        f1.add(t2);
        f1.add(b1);

        // Frame settings
        f1.setSize(350, 250);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


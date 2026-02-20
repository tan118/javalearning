package javalearning;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class method_forms{
    public static boolean chkifprime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}


        
    
    public static void main(String[] args){
        JFrame f=new JFrame("prime number checker");
        JLabel l1=new JLabel("enter a number");
        l1.setBounds(30,50,100,30);
        JTextField t1=new JTextField();
        t1.setBounds(30,70,110,70);
        JButton b=new JButton("check");
        b.setBounds(30,150,110,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int n=Integer.parseInt(t1.getText());
                if(chkifprime(n)){
                    JOptionPane.showMessageDialog(f,n+" is a prime number");
                }
                else{
                    JOptionPane.showMessageDialog(f,n+" is not a prime number");
                }}
            });
        f.add(l1);
        f.add(b);
        f.add(t1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

       
        
    }
}
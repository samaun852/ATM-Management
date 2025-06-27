import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Withdraw extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JFrame frame;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField tf1;
    // Add Constructor

    public Withdraw() {
        frame = new JFrame("Witdraw");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Withdraw frame");
        frame.setBounds(100, 100, 600, 500);
        frame.getContentPane();
        frame.setLayout(null);



        l1 = new JLabel("Welcome to our service");
        l1.setBounds(200, 0, 200, 20);
        frame.getContentPane().add(l1);

        l2 = new JLabel("Your updated ammount is:");
        l2.setBounds(20, 200, 200, 30);
        frame.getContentPane().add(l2);

        tf1 = new JTextField();
        tf1.setBounds(230, 200, 70, 30);
        frame.getContentPane().add(tf1);
        tf1.addActionListener(this);


        b1 = new JButton("500");
        //int b = 500;
        b1.setBounds(50, 40, 150, 30);
        b1.addActionListener(this);
        frame.getContentPane().add(b1);

        b2 = new JButton("1000");
        b2.setBounds(50, 90, 150, 30);
        b2.addActionListener(this);
        frame.getContentPane().add(b2);

        b3 = new JButton("1500");
        b3.setBounds(50, 140, 150, 30);
        b3.addActionListener(this);
        frame.getContentPane().add(b3);

        b4 = new JButton("2000");
        b4.setBounds(350, 40, 150, 30);
        b4.addActionListener(this);
        frame.getContentPane().add(b4);

        b5 = new JButton("2500");
        b5.setBounds(350, 90, 150, 30);
        b5.addActionListener(this);
        frame.getContentPane().add(b5);

        b6 = new JButton("3000");
        b6.setBounds(350, 140, 150, 30);
        b6.addActionListener(this);
        frame.getContentPane().add(b6);


        b7 = new JButton("OK");
        b7.setBounds(120, 300, 150, 50);
        frame.getContentPane().add(b7);
        b7.addActionListener(this);

        b8 = new JButton("Main Menu");
        b8.setBounds(280, 300, 150, 50);
        frame.getContentPane().add(b8);
        b8.addActionListener(this);



        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == b1) {


            String s1 = b1.getText();
            int p = Integer.parseInt(s1);

            int a2 = Account.withdraw_Money(p);

            tf1.setText(Account.Check_Balance()+"");




        }
        if(source==b7) {
            JOptionPane.showMessageDialog(null, "You have succesfully cashout:500");



        }

        /*

        if (source == b2) {


            String s1 = b2.getText();
            int p = Integer.parseInt(s1);
            Account a1 = new Account();
            int a2 = a1.withdraw_Money(p);




        }

        if (source == b7) {
            JOptionPane.showMessageDialog(null, "You have succesfully cashout:1000");


        }

        */








        if (source == b8) {
            Welcome w1 = new Welcome();
        }












  /*  if (source==b7){
        JOptionPane.showMessageDialog(null,"You have succesfully cashout:500");
      /* String q1=b1.getText();
        int tt=Integer.parseInt(q1);

        Account a1=new Account();
       int b= Account.withdraw_Money(tt);
       tf1.setText(""+b);


    }




            if (source == b3) {
                JOptionPane.showMessageDialog(null, "You have succesfully cashout:1500");


            }

            if (source == b4) {
                JOptionPane.showMessageDialog(null, "You have succesfully cashout:2000");


            }
            if (source == b5) {
                JOptionPane.showMessageDialog(null, "You have succesfully cashout:2500");


            }

            if (source == b6) {
                JOptionPane.showMessageDialog(null, "You have succesfully cashout:3000");

            }
*/
        }

    }




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome  implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1;
    JFrame frame;
    Container c;

    Welcome()
    {
        frame=new JFrame("Welcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome Frame");
        frame.setBounds(100,100,600,500);

        frame.setLayout(null);
        frame.setVisible(true);

        b1=new JButton("Withdraw");
        b1.setBounds(50,40,150,30);
        b1.addActionListener(this);
        frame.getContentPane().add(b1);



        b2=new JButton("Deposit");
        b2.setBounds(50,90,150,30);
        b2.addActionListener(this);

        frame.getContentPane().add(b2);

        b3=new JButton("Check Balance");
        b3.setBounds(50,140,150,30);
        b3.addActionListener(this);
       frame.getContentPane().add(b3);

        b4=new JButton("Transfer Ammount");
        b4.setBounds(350,40,150,30);
        b4.addActionListener(this);
        frame.getContentPane().add(b4);

        b5=new JButton("Transection");
        b5.setBounds(350,90,150,30);
        b5.addActionListener(this);
        frame.getContentPane().add(b5);

        b6=new JButton("AccountDetails");
        b6.setBounds(350,140,150,30);
        b6.addActionListener(this);
        frame.getContentPane().add(b6);

        b7=new JButton("Logout");
        b7.setBounds(200,400,150,20);
        b7.addActionListener(this);
        frame.getContentPane().add(b7);

        l1=new JLabel("Welcome to our service");
        l1.setBounds(200,0,200,20);
        frame.getContentPane().add(l1);

      /*  frame.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);

        */



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();

        if(source==b1){

            Withdraw w1=new Withdraw();
           // w1.frame.setVisible(true);
        }
        if(source==b2){
           // dispose();
            Deposit d1=new Deposit();

            //d1.frame.setVisible(true);
        }

        if(source==b3){

            CheckBalance c1=new CheckBalance();

        }

       if(source==b4){

            TransferAmmount tm1=new TransferAmmount();
           // tm1.c.setVisible(true);
        }
        if(source==b5){

            Transection trs1=new Transection();
        }
        if(source==b6){

            AccountDetails ac1=new AccountDetails();
        }

        if(source==b7){
            System.exit(0);
        }
    }

}




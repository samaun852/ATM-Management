import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class Deposit extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;
    JTextField tf1,tf2;
    JFrame frame;
     Container c;
    public Deposit()
    {
        frame=new JFrame("Deposit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Deposit Frame");
        frame.setBounds(100,100,600,500);
        frame.getContentPane();
        frame.setLayout(null);



        l1=new JLabel("Deposit your  ammount:");
        l1.setBounds(200,0,200,20);
        frame.getContentPane().add(l1);

        l2=new JLabel("Enter your ammount:");
        l2.setBounds(40,50,150,100);
        frame.getContentPane().add(l2);

        l3=new JLabel("Updated ammount is:");
        l3.setBounds(40,170,150,100);
        frame.getContentPane().add(l3);

        tf1=new JTextField();
        tf1.setBounds(190,85,150,30);
        frame.getContentPane().add(tf1);

        tf2=new JTextField();
        tf2.setBounds(190,202,150,30);
        frame.getContentPane().add(tf2);
       // tf2.addActionListener(this);


        b1=new JButton("OK");
        b1.setBounds(150,270,100,40);
        frame.getContentPane().add(b1);
        b1.addActionListener(this);

        b2=new JButton("Clear");
        b2.setBounds(340,272,100,40);
        frame.getContentPane().add(b2);
        b2.addActionListener(this);

        b3=new JButton("MainMenu");
        b3.setBounds(200,350,200,40);
        frame.getContentPane().add(b3);
        b3.addActionListener(this);


      /*  b4=new JButton("Clear");
        b4.setBounds(200,350,200,40);
        frame.add(b4);
        b4.addActionListener(this);  */




        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();

        if(source==b1){

           String n= tf1.getText();
           int value=Integer.parseInt(n);

           Account a1=new Account();
           int xx=a1.deposit_Money(value);
           String yy=Integer.toString(xx);
           tf2.setText(""+yy);

        }

        else if(source==b2){
           tf1.setText(" ");


       }


        if(source==b3){

            Welcome a1=new Welcome();

        }

    }

}

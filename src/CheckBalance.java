import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBalance implements ActionListener {
    // Add Constructor
    //Container con;
    JLabel l1,l2;
    JButton b1,b2;
    JFrame frame;

    public  CheckBalance(){
        frame=new JFrame("CheckBalance");

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setBounds(100,100,600,500);

        frame.setLayout(null);




        JLabel l1=new JLabel("Your Balance Amount is : "+ Account.Check_Balance());
        frame.getContentPane().add(l1);



        l1=new JLabel("Your Balance is:"+Account.Check_Balance()+"$");
        l1.setBounds(200,80,450,40);
        frame.getContentPane().add(l1);

        b1=new JButton("Logout");
        b1.setBounds(120,200,150,50);
        frame.getContentPane().add(b1);
        b1.addActionListener(this);

        b2=new JButton("MainMenu");
        b2.setBounds(300,200,150,50);
        frame.getContentPane().add(b2);
        b2.addActionListener(this);




        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==b1){
            System.exit(0);
        }
        if(source==b2){

            Welcome w1=new Welcome();

        }
    }
   public static void main(String[] args){
        CheckBalance ff=new CheckBalance();


    }
}


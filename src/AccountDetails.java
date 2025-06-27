import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountDetails implements ActionListener {
    JFrame frame;
    JLabel l1;
    JButton b1;

    AccountDetails(){

        frame = new JFrame("Accounts details");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Withdraw frame");
        frame.setBounds(100, 100, 600, 500);
        frame.getContentPane();
        frame.setLayout(null);
        frame.setVisible(true);


        l1 = new JLabel("Sorry you can't Check your details for security system:");
        l1.setBounds(60, 200, 350, 50);
        frame.getContentPane().add(l1);

        b1=new JButton("Welcome Menu");
        b1.setBounds(200,350,200,50);
        frame.getContentPane().add(b1);
        b1.addActionListener(this);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Welcome w1=new Welcome();
    }
}

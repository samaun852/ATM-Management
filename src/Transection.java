import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transection implements ActionListener {
    JLabel l1;
    JButton b1;

    Transection(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Transection Frame");
        frame.setBounds(100,100,600,500);
        frame.setLayout(null);
        frame.setVisible(true);


        l1 = new JLabel("Sorry you can't see your transection from here:");
        l1.setBounds(60, 200, 300, 30);
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

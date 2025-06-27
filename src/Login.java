
import javax.swing.*;
import javax.xml.transform.OutputKeys;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login  implements ActionListener {
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    JTextField tf;
    JPasswordField pf;
    JFrame frame;

    // Add Constructor
    public  Login(){
        frame=new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Login Frame");
        frame.setBounds(100,100,600,500);
        frame.setLayout(null);





        l1=new JLabel("User Name:");
        l1.setBounds(10,30,100,50);
        frame.getContentPane().add(l1);

        l2=new JLabel("Password:");
        l2.setBounds(10,110,100,50);
        frame.getContentPane().add(l2);

        l3=new JLabel("Welcome to our service");
        l3.setBounds(200,0,150,20);
        frame.getContentPane().add(l3);

        tf=new JTextField();
        tf.setBounds(90,45,150,30);
        frame.getContentPane().add(tf);


        pf=new JPasswordField();
        pf.setBounds(90,125,150,30);
        //pf.setActionCommand();
        frame.getContentPane().add(pf);

        b1=new JButton("SIGNIN");
        b1.setBounds(130,200,150,50);
        frame.getContentPane().add(b1);
        b1.addActionListener(this);


        b2=new JButton("CANCEL");
        b2.setBounds(290,200,150,50);
        frame.getContentPane().add(b2);
        b2.addActionListener(this);


        b3=new JButton("Create a new Account");
        b3.setBounds(170,260,250,40);
        frame.getContentPane().add(b3);




        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();

        String userName=tf.getText();
        String password=pf.getText();

        if(source==b1){
            if(userName.equals("1") && password.equals("1")){


                 Welcome welcome=new Welcome();


            } else{

                JOptionPane.showMessageDialog(null,"User Name or Password is incorrect");

            }
        }


        if(source==b2)
        {
            System.exit(0);
        }
    }


}

package javaapplication87;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JavaApplication87 extends JFrame implements ActionListener {
    JFrame jFrame;
    JButton jButton;
    String name;
    JTextField jTextField;
    JavaApplication87(){
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\tanve\\OneDrive\\Desktop\\Quiz app.jpg");

        //Frame Setting + icon
        this.setSize(500,300);
        this.setLocation(400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setIconImage(imageIcon.getImage());
        this.setTitle("Welcome to Quiz app");

        //Lable
        JLabel jLabel = new JLabel("Enter Your name: ");
        jLabel.setBounds(5,5,300,50);
        jLabel.setFont(new Font(null,Font.BOLD,27));
        this.add(jLabel);

        //TextField Setting
        jTextField = new JTextField();
        jTextField.setBounds(5,60,300,50);
        jTextField.setFont(new Font(null,Font.PLAIN,17));
        jTextField.setBackground(new Color(166, 205, 102));
        jTextField.setForeground(new Color(21, 58, 175, 201));
        this.add(jTextField);

        //Submit Button
        jButton = new JButton("Submit.");
        jButton.setBounds(340,120,90,50);
        this.add(jButton);
        jButton.addActionListener(this);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JavaApplication87();
        ArrayList<String> names= new ArrayList<>();
        names.add("Hasnain");
        names.add("Ubaid");
        names.add("5");
        names.add("Hafsa");
        names.add("ALi");
        names.add("5");
        names.add("ALi Khan");
        names.add("ALo");
        names.add("6");
        ArrayList<String> n = new ArrayList<>();
        n.add("Ubaid");
        n.add("Haso");
        n.add("Alo");
//        new Result(names,"ALi",n);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton)
        {
            name = jTextField.getText();
            this.dispose();
            System.out.println(name);
            new QuestionsPage(name);
        }
    }
}
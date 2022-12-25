
package javaapplication36;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.*;

public class JavaApplication36 {

    public static void main(String[] args) {
        Frame f = new Frame("ToolKitExample");
        Button b = new Button("beep");
        b.setBounds(50,100,60,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
            }
    });
}
}
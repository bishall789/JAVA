import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class COLOR {

    public static final String RED = null;
    JButton red;
    JButton blue;
    JButton green;

    public COLOR() {

        JFrame f = new JFrame();
        f.setSize(500,500);

        red = new JButton("RED");
        blue = new JButton("BLUE");
        green = new JButton("GREEN");

        f.add(red);
        f.add(blue);
        f.add(green);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);

        red.addActionListener(e-> {
              f.getContentPane().setBackground(Color.RED);
        });

        blue.addActionListener(e-> {
            f.getContentPane().setBackground(Color.BLUE);
      });

      green.addActionListener(e-> {
        f.getContentPane().setBackground(Color.GREEN);
  });



 }

 public static void main(String[] args) {
    new COLOR();
 }



    
}

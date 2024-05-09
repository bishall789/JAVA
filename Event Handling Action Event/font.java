import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class font  {

    JTextField t;
    JButton btn;

    public font() {

        JFrame f = new JFrame();
        f.setSize(400, 400);

        t = new JTextField(null);
        btn = new JButton("CLICK");
        t.setColumns(10);

        f.add(t);
        f.add(btn);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(e -> {

                Font fo = new Font("AERIAL", Font.BOLD, 20);
                t.setFont(fo);
        
                t.setBackground(Color.BLACK);
                t.setForeground(Color.RED);
                t.setText(t.getText() .toUpperCase());
            
        
            });

    }


    



    public static void main(String[] args) {

        new font();
    }

}

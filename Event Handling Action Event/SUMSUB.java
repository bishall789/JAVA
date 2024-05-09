import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SUMSUB implements ActionListener {

    JTextField num1, num2, ans;
    JButton sum, sub;

    public SUMSUB() {

        JFrame f = new JFrame();
        f.setSize(500, 500);

        num1 = new JTextField(null, 10);
        num2 = new JTextField(null, 10);
        ans = new JTextField(null, 10);

        sum = new JButton("SUM");
        sub = new JButton("SUB");

        f.add(num1);
        f.add(num2);
        f.add(sum);
        f.add(sub);
        f.add(ans);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);

        sum.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());

                ans.setText("" + (a + b));

            }

        });
        
        sub.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());

                ans.setText("" + (a - b));

            }

        });

    }

    public static void main(String[] args) {
        new SUMSUB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}

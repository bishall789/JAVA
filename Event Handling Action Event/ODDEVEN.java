// CHECK NUBER IS ODDD OR EVEN


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class ODDEVEN implements ActionListener {

    JTextField num, ans;

    public ODDEVEN() {

        JFrame f = new JFrame();
        f.setSize(400, 400);

        num = new JTextField();
        ans = new JTextField();
        JButton btn = new JButton("CHECK");

        num.setColumns(10);
        ans.setColumns(10);

        f.add(num);
        f.add(ans);
        f.add(btn);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        ans.setEditable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int number = Integer.parseInt(num.getText());

        if (number % 2 == 0) {
            ans.setText("EVEN");
        } else {
            ans.setText("ODD");
        }
    }

    public static void main(String[] args) {
        new ODDEVEN();
    }
}
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Example1 implements MouseListener, MouseMotionListener {
    JFrame f;
    JTextField t1, t2;

    public Example1() {
        f = new JFrame();
        f.setSize(500, 400);

        t1 = new JTextField();
        t2 = new JTextField();
        t1.setColumns(10);
        t2.setColumns(10);

        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(t1);
        f.add(t2);

        f.setVisible(true);
        t2.setEditable(false);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        t1.setText("IN");
    }

    public void mouseExited(MouseEvent e) {
        t1.setText("OUT");
    }

    public void mouseMoved(MouseEvent e) {
        t2.setText("X: " + e.getX() + " Y: " + e.getY());
    }

    // Unused mouse event methods
    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Example1();
    }
}
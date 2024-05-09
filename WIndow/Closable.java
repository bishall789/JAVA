

// CREATE A CLOSABLE FRAME SET IN AWT

package WIndow;

import java.awt.event.*;
import javax.swing.*;

class Closable extends WindowAdapter
{

    JFrame f;

    public Closable() {

        f = new JFrame();
        f.setSize(500,500);

        f.setVisible(true);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }


    @Override
    public void windowClosing(WindowEvent e)
    {
        int choice = JOptionPane.showConfirmDialog(f, "Do you really want to exit", "JAVA", 0);

        if(choice==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
         new Closable();
    }

}




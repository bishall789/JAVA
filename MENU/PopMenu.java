// POP UP MENU

package MENU;




import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import java.awt.event.MouseEvent;

import java.awt.event.MouseEvent;


public class PopMenu  implements MouseListener{

    JFrame f;
    JPopupMenu file;
    JMenuItem select,copy,cut,paste,exit;
    JTextArea ta;

    public PopMenu() {

        f = new JFrame();
        f.setSize(700,700);

        file = new JPopupMenu("file");
        f.add(file);

        
        select = new JMenuItem("select");
        copy = new JMenuItem("copy");
        cut = new JMenuItem("cut");
        paste = new JMenuItem("paste");
        exit = new JMenuItem("exit");

        
        file.add(select);
        file.add(copy);
        file.add(cut);
        file.add(paste);
        file.addSeparator();
        file.add(exit);

        ta = new JTextArea("Type Here");
        ta.setBounds(200, 200, 50, 50);

        f.add(ta);

        f.setLayout(null);
        f.setVisible(true);

        select.addActionListener(e -> {
            ta.selectAll();
        });

        copy.addActionListener(e -> {
            ta.copy();
        });

        cut.addActionListener(e -> {
            ta.cut();
        });

        paste.addActionListener(e -> {
            ta.paste();
        });

        exit.addActionListener(e -> {
            System.exit(0);
        });

        f.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        file.show(f,e.getX(),e.getY());
    }

    public void mousePressed(MouseEvent e)   { }
    public void mouseExited(MouseEvent e)    { }
    public void mouseEntered(MouseEvent e)   { }
    public void mouseReleased(MouseEvent e)  { }




    public static void main(String[] args) {
        new PopMenu();
    }


}

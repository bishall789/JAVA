
// CREATE A STATIC MENU

package MENU;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuDemo {

    JFrame f;
    JMenuBar bar;
    JMenu file;
    JMenuItem select, copy, cut, paste, exit;
    JTextArea ta;

    public MenuDemo() {

        f = new JFrame();
        f.setSize(500, 400);

        bar = new JMenuBar();
        f.setJMenuBar(bar);

        file = new JMenu("file");
        bar.add(file);

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

        ta = new JTextArea("WELCOME TO JAVA COURSE");
        ta.setBounds(150, 150, 200, 20);
        ta.setEditable(false);
        

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
    }

    public static void main(String[] args) {
        new MenuDemo();
    }

}
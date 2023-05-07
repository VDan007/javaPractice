import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MyFrame04 extends JFrame implements ActionListener {

    JMenu helpMenu;
    JMenu editMenu;
    JMenu fileMenu;
    JMenuBar menuBar;

    MyFrame04(){
        menuBar = new JMenuBar();
        helpMenu = new JMenu("Help");
        editMenu = new JMenu("Edit");
        fileMenu = new JMenu("File");
       

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

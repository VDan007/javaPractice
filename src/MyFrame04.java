import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame04 extends JFrame implements ActionListener {

    JMenu helpMenu;
    JMenu editMenu;
    JMenu fileMenu;
    JMenuBar menuBar;
    JMenuItem loadItem; 
    JMenuItem saveItem; 
    JMenuItem exitItem;

    MyFrame04(){

        ImageIcon saveIcon = new ImageIcon("save.png");


        menuBar = new JMenuBar();
        helpMenu = new JMenu("Help");
        editMenu = new JMenu("Edit");
        fileMenu = new JMenu("File");
       
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        saveItem.setIcon(saveIcon);
        

        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for load
        exitItem.setMnemonic(KeyEvent.VK_E); // e for load

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
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
        if(e.getSource() == loadItem){
            System.out.println("load thing");
        }else if(e.getSource() == saveItem){
            System.out.println("save thing");
        }else if(e.getSource() == exitItem){
           System.exit(0);
        }
    }
    
}

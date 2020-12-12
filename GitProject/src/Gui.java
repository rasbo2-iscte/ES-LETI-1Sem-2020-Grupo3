import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Gui {
	
    private JFrame frame;
    private JPanel panel_search, panel_listNews, panel_displayNews;
    private String string_search;
    private JScrollPane scrollPane_displayNews;
    private JTextArea textArea_news;
    private DefaultListModel defaultListModel_news;


    public static void main(String[] args){
        Gui gui=new Gui();
        gui.open();
    }

    public Gui(){
        this.string_search=null;
        frame = new JFrame("");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(1080,720);
        frame.setResizable(false);
    }
    
    public void open(){
        frame.setVisible(true);
    }
}
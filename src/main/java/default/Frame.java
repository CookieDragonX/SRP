import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("URA");
        setSize(600,400);
        setResizable(false);
        init();
        System.out.println("frame");
    }
    public void init(){
        setLayout(new GridLayout(1,1,0,0));
        Screen s= new Screen();
        add(s);
        setVisible(true);
    }
}
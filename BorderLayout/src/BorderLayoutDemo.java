import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo {
	
public static void main(String[] args) {
		
//		Here I create panels
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new BorderLayout());
//      Here I add Buttons
        panel1.add(new JButton("Button 1"), BorderLayout.WEST);
        panel1.add(new JButton("Button 2"), BorderLayout.CENTER);
        panel1.add(new JButton("Button 3"), BorderLayout.EAST);
        panel2.add(new JButton("Button 4"), BorderLayout.WEST);
        panel2.add(new JButton("Button 5"), BorderLayout.CENTER);
        panel2.add(new JButton("Button 6"), BorderLayout.EAST);;
//      Here I create frame and add panels to it
        JFrame frame = new JFrame("BorderLayout Demo"); 
        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.SOUTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
	
	}
	
}

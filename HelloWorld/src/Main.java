import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;

public class Main {

	private static void createGameWindow() {
			
		   //Create window
		    JFrame gameWindow = new JFrame("Game Window");	 

		    gameWindow.setLayout(new GridLayout(2,1));
		    gameWindow.setPreferredSize(new Dimension(400, 240));
		    gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JLabel start = new JLabel("<html><br><br><br><br><br><br>START</html>",JLabel.CENTER);
	        JLabel exit = new JLabel("<html>EXIT<br><br><br><br><br></html>",JLabel.CENTER);
	        	gameWindow.getContentPane().add(start);
	        	gameWindow.getContentPane().add(exit);

		    // Display window
		    gameWindow.pack();
		    gameWindow.setVisible(true);
		    
			}

public static void main(String[] args) {
   
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createGameWindow();
        }
    });
}


	
	public static void foo() {
		
	}	
}


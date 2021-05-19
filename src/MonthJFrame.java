import javax.swing.*; 
import java.awt.*;
import java .awt. event .*;

public class MonthJFrame extends JFrame implements ActionListener{
	
	private JTextField inputField; 
	private JTextArea display;

	public MonthJFrame(String title)  {
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");
	
		inputField = new JTextField(10); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		
		display = new JTextArea (1 ,30);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		panel.add(prompt);
		panel.add(inputField);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add("Center", panel);
		contentPane.add("South", display);
		
		setTitle(title);
		setSize( 350, 150 );              
		pack();
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent evt)  { 
		if ( evt.getSource() == inputField) { 
			//convert user input to an integer
			int number = Integer.parseInt(inputField.getText()); 
			
			//TODO: update display with number chosen and days calculated
			
		}
	}
	
	public static void main(String[] args) {
		
		//Starting the GUI application
		new MonthJFrame("Days in month");

	}

}

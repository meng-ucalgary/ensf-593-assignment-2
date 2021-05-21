import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class to provide a GUI interface to get the month of the year as user input
 * and display the number of days in that month for a non-leap year in the same
 * window.
 * 
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public class MonthJFrame extends JFrame implements ActionListener {
	/**
	 * The input field to accept the month from the user
	 */
	private JTextField inputField;

	/**
	 * Display area to print the number of days in the month
	 */
	private JTextArea display;

	/**
	 * Constructs the GUI interface to interact with the user
	 * 
	 * @param title The title to show on the title bar of the windows
	 */
	public MonthJFrame(String title) {
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");

		inputField = new JTextField(10);
		inputField.setText("0");
		inputField.addActionListener(this);

		display = new JTextArea(1, 30);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.add(prompt);
		panel.add(inputField);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		contentPane.add("Center", panel);
		contentPane.add("South", display);

		setTitle(title);
		setSize(350, 150);
		pack();
		setVisible(true);
	}

	/**
	 * Catches the events by the ActionListener as a result of user interaction with
	 * the GUI interface
	 * 
	 * @param evt The action caught by the GUI
	 */
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == inputField) {
			// convert user input to an integer
			int number = Integer.parseInt(inputField.getText());
			display.setText("There are " + Days.howManyDays(number) + " days");
		}
	}

	/**
	 * Function to create the GUI by calling the constructor MonthJFrame
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// Starting the GUI application
		new MonthJFrame("Days in month");

	}

}

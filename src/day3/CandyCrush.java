package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		
 String answer=JOptionPane.showInputDialog("who do you not like");
		
		JOptionPane.showMessageDialog(null, "You totally have a crush on " +answer);
		// 3. Ask the user for the name of their best friend
		String lol=JOptionPane.showInputDialog("who is your best friend");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, lol+ " is sweet as candy");

	} 
}




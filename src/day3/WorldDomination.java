package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		
 String answer=JOptionPane.showInputDialog("do you know how to right code?");
		// 2. If they say "yes", tell them they will rule the world.
 if (answer.equals("yes")) {
 JOptionPane.showMessageDialog(null, " you will rule the world");
}
 else{
 JOptionPane.showMessageDialog(null, " Good luck washing dishes"); 
	 
 }
		// 3. Otherwise, wish them good luck washing dishes.

	}
}


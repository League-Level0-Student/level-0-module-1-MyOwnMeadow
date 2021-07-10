package _04_int._1_riddler;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		
	//Riddle #1
		String riddle1 = JOptionPane.showInputDialog("What is greater than God, more evil than the devil,\r\n"
				+ "the poor have it, the rich need it,\r\n"
				+ "and if you eat it, you'll die? ");
		
		if(riddle1.equalsIgnoreCase("Nothing")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORECT. (Think about it a litle harder, this is a long-time classic)");
		}
	
	//Riddle #2
		String riddle2 = JOptionPane.showInputDialog("Who makes it has no need of it.\r\n"
				+ "Who buys it has no use for it.\r\n"
				+ "Who uses it can neither see nor feel it.\r\n"
				+ "What is it?");
		
		if(riddle2.equalsIgnoreCase("A coffin")) {
			score += 5;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT. (This is a hard one, so I'll give you a hint;\r\n"
					+ "You'll never use it in your life, but you will after you die)");
		}
		
	//Riddle #3
		String riddle3 = JOptionPane.showInputDialog("Some crave me on a busy day, but dread me during a conversaytion.\r\n"
				+ "If you say my name, I will brake.\r\n"
				+ "What am I?");
		
		if(riddle3.equalsIgnoreCase("Silence")) {
			score += 3;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT. ([...] is another way to say the ancer, but not what you have to type)");
		}
	//Finale Score
		JOptionPane.showMessageDialog(null, "FINALE SCORE:" + score + "\r\n"
				+ "(Try to see if you can get a beter score next time!)");
		
	}
}
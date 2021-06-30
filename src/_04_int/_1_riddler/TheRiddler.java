package _04_int._1_riddler;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		
	//Riddle #1
		String riddle1 = JOptionPane.showInputDialog("What is greater than God, more evil than the devil,\r\n"
				+ "the poor have it, the rich need it,\r\n"
				+ "and if you eat it, you'll die? ");
		
		if(riddle1.equals("Nothing")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
	
	//Riddle #2
		String riddle2 = JOptionPane.showInputDialog("Who makes it has no need of it.\r\n"
				+ "Who buys it has no use for it.\r\n"
				+ "Who uses it can neither see nor feel it.\r\n"
				+ "What is it?");
		
		if(riddle2.equals("A coffin")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		
	//Riddle #3
		String riddle3 = JOptionPane.showInputDialog("");
		// 2. Make a pop up to show the score.
		
	}
}
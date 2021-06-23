package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UNbirthday {

	public static void main(String[] args) {
		String bDay = JOptionPane.showInputDialog("What is your birthday?\n" + "(Enter in month/day format; example: 01/01)");
		
		if(bDay.equals("05/22")) {
			JOptionPane.showMessageDialog(null, "Well, then, HAPPY BIRTHDAY!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Ok, then, Happy UN-birthday!");
		}
	}
}
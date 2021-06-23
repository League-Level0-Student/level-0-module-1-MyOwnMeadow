package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	public static void main(String[] args) {
		String pin = "HELLO THERE!";
		String letter = JOptionPane.showInputDialog("Shhh... Quickly! Tell me your secrit message!");
	
		String guss = JOptionPane.showInputDialog("IN ORDER TO SEE THE SECRT MESSAGE, YOU MUST SAY THE PASCODE.\n" + "(Hint: The pascode is simple, and in all caps)");
	
		if(guss.equals(pin)) {
			JOptionPane.showMessageDialog(null, "Here is the secrit message:\n" + "''" + letter + "''");
		}
		else {
			JOptionPane.showMessageDialog(null, "YOU MAY NOT PASS!\n" + "(Aaand just like that the message is lost forever...)");
		}
	}
}

package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		JOptionPane.showMessageDialog(null, prompt);
		// Get the player to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter an adjective. OR ELSE!!!");
		// Get the player to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a liquid. If you don't i'll kidnap your momD!D!!!!!!!");
		// Get the player to enter a body part
		String bodypart = JOptionPane.showInputDialog("Enter a body part, if you dont I'll take one of yours!!!");
		// Get the player to enter a verb
		String verb = JOptionPane.showInputDialog("enter a verb, if your don't.... I'll be under your bed!!HEHEHEHE");
		// Get the player to enter a place
		String place = JOptionPane.showInputDialog("Enter a place! If you dont, I'll blow up yours!!!");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		"Piranhas are more "+ adjective+ " during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh "+ liquid+ " and will most\n"  +
		"likely take a bite out of your "+ bodypart+ " if you "+ verb + ". Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the " + place+ ". Good luck!";
		
		JOptionPane.showMessageDialog(null, story);
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}
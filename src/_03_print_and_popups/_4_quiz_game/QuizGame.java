package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int count = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String somting = JOptionPane.showInputDialog("what is 1+1");
		// 3.  Use an if statement to check if their answer is correct
		if(somting.equals("2"))   {   
			JOptionPane.showMessageDialog(null, "correct!");

			count+=1;



		}
		else {
			JOptionPane.showMessageDialog(null,"wrong!");
		}
		// 4.  if the user's answer was correct, add one to their score 



		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		String hi = JOptionPane.showInputDialog("what is 1x1");
		if(hi.equals("1"))    {
			JOptionPane.showMessageDialog(null, "correct!");

			count+=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"wrong!");
		}


		String qwerty = JOptionPane.showInputDialog("what is 7x7");
		if(qwerty.equals("49")) {
			
			JOptionPane.showMessageDialog(null, "correct!");
			
			count+=1;
		}
			else {
				JOptionPane.showMessageDialog(null,"wrong!");
			}	
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"you got"+ count+"/3");
	}
}

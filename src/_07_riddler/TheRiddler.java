package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("towel")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your score is now " + score);
}else {
	JOptionPane.showMessageDialog(null, "wrong, the answer was a towel");
	JOptionPane.showMessageDialog(null, "Your score is still " + score + "\n L \n L \n L \n L \n L  L  L  L");
} 
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answerTwo = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if(answerTwo.equalsIgnoreCase("candle")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your score is now " + score);
}else {
	JOptionPane.showMessageDialog(null, "wrong, the answer was a candle");
	JOptionPane.showMessageDialog(null, "Your score is still " + score + "\n L \n L \n L \n L \n L  L  L  L");
	
	String answerThree = JOptionPane.showInputDialog("You can drop me from the tallest building and \n I'll be fine, but if you drop me in water I die. What am I?");
	if(answerThree.equalsIgnoreCase("paper")) {
		JOptionPane.showMessageDialog(null, "correct!");
		score++;
		JOptionPane.showMessageDialog(null, "Your score is now " + score);
	}else {
		JOptionPane.showMessageDialog(null, "wrong, the answer was paper");
		JOptionPane.showMessageDialog(null, "Your score is still " + score + "\n L \n L \n L \n L \n L  L  L  L");
		// 2. Make a pop up to show the score.
		
	}
}
}
}


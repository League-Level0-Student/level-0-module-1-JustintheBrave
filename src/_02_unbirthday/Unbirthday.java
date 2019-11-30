package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String bDay = JOptionPane.showInputDialog("is your bithday 11/29?");
if(bDay.equalsIgnoreCase ("Yes")){
	JOptionPane.showMessageDialog(null, "Happy birthday!");
	}else {
		JOptionPane.showMessageDialog(null, "Happy unbirthday to you!");
	}

		
		
	}

}

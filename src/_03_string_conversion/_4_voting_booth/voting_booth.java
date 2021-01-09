package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {

	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(ageString);
		if(age >= 18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}

	}

}

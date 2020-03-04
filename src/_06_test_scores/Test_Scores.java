package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	String colt=JOptionPane.showInputDialog("What is yur test score percentage?");
	int alfred=Integer.parseInt(colt);
	if(0<alfred&&alfred<59)	{
		JOptionPane.showMessageDialog(null, "You fail test, you suck");
		
			
		}
	else if(59<alfred&&alfred<69)	{
		JOptionPane.showMessageDialog(null, "D is better than F, but you still very very very bad fool.");
	}
	else if(69<alfred&&alfred<79)	{
		JOptionPane.showMessageDialog(null, "C is 'Average' but sucky");
	}
	else if(79<alfred&&alfred<89)	{
		JOptionPane.showMessageDialog(null, "B is just okay, but you still get video game ban");
		
		
		}
	else if(89<alfred&&alfred<99)	{
		JOptionPane.showMessageDialog(null, "No 100%?! You are a moron!");
	}
	else	{
		JOptionPane.showMessageDialog(null, "That is acceptable");
	}
}
	
}


package _11_own_adventure;

import javax.swing.JOptionPane;

public class An_Adeventure {
public static void main(String[] args) {
	int levone = JOptionPane.showOptionDialog(null, "You are in a tall building, and there is an earthquake. What do you do", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go under something", "Get the fire extinsuisher", "Jump out the window" }, null);
	
}
}

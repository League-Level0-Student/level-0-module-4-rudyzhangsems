package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet=JOptionPane.showInputDialog("What kind of pet do you want?");
			
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 999999; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What wold you like to do to your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "pet", "groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				feed();
			}
			else if(task==1)	{
				pet();
			}
			else	{
				groom();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel>=6)	{
				JOptionPane.showMessageDialog(null, "yur pett iz happi");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	private static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet threw up because you fed it too much");
		happinessLevel--;
	}
	private static void pet() {
		JOptionPane.showMessageDialog(null, "Your pet makes a weird noise");
		happinessLevel += 3;

	}
	private static void groom()	{
		JOptionPane.showMessageDialog(null, "you pet doesn't like baths and being touched by brushes");
		happinessLevel--;
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happinesLevel.
}
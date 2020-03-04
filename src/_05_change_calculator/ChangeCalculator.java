package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels=JOptionPane.showInputDialog("now namy nikelz doo yu hav?");
		// Convert their answer to an int using Integer.parseInt()
		double nikelz=Integer.parseInt(nickels)*.05;
		// Ask the user how many dimes they have, and convert their answer
		String dimes=JOptionPane.showInputDialog("now namy dims doo yu hav?");
		double dims=Integer.parseInt(dimes)*.1;
		// Ask the user how many quarters they have, and convert their answer
		String Quarters=JOptionPane.showInputDialog("now namy qwuartars doo yu hav?");
		double qwuartars=Integer.parseInt(Quarters)*.25;
		// Calculate how much money the user has and save it in a double variable 
		System.out.println(nikelz+dims+qwuartars+" iz yur muneez.");
		// Tell the user how much money they have

	}
}


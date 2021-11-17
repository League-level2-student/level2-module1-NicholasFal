package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> foods = new ArrayList<String>();
		//2. Add five Strings to your list
		foods.add("Chicken");
		foods.add("Pizza");
		foods.add("Burger");
		foods.add("Steak");
		foods.add("Hot Dog");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String food : foods) {
			System.out.println(food);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("\n");
		for(int i = 1; i < foods.size(); i+=2) {
			System.out.println(foods.get(i));
		}
		//6. Print all the Strings in reverse order.
		System.out.println("\n");
		for(int i = foods.size() - 1; i >= 0; i--) {
			System.out.println(foods.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		boolean isThereE = false;
		for(int i = 0; i < foods.size(); i++) {
			for(int j = 0; j < foods.get(i).length(); j++) {
			char letterE = foods.get(i).charAt(j);
			if(letterE == 'e') {
				isThereE = true;
			}
			}
			if(isThereE == true) {
				System.out.println(foods.get(i));
		}
			isThereE = false;
		}
	}
}

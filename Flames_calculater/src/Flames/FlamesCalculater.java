package Flames;

import java.util.Scanner;

public class FlamesCalculater {
	public static void main(String[] args) {
		// take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Your Name : ");
		String name1 = input.nextLine();
		System.out.println("Your Partner Name : ");
		String name2 = input.nextLine();
		input.close();
		takeCount(name1, name2);

	}

	private static void takeCount(String name1, String name2) {
		// create two array
		char[] ch1 = name1.toCharArray();
		char[] ch2 = name2.toCharArray();
		int total_char_count = 0;

		// if ch1 character equal ch2 then we change character into '0' char
		for (int i = 0; i < name1.length(); i++) {
			for (int j = 0; j < name2.length(); j++) {
				if (ch1[i] == ch2[j] && ch1[i] != '0' && ch2[j] != '0') {
					ch1[i] = '0';
					ch2[j] = '0';
				}

			}
		}
		// iterate the character from ch1
		for (char n1 : ch1) {
			// condition not equal to '0' and empty character ' '
			if (n1 != '0' && n1 != ' ') {
				total_char_count++;
			}
		}

		// iterate the character from ch2
		for (char n2 : ch2) {
			// condition not equal to '0' and empty character ' '
			if (n2 != '0' && n2 != ' ') {
				total_char_count++;
			}
		}
		flames(total_char_count);

	}

	private static void flames(int total_char_count) {
		String s = "flames";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.insert(i, s.charAt(i));
		}
		int index_remove = 0;
		// if length of the sb is grater 1 then it will run
		while (sb.length() > 1) {
			// remove the character by using index
			index_remove = (index_remove + (total_char_count - 1)) % sb.length();
			sb.deleteCharAt(index_remove); // get the char value

		}
		// use char value to run the case

		char choice = sb.charAt(0);
		switch (choice) {
		case 'f': {
			System.out.println("FRIENDSHIP 🤝 ");
			System.out.println(
					"This relationship suggests a strong bond of companionship and camaraderie between two people. Friends share mutual interests, enjoy spending time together, and support each other through various life challenges. It indicates a relationship built on trust, loyalty, and shared experiences.");
			break;
		}
		case 'l': {
			System.out.println("LOVE ❤️ ");
			System.out.println(
					"This signifies a romantic connection characterized by deep emotional attachment and affection. Love can be passionate and fulfilling, often involving a commitment to care for and support each other romantically. It involves feelings of warmth, adoration, and a desire for intimacy and closeness.");
			break;
		}
		case 'a': {
			System.out.println("AFFECTION 💕 ");
			System.out.println(
					"This represents a caring relationship that may not necessarily be romantic but involves a strong fondness and warmth towards another person. Affection can be shown through gestures, kind words, and supportive actions. It suggests a blossoming relationship, one that has potential for deeper feelings.");
			break;
		}
		case 'm': {
			System.out.println("MARRIAGE 💍 ");
			System.out.println(
					"This character signifies a committed romantic relationship that often involves a formal commitment or bond between partners. Marriage reflects a partnership based on love, respect, and a shared vision for the future. It is often marked by promises of fidelity and collaboration in building a life together.");
			break;
		}
		case 'e': {
			System.out.println("ENEMY 💢 ");
			System.out.println(
					"This suggests conflict or negative feelings between two individuals. An 'enemy' relationship could signify significant disagreements, rivalry, or hostility. It reflects incompatibility and possibly unresolved issues that create distance rather than connection.");
			break;
		}
		case 's': {
			System.out.println("SISTER 👭 ");
			System.out.println(
					"The 's' character represents a sibling-like bond characterized by care, protection, and companionship akin to that between siblings. This relationship implies a deep understanding, shared experiences, and unconditional support during good times and bad.");

		}

		}

	}

}

package rps_sketch;
import java.util.Scanner;
import java.util.Random;

public class rps_sketch_01 {
	// CITATIONS:
	// Random Method Explanations: https://www.geeksforgeeks.org/java-util-random-class-java
	// String Method Explanations: https://www.w3schools.com/java/java_ref_string.asp
	
	public static void main(String[] args) {
		// Runs a basic game of Rock-Paper_Scissors
		Scanner reader = new Scanner(System.in);
		String player_sign = "N/A";
		String player_continue = "N/A";
		
		do {
			player_sign = "N/A";
			player_continue = "N/A";
			
			while (player_sign == "N/A") {
				System.out.println("Rock / Paper / Scissors");
				player_sign = validate_input(reader.next());
				reader.nextLine();
			}
			//System.out.println("You Play: " + player_sign);
			compare_signs(player_sign, generate_random_sign());
			
			while (player_continue == "N/A") {
				System.out.print("Play Again? (Y/N): ");
				player_continue = reader.next();
				if (player_continue.equals("Y") || player_continue.equals("N")){
					break;}
				player_continue = "N/A";
				reader.nextLine();
			}
			System.out.println("");
		} while(!player_continue.equals("N"));
		reader.close();
	}
	
	public static String validate_input(String player_input) {
		switch (player_input.toLowerCase()) {
			case "rock", "r" :
				return "Rock";
			case "paper", "p" :
				return "Paper";
			case "scissors", "s" :
				return "Scissors";
			default:
				return "N/A";}
	}
	
	public static String generate_random_sign() {
		Random rand = new Random();
		switch (rand.nextInt(3)) {
		case 0:
			System.out.println("CPU Plays: Scissors");
			return "Scissors";
		case 1:
			System.out.println("CPU Plays: Paper");
			return "Paper";
		default:
			System.out.println("CPU Plays: Rock");
			return "Rock";
		}
	}
	
	public static void compare_signs(String sign_1, String sign_2) {
		switch (sign_1.compareToIgnoreCase(sign_2)){
			case -1, -2, 3 :
				System.out.println("You Win!");
				break;
			case 1, 2, -3:
				System.out.println("CPU Wins!");
				break;
			default:
				System.out.println("Tie!");
				break;
		}
	}
	
}

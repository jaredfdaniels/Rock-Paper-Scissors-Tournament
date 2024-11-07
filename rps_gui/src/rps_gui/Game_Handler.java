package rps_gui;
import java.util.*;
import java.io.*;

public class Game_Handler {
	
	public void run_game(int user_sign, int sign_count) {
		compare_signs(user_sign, get_random_sign(sign_count));
	}
	
	public int get_random_sign(int sign_count) {
		Random rand = new Random();
		return rand.nextInt(1,sign_count+1);
	}
	public void compare_signs(int user_sign, int cpu_sign) {
		System.out.println("Player: " + user_sign);
		System.out.println("CPU: " + cpu_sign);
		int difference = user_sign - cpu_sign;
		if (difference == 0) {
			System.out.println("Tie!");
		}
		else if ((difference>0 && difference%2==0) || (difference<0 && difference%2!=0)) {
			System.out.println("CPU Wins!");
		}
		else if ((difference<0 && difference%2==0) || (difference>0 && difference%2!=0)) {
			System.out.println("Player Wins!");
		}
		else {
			System.out.println("Game handler computation error");
		}
	}
	public void update_records() {
		
	}
	public void round_result() {
		
	}
}

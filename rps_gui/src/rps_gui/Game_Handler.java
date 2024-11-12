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
		
		/* Uses sign values' difference and sign (+/-) to find outcome
			independent of ruleset, based on the following table:
			(↓Offense →Defense, 1-9, +=win -=lose o=tie)
			
		     	   Roc Pap Sci Glo Spi Bat Wiz Spo Liz
				Roc o   -   +   -   +   -   +   -   +
				Pap +   o   -   +   -   +   -   +   -
				Sci -   +   o   -   +   -   +   -   +
				Glo +   -   +   o   -   +   -   +   -
				Spi -   +   -   +   o   -   +   -   +
				Bat +   -   +   -   +   o   -   +   -
				Wiz -   +   -   +   -   +   o   -   +
				Spo +   -   +   -   +   -   +   o   -
				Liz -   +   -   +   -   +   -   +   o  */
		
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

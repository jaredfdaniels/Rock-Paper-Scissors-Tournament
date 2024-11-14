# Rock-Paper-Scissors-Tournament
Project for IS 345 by Jared Daniels

-----------------------------------------------------------------

Description:  

I. Main Menu  
	&emsp;- Descriptive/decorative labels  
	&emsp;A. Creates an instance of Login_Handler  
		&emsp;&emsp;1. On construction, creates a hash map from the file "credentials.txt"  
	&emsp;B-D. btn_play, btn_lizard, btn_spiderman  
		&emsp;&emsp;1. When enabled and clicked, runs Play_Screen with 3, 5, or 9 signs, resepctively.  
	&emsp;E. btn_custom  
		&emsp;&emsp;1. When enabled and clicked, for now runs Play_Screen with 3 signs, renamed to "A","B", and "C".  
		&emsp;&emsp;2. In the future, should first open a new screen for users to define sign number and names.  
	&emsp;F. btn_records  
		&emsp;&emsp;1. Not yet functional.  
	&emsp;G. tf_choose_a_name  
		&emsp;&emsp;-Note: planning to convert functionality into its own method  
		&emsp;1. On action event, resets lbl_incorrect_password, enables lbl_name_taken and uses Login_Handler.check_username to determine the text for lbl_name_taken and lbl_create_a_password  
	&emsp;H. tf_create_a_password  
		&emsp;&emsp;-Note: planning to convert functionality into its own method  
		&emsp;&emsp;1. On action event, enables or disables lbl_name_taken, lbl_incorrect_password, and the 4 play buttons based on Login_Handler.check_password  
II. Login_Handler  
	&emsp;A. Constructor  
		&emsp;&emsp;1. Reads the contents of file "credentials.txt" into a File Input Stream, which is passed into an Object Input Stream, before finally a Hash Map.  
	&emsp;B. check_username  
		&emsp;&emsp;1. Simply returns a boolean of whether credentials_map contains the specified username key  
	&emsp;C. check_password  
		&emsp;&emsp;1. Returns true if both the username and password match a key/value pair inside credentials_map or if the username is not a key to begin with. In which case it also creates a new pair by calling add_user. Returns false otherwise.  
	&emsp;D. add_user  
		&emsp;&emsp;1. Puts a given username/password pair as a key/value in credentials_map, then calls update_credentials  
	&emsp;E. update_credentials  
		&emsp;&emsp;1. Writes the credentials_map Hash Map into an Object Output Stream, then File Output Stream, and into the file credentials.txt. Then flushes the stream to ensure data is written before closing.  
III. Play Screen  
	&emsp;A. Constructors  
		&emsp;&emsp;1. Standard constructor takes the number of signs (as it's the only distinguishing factor of rulesets)  
		&emsp;&emsp;2. Custom rules constructor takes the custom sign number and custom sign names. In the future, it will apply the custom names to the gui buttons.  
	&emsp;B. Creates an instance of Game_Handler  
	&emsp;C-K. Sign Buttons  
		&emsp;&emsp;1. Enabled or disabled based on ruleset's sign number.  
		&emsp;&emsp;2. On action event, runs Game_Handler.run_game with the corresponding sign.  
IV. Game_Handler  
	&emsp;A. run_game  
		&emsp;&emsp;1. Calls compare_signs with the user's chosen sign and one from get_random_sign based on the sign_count of the Play_Screen  
	&emsp;B. get_random_sign  
		&emsp;&emsp;1. Generates random seed rand and returns an integer within the passed sign_count  
	&emsp;C. compare_signs  
		&emsp;&emsp;1. Uses the difference of the two sign values and its sign (+/-) to determine round outcome.  
		&emsp;&emsp;2. Based on the following table:  
		&emsp;&emsp;(\/Offense >Defense, 1-9, +/win -/lose o/tie)  
	
		   Roc Pap Sci Glo Spi Bat Wiz Spo Liz
		Roc o   -   +   -   +   -   +   -   +
		Pap +   o   -   +   -   +   -   +   -
		Sci -   +   o   -   +   -   +   -   +
		Glo +   -   +   o   -   +   -   +   -
		Spi -   +   -   +   o   -   +   -   +
		Bat +   -   +   -   +   o   -   +   -
		Wiz -   +   -   +   -   +   o   -   +
		Spo +   -   +   -   +   -   +   o   -
		Liz -   +   -   +   -   +   -   +   o   

		3. Currently only prints results to console, will soon be incorporated into Play_Screen's gui  
	D. update_records  
		1. Not yet functional. Will eventually pass gameplay info to the records collection (nested hash map).  
	E. round_result  
		1. Not yet functional. Will eventually pass result of run_game back to Play_Screen.  
  &emsp; V. Records_Screen  
	&emsp;&emsp;- Not yet functional. Will eventually allow users to view times played and win/loss/tie counts for each ruleset and sign. Leaderboard for stored users also planned.  

-----------------------------------------------------------------

TO-DO:  
	&emsp;1. Video Explanation(s)  
 	&emsp;2. Connect to Database
	&emsp;3. Play Screen GUI  
		&emsp;&emsp;a. Rearrange/redecorate  
		&emsp;&emsp;b. Results display  
		&emsp;&emsp;c. Specific descriptions  
			&emsp;&emsp;&emsp;(Ex. "Scissors cut Paper")  
		&emsp;&emsp;d. Best of- integration?  
	&emsp;4. Records Integration  
		&emsp;&emsp;a. Create Records_Handler  
		&emsp;&emsp;b. Nested Hash Map  
		&emsp;&emsp;c. GUI Screen + Navigation  
		&emsp;&emsp;d. Recieve from Game_Handler  
	&emsp;5. Custom Rule Creation Screen  
 	&emsp;6. Fix README Formatting




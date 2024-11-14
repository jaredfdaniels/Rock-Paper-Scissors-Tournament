# Rock-Paper-Scissors-Tournament
Project for IS 345 by Jared Daniels

-----------------------------------------------------------------

Description:

I. Main Menu
	-Descriptive/decorative labels
	A. Creates an instance of Login_Handler
		1. On construction, creates a hash map from the file
			"credentials.txt"
	B-D. btn_play, btn_lizard, btn_spiderman
		1. When enabled and clicked, runs Play_Screen with 3, 				5, or 9 signs, resepctively.
	E. btn_custom
		1. When enabled and clicked, for now runs Play_Screen 				with 3 signs, renamed to "A","B", and "C".
		2. In the future, should first open a new screen for 				users to define sign number and names.
	F. btn_records
		1. Not yet functional.
	G. tf_choose_a_name
		-Note: planning to convert functionality into its own 				method
		1. On action event, resets lbl_incorrect_password,
			enables lbl_name_taken and uses 							Login_Handler.check_username to determine the 				text for lbl_name_taken and lbl_create_a_password
	H. tf_create_a_password
		-Note: planning to convert functionality into its own 				method
		1. On action event, enables or disables lbl_name_taken
			lbl_incorrect_password, and the 4 play buttons 				based on Login_Handler.check_password
II. Login_Handler
	A. Constructor
		1. Reads the contents of file "credentials.txt" into 				a File Input Stream, which is passed into an 				Object Input Stream, before finally a Hash Map.
	B. check_username
		1. Simply returns a boolean of whether credentials_map 			contains the specified username key
	C. check_password
		1. Returns true if both the username and password 				match a key/value pair inside credentials_map
			or if the username is not a key to begin with.
			In which case it also creates a new pair by 				calling add_user. Returns false otherwise.
	D. add_user
		1. Puts a given username/password pair as a key/value 				in credentials_map, then calls update_credentials
	E. update_credentials
		1. Writes the credentials_map Hash Map into an Object 				Output Stream, then File Output Stream, and into 				the file credentials.txt. Then flushes the stream 			to ensure data is written before closing.
III. Play Screen
	A. Constructors
		1. Standard constructor takes the number of signs (as 				it's the only distinguishing factor of rulesets)
		2. Custom rules constructor takes the custom sign 				number and custom sign names. In the future, it 				will apply the custom names to the gui buttons.
	B. Creates an instance of Game_Handler
	C-K. Sign Buttons
		1. Enabled or disabled based on ruleset's sign number.
		2. On action event, runs Game_Handler.run_game with 				the corresponding sign.
IV. Game_Handler
	A. run_game
		1. Calls compare_signs with the user's chosen sign and 
			one from get_random_sign based on the sign_count
			of the Play_Screen
	B. get_random_sign
		1. Generates random seed rand and returns an integer 				within the passed sign_count
	C. compare_signs
		1. Uses the difference of the two sign values and its 				sign (+/-) to determine round outcome.
		2. Based on the following table:
		(\/Offense >Defense, 1-9, +/win -/lose o/tie)
	
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
		
		3. Currently only prints results to console, will soon 			be incorporated into Play_Screen's gui
	D. update_records
		1. Not yet functional. Will eventually pass gameplay 				info to the records collection (nested hash map).
	E. round_result
		1. Not yet functional. Will eventually pass result of 
			run_game back to Play_Screen.
V. Records_Screen
	- Not yet functional. Will eventually allow users to view
		times played and win/loss/tie counts for each ruleset
		and sign. Leaderboard for stored users also planned.

-----------------------------------------------------------------

TO-DO:
	1. Video Explanation(s)

	2. Play Screen GUI
		a. Rearrange/redecorate
		b. Results display
		c. Specific descriptions
			(Ex. "Scissors cut Paper")
		d. Best of- integration?

	3. Records Integration
		a. Create Records_Handler
		b. Nested Hash Map
		c. GUI Screen + Navigation
		d. Recieve from Game_Handler

	4. Custom Rule Creation Screen




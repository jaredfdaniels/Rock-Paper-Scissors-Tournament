package rps_gui;
import java.util.*;
import java.io.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class Main_Menu {

	private JFrame frame;
	private JTextField tf_choose_a_name;
	private JTextField tf_create_a_password;

	/**
	 * Launch the application.
	 */
	public static void main(String... args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu window = new Main_Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login_Handler login = new Login_Handler();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_rock_paper_scissors = new JLabel("ROCK PAPER SCISSORS");
		lbl_rock_paper_scissors.setForeground(new Color(255, 255, 255));
		lbl_rock_paper_scissors.setVerticalAlignment(SwingConstants.TOP);
		lbl_rock_paper_scissors.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_rock_paper_scissors.setFont(new Font("Impact", Font.PLAIN, 46));
		lbl_rock_paper_scissors.setBounds(10, 11, 414, 50);
		frame.getContentPane().add(lbl_rock_paper_scissors);
		
		JLabel lbl_tournament = new JLabel("TOURNAMENT");
		lbl_tournament.setVerticalAlignment(SwingConstants.TOP);
		lbl_tournament.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_tournament.setFont(new Font("Impact", Font.PLAIN, 48));
		lbl_tournament.setBounds(89, 60, 258, 62);
		frame.getContentPane().add(lbl_tournament);
		
		JLabel lbl_choose_a_name = new JLabel("Choose a name:");
		lbl_choose_a_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_choose_a_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_choose_a_name.setForeground(new Color(255, 255, 255));
		lbl_choose_a_name.setBounds(20, 134, 119, 14);
		frame.getContentPane().add(lbl_choose_a_name);
		
		JLabel lbl_name_not_yet_taken = new JLabel("Name not yet taken");
		lbl_name_not_yet_taken.setEnabled(false);
		lbl_name_not_yet_taken.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_name_not_yet_taken.setForeground(new Color(0, 255, 0));
		lbl_name_not_yet_taken.setBounds(305, 135, 119, 14);
		frame.getContentPane().add(lbl_name_not_yet_taken);
		
		JLabel lbl_create_a_password = new JLabel("Create a password: ");
		lbl_create_a_password.setForeground(new Color(255, 255, 255));
		lbl_create_a_password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_create_a_password.setBounds(20, 159, 156, 19);
		frame.getContentPane().add(lbl_create_a_password);
		
		JLabel lbl_incorrect_password = new JLabel("");
		lbl_incorrect_password.setForeground(Color.RED);
		lbl_incorrect_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_incorrect_password.setEnabled(false);
		lbl_incorrect_password.setBounds(305, 160, 119, 14);
		frame.getContentPane().add(lbl_incorrect_password);
		
		JButton btn_play = new JButton("✌");
		btn_play.setEnabled(false);
		btn_play.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_play.setToolTipText("Standard Rules");
		btn_play.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 35));
		btn_play.setBounds(0, 207, 80, 54);
		frame.getContentPane().add(btn_play);
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play_Screen.main(3);
			}
		});
		
		JButton btn_lizard = new JButton("🤏");
		btn_lizard.setEnabled(false);
		btn_lizard.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_lizard.setToolTipText("\"Lizard Spock\"");
		btn_lizard.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 33));
		btn_lizard.setBounds(89, 207, 80, 54);
		frame.getContentPane().add(btn_lizard);
		btn_lizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play_Screen.main(5);
			}
		});
		
		JButton btn_spiderman = new JButton("🤟");
		btn_spiderman.setEnabled(false);
		btn_spiderman.setToolTipText("\"Spiderman Batman Wizard Glock\"");
		btn_spiderman.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_spiderman.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		btn_spiderman.setBounds(179, 207, 80, 54);
		frame.getContentPane().add(btn_spiderman);
		btn_spiderman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play_Screen.main(9);
			}
		});
		
		JButton btn_custom = new JButton("🛠");
		btn_custom.setEnabled(false);
		btn_custom.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_custom.setToolTipText("Custom rules");
		btn_custom.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		btn_custom.setBounds(269, 207, 80, 54);
		frame.getContentPane().add(btn_custom);
		btn_custom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play_Screen.main(3,"A B C");
			}
		});
		
		JButton btn_records = new JButton("📜");
		btn_records.setEnabled(false);
		btn_records.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_records.setToolTipText("View records");
		btn_records.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		btn_records.setBounds(359, 207, 80, 54);
		frame.getContentPane().add(btn_records);
		
		tf_choose_a_name = new JTextField();
		tf_choose_a_name.setBounds(142, 133, 153, 20);
		frame.getContentPane().add(tf_choose_a_name);
		tf_choose_a_name.setColumns(10);
		tf_choose_a_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Should convert below into its own method
				// Changes labels based on username status
				lbl_incorrect_password.setEnabled(false);
				lbl_incorrect_password.setText("");
				lbl_name_not_yet_taken.setEnabled(true);
				Boolean username_status = login.check_username(tf_choose_a_name.getText());
					if (username_status) {
						lbl_name_not_yet_taken.setForeground(new Color(255, 0, 0));
						lbl_name_not_yet_taken.setText("Name taken");
						lbl_create_a_password.setText("Confirm Password: ");
					}
					else {
						lbl_name_not_yet_taken.setForeground(new Color(0, 255, 0));
						lbl_name_not_yet_taken.setText("Name not yet taken");
						lbl_create_a_password.setText("Create a Password: ");
					}
			}
		});
		
		tf_create_a_password = new JTextField();
		tf_create_a_password.setBounds(142, 158, 153, 20);
		frame.getContentPane().add(tf_create_a_password);
		tf_create_a_password.setColumns(10);
		tf_create_a_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Should convert below into its own method
				// Enables play buttons and changes label based on password status
				Boolean password_status = login.check_password(tf_choose_a_name.getText(), tf_create_a_password.getText());
				if (password_status) {
					lbl_name_not_yet_taken.setEnabled(false);
					lbl_incorrect_password.setEnabled(false);
					lbl_incorrect_password.setText("");
					btn_play.setEnabled(true);
					btn_lizard.setEnabled(true);
					btn_spiderman.setEnabled(true);
					btn_custom.setEnabled(true);
					btn_records.setEnabled(true);
				}
				else {
					lbl_name_not_yet_taken.setEnabled(true);
					lbl_incorrect_password.setEnabled(true);
					lbl_incorrect_password.setText("Incorrect Password");
					btn_play.setEnabled(false);
					btn_lizard.setEnabled(false);
					btn_spiderman.setEnabled(false);
					btn_custom.setEnabled(false);
					btn_records.setEnabled(false);
				}
			}
		});
		
	}
}

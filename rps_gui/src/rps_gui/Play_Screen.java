package rps_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Play_Screen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String... args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play_Screen window = new Play_Screen();
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
	public Play_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_sign_1 = new JButton("✊");
		btn_sign_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_1.setBounds(10, 29, 89, 23);
		frame.getContentPane().add(btn_sign_1);
		btn_sign_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game_Handler.run_game(1);
			}
		});
		
		JButton btn_sign_2 = new JButton("✋");
		btn_sign_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_2.setBounds(122, 29, 89, 23);
		frame.getContentPane().add(btn_sign_2);
		btn_sign_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game_Handler.run_game(2);
			}
		});
		
		JButton btn_sign_3 = new JButton("✌");
		btn_sign_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_3.setBounds(61, 63, 89, 23);
		frame.getContentPane().add(btn_sign_3);
		btn_sign_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game_Handler.run_game(3);
			}
		});
		
		JButton btn_sign_4 = new JButton("🤏");
		btn_sign_4.setEnabled(false);
		btn_sign_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_4.setBounds(10, 97, 89, 23);
		frame.getContentPane().add(btn_sign_4);
		
		JButton btn_sign_5 = new JButton("🖖");
		btn_sign_5.setEnabled(false);
		btn_sign_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_5.setBounds(122, 97, 89, 23);
		frame.getContentPane().add(btn_sign_5);
		
		JButton btn_sign_6 = new JButton("🤟");
		btn_sign_6.setEnabled(false);
		btn_sign_6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_6.setBounds(10, 131, 89, 23);
		frame.getContentPane().add(btn_sign_6);
		
		JButton btn_sign_7 = new JButton("👌");
		btn_sign_7.setEnabled(false);
		btn_sign_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_7.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_7.setBounds(10, 165, 89, 23);
		frame.getContentPane().add(btn_sign_7);
		
		JButton btn_sign_8 = new JButton("🤘");
		btn_sign_8.setEnabled(false);
		btn_sign_8.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_8.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_8.setBounds(122, 131, 89, 23);
		frame.getContentPane().add(btn_sign_8);
		
		JButton btn_sign_9 = new JButton("👈");
		btn_sign_9.setEnabled(false);
		btn_sign_9.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_sign_9.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		btn_sign_9.setBounds(122, 165, 89, 23);
		frame.getContentPane().add(btn_sign_9);
	}
}

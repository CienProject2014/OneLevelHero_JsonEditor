package kr.or.cien.JsonEditor;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public EventPane() {
		this.setBounds(0, 0, 445, 270);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(lblEvent);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 10, 10));
		
		Button button = new Button("main_story");
		button.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button.setBackground(Color.PINK);
		panel_1.add(button);
		
		Button button_1 = new Button("story_section");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button_1.setBackground(Color.PINK);
		panel_1.add(button_1);
		
		Button button_2 = new Button("npc");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button_2.setBackground(Color.PINK);
		panel_1.add(button_2);
		
		Button button_3 = new Button("game_object");
		button_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button_3.setBackground(Color.PINK);
		panel_1.add(button_3);
	}

}

package kr.or.cien.JsonEditor;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JEditorPane;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame {

	private JFrame frame;
	private EventPane eventPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		eventPane = new EventPane();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		final JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblJsoneditor = new JLabel("JsonEditor");
		panel_1.add(lblJsoneditor);
		lblJsoneditor.setHorizontalAlignment(SwingConstants.CENTER);
		lblJsoneditor.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		Button button = new Button("Event");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setContentPane(eventPane);
				
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		panel.add(button);
		
		Button button_1 = new Button("Unit");
		button_1.setBackground(Color.PINK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		panel.add(button_1);
		
		Button button_2 = new Button("Equipment");
		button_2.setBackground(Color.PINK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		panel.add(button_2);
		
		Button button_3 = new Button("ETC");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		button_3.setBackground(Color.PINK);
		panel.add(button_3);
	}

}

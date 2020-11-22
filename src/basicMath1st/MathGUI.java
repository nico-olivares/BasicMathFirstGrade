package basicMath1st;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MathGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField answerField;
	
	private JLabel equationLabel;
	private JLabel feedbackLabel;
	private JLabel levelLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathGUI frame = new MathGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MathGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
							.addGap(1)))
					.addGap(9))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(0))
		);
		
		feedbackLabel = new JLabel("Feedback");
		feedbackLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		feedbackLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(feedbackLabel, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(feedbackLabel, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel xEqualLabel = new JLabel("x = ");
		xEqualLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
		
		answerField = new JTextField();
		answerField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Text field answer entered
				try {
				int ans = Integer.parseInt(answerField.getText());
				Main.checkAnswer(ans);
				} catch (Exception ex) {
					feedbackLabel.setText("Only numbers");
				}
				
				answerField.setText("");
				
			}
		});
		answerField.setHorizontalAlignment(SwingConstants.CENTER);
		answerField.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
		answerField.setColumns(10);
		
		levelLabel = new JLabel("Level: 1");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(levelLabel)
					.addGap(83)
					.addComponent(xEqualLabel, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(answerField, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(125))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(xEqualLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(answerField, GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE))
					.addGap(8))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(levelLabel)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		equationLabel = new JLabel("Equation");
		equationLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
		equationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(equationLabel, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(equationLabel, GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
		
		
	}
	
	
	public void updateEquationLabel(String updatedText) {
		equationLabel.setText(updatedText);
	}
	
	public void updateFeedbackLabel(String updatedText) {
		feedbackLabel.setText(updatedText);
	}
	
	public void answerFieldState(boolean unlocked) {
		answerField.setEditable(unlocked);
	}
	
	public void updateLevelLabel(String updatedText) {
		levelLabel.setText(updatedText);
	}
	
	public void disableTextField() {
		answerField.setEditable(false);
		answerField.setEnabled(false);
	}
	
}

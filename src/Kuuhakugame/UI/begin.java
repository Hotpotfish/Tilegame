package Kuuhakugame.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import Kuuhakugame.basic.Laucher;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class begin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Abstraction a = new RefinedAbstraction();
	/**
	 * Launch the application.
	 */

	private static begin b;
	private JTextField textField_1;

	public static begin getBeginInstence() {
		if (b == null) {
			return new begin();

		} else
			return b;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					begin frame = new begin();
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
	public begin() {
		setTitle("Tony\u7684\u6E38\u620F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 264, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("SAVE THE ANGLE");
		lblNewLabel.setFont(new Font("隶书", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lblNewLabel,
																				GroupLayout.DEFAULT_SIZE,
																				495,
																				Short.MAX_VALUE))
														.addComponent(
																panel,
																GroupLayout.PREFERRED_SIZE,
																239,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE,
								71, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 385,
								Short.MAX_VALUE).addContainerGap()));

		JLabel lblNewLabel_1 = new JLabel("\u8D26\u6237:");
		lblNewLabel_1.setFont(new Font("华文行楷", Font.BOLD, 16));

		JLabel label = new JLabel("\u5BC6\u7801:");
		label.setFont(new Font("华文行楷", Font.BOLD, 16));

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Laucher.getLaucherInstence().run();
				dispose();

			}
		});

		JButton btnNewButton_1 = new JButton("\u8BBE\u7F6E");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a.SetFrame(new option());
				a.sentToScreen();
				dispose();

			}
		});

		JButton btnNewButton_2 = new JButton("\u5E2E\u52A9");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a.SetFrame(new help());
				a.sentToScreen();
			}
		});

		JButton btnNewButton_3 = new JButton("\u9000\u51FA");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING)
																				.addGroup(
																						Alignment.LEADING,
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										lblNewLabel_1)
																								.addGap(18)
																								.addComponent(
																										textField,
																										GroupLayout.PREFERRED_SIZE,
																										151,
																										GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										label,
																										GroupLayout.DEFAULT_SIZE,
																										40,
																										Short.MAX_VALUE)
																								.addGap(18)
																								.addComponent(
																										textField_1,
																										GroupLayout.PREFERRED_SIZE,
																										151,
																										GroupLayout.PREFERRED_SIZE)
																								.addGap(49)))
																.addContainerGap())
												.addGroup(
														Alignment.TRAILING,
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING)
																				.addComponent(
																						btnNewButton_3,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						218,
																						Short.MAX_VALUE)
																				.addComponent(
																						btnNewButton_1,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						228,
																						Short.MAX_VALUE)
																				.addComponent(
																						btnNewButton_2,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						228,
																						Short.MAX_VALUE)
																				.addComponent(
																						btnNewButton,
																						GroupLayout.DEFAULT_SIZE,
																						218,
																						Short.MAX_VALUE))
																.addGap(40)))));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														lblNewLabel_1,
														GroupLayout.PREFERRED_SIZE,
														36,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														textField,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														label,
														GroupLayout.DEFAULT_SIZE,
														30, Short.MAX_VALUE)
												.addComponent(
														textField_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton_1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_3).addGap(159)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}

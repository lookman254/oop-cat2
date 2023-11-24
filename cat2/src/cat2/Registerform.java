package cat2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registerform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nametxt;
	private JTextField Usrnmetxt;
	private JTextField pwdtxt;
	private JTextField Pwdconftxt;
	private JTextField emailtxt;
	private JTextField phonetxt;
	private JTextField Addresstxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerform frame = new Registerform();
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
	public Registerform() {
		setBackground(new Color(153, 193, 241));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegForm = new JLabel("Register Form");
		lblRegForm.setFont(new Font("Dialog", Font.BOLD, 18));
		lblRegForm.setBounds(12, 12, 247, 29);
		contentPane.add(lblRegForm);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(65, 69, 70, 15);
		contentPane.add(lblName);
		
		Nametxt = new JTextField();
		Nametxt.setBounds(222, 67, 560, 19);
		contentPane.add(Nametxt);
		Nametxt.setColumns(10);
		
		JLabel lblUsrName = new JLabel("Username:");
		lblUsrName.setBounds(65, 96, 95, 15);
		contentPane.add(lblUsrName);
		
		JLabel lblPasswd = new JLabel("Password:");
		lblPasswd.setBounds(65, 137, 114, 15);
		contentPane.add(lblPasswd);
		
		JLabel lblPswdconfm = new JLabel("Confirm Password:");
		lblPswdconfm.setBounds(65, 182, 139, 15);
		contentPane.add(lblPswdconfm);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(65, 229, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(65, 277, 70, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(65, 329, 70, 15);
		contentPane.add(lblAddress);
		
		Usrnmetxt = new JTextField();
		Usrnmetxt.setBounds(222, 94, 560, 19);
		contentPane.add(Usrnmetxt);
		Usrnmetxt.setColumns(10);
		
		pwdtxt = new JTextField();
		pwdtxt.setBounds(222, 135, 560, 19);
		contentPane.add(pwdtxt);
		pwdtxt.setColumns(10);
		
		Pwdconftxt = new JTextField();
		Pwdconftxt.setBounds(222, 180, 560, 19);
		contentPane.add(Pwdconftxt);
		Pwdconftxt.setColumns(10);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(222, 227, 560, 19);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);
		
		phonetxt = new JTextField();
		phonetxt.setBounds(222, 275, 560, 19);
		contentPane.add(phonetxt);
		phonetxt.setColumns(10);
		
		Addresstxt = new JTextField();
		Addresstxt.setBounds(222, 327, 560, 19);
		contentPane.add(Addresstxt);
		Addresstxt.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = Nametxt.getText();
                String username = Usrnmetxt.getText();
                String password = pwdtxt.getText();
                String confirmPassword = Pwdconftxt.getText();
                String email = emailtxt.getText();
                String phone = phonetxt.getText();
                String address = Addresstxt.getText();
                
                System.out.println("Form submitted successfully!");
				
			}
		});
		btnSubmit.setBounds(167, 400, 117, 25);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				     Nametxt.setText("");
	                Usrnmetxt.setText("");
	                pwdtxt.setText("");
	                Pwdconftxt.setText("");
	                emailtxt.setText("");
	                phonetxt.setText("");
	                Addresstxt.setText("");
			}
		});
		btnReset.setBounds(415, 400, 117, 25);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 System.exit(0);
			}
		});
		btnClose.setBounds(674, 400, 117, 25);
		contentPane.add(btnClose);
	}
}

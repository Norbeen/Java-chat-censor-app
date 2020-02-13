import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class test extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;

	User Users = new User();
	Sarah sara= new Sarah();
	Random rand = new Random();
	static String[] names = {"manoj","nabin","samir"};	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	chatLog();
		    } 
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
	}
	
	
	public void chatLog( ) {
		int u ;
		Users.generateMessage();
	//	Users.censor(incidents);
		//Users.censoredChat();
		
		
		//textField.setText(Users.censoredMessage);
		
		for (int i = 0; i <= 20; i++) {
		u = rand.nextInt(3);
			textField.setText(Users.banned);
			
			
			textField.setText(textField.getText() +"\n"+ names[u] + "");
	}
			
	
				
	

		 return;

}
}

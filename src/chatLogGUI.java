//----------------------------------------------------------------------------------------------------------
//Final Programming Project
//Names: Balram Patricia, Baral Nabin, Bradley Donghlik, Denning Robert
//File Name: chatLogGUI.java
//Program description: Program generates quotes from a set of three users. Certain quotes have profanity
//the program keeps track of this and then reflects their status based on the amount of offenses. Profanity
//is initially censored, but the full incidents are shown in another window. Certain users are more likely
//to cause offenses than others.
//IDE Used: Eclipse
//----------------------------------------------------------------------------------------------------------
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.util.*;
import java.lang.String;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.List;
import java.util.Stack;


public class chatLogGUI {

	private static JFrame frmChatlogFrame;
	private static JPanel frmChatlog;
	private static JTextArea txtChat;
	private static JTextArea txtIncident;
	private static JTextArea txtBanned;
	private static JButton btnGenerate;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chatLogGUI window = new chatLogGUI();
					window.frmChatlog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
		




	/**
	 * Create the application.
	 */
	public chatLogGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		frmChatlogFrame = new JFrame();
		frmChatlog = new JPanel();
		frmChatlogFrame.setTitle("Chat Log");
		frmChatlogFrame.setBounds(100, 100, 1066, 701);
		frmChatlog.setBounds(100, 100, 1066, 701);

		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE CHATLOG CENSORSHIP");
		lblWelcomeToThe.setBounds(290, 16, 497, 47);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(6, 75, 1060, 30);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(631, 91, 46, 552);
		
		JLabel lblUserCensoredChat = new JLabel("BANNED USERS: ");
		lblUserCensoredChat.setBounds(700, 159, 154, 30);
		lblUserCensoredChat.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnExit.setBounds(949, 6, 117, 29);
		frmChatlog.setLayout(null);
		frmChatlog.add(lblWelcomeToThe);
		frmChatlog.add(horizontalStrut);
		frmChatlog.add(verticalStrut);
		frmChatlog.add(lblUserCensoredChat);
		frmChatlog.add(btnExit);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(6, 639, 1054, 15);
		frmChatlog.add(horizontalStrut_1);

		
		JLabel lblNewLabel = new JLabel("GENERATE LOGS: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 159, 213, 30);
		frmChatlog.add(lblNewLabel);

        JLabel lblNewLabelIncident = new JLabel("INCIDENTS: ");
        lblNewLabelIncident.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabelIncident.setBounds(360, 159, 213, 30);
        frmChatlog.add(lblNewLabelIncident);

		txtChat = new JTextArea();
		txtChat.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		txtChat.setBounds(20, 207, 320, 391);
		JScrollPane chatPane = new JScrollPane(txtChat);
		chatPane.setBounds(20, 207, 320, 391);
		chatPane.setVisible(true);
		frmChatlog.add(chatPane);
		
		txtBanned = new JTextArea();
		txtBanned.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		txtBanned.setBounds(700, 207, 342, 384);
		JScrollPane bannedPane = new JScrollPane(txtBanned);
		bannedPane.setBounds(700, 207, 342, 384);
		bannedPane.setVisible(true);
		frmChatlog.add(bannedPane);
		
		txtIncident = new JTextArea();
		txtIncident.setBounds(360, 207, 320, 391);
		txtIncident.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JScrollPane incidentPane = new JScrollPane(txtIncident);
		incidentPane.setBounds(360, 207, 320, 391);
        incidentPane.setVisible(true);
        frmChatlog.add(incidentPane);


        btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String chatlogs;
				String bannedStat;
				
				Sam Sam = new Sam();
				Sarah Sarah = new Sarah();
				Sophia Sophia = new Sophia();
				User[] Users = new User[3];
				Random rand = new Random();
			
				
				
				Stack<String> incidents = new Stack<String>();
				Stack<String> incidentsOrder = new Stack<String>();
				
				//Stacks to show incidents
				
				
				//Populating the array of users
				Users[0] = Sam;
				Users[1] = Sarah;
				Users[2] = Sophia;
			
				
				
				txtChat.setText("Chat List\n");
				chatLogGUI.chatLog(Users, rand, incidents);
				
				displayIncidents(incidents, incidentsOrder);
			

				
				displayStatus(Users);
			

				
			}
		});
		btnGenerate.setBounds(220, 159, 117, 29);
		frmChatlog.add(btnGenerate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtChat.setText("");
				txtIncident.setText("");
				txtBanned.setText("");
			}
		});
		btnReset.setBounds(949, 97, 117, 29);
		frmChatlog.add(btnReset);

		JScrollPane pane  = new JScrollPane(frmChatlog);
		frmChatlogFrame.add(pane);
		frmChatlogFrame.setVisible(true);
		frmChatlogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	public static void chatLog(User[] Users, Random rand, Stack<String> incidents) {
		String result = "";
		for (int i = 0; i < Users.length; i++) {
			Users[i].chatStart();
		}
		for (int i = 0; i <= 20; i++) {
			int u = rand.nextInt(3);
			Users[u].generateMessage();
			Users[u].check();
			Users[u].separate();
			Users[u].censor(incidents);
			System.out.println(Users[u].nameCheck() + ": " + Users[u].censoredChat());
			result += Users[u].nameCheck() + ": " + Users[u].censoredChat() +"\n";
			Users[u].clear();

		} //End of for loop to print out random quotes from random users
		txtChat.setText(result);

	} //End of chatLog method
	
	public void displayIncidents(Stack<String> incidents, Stack<String> incidentsOrder) {
		while(!incidents.isEmpty()) {
			String result = "";
			incidentsOrder.push(incidents.pop());
		}
		String result="";
			while (!incidentsOrder.isEmpty()) {
				result += incidentsOrder.pop() +"\n";
			}
			System.out.println("This is the result: "+ result);
			txtIncident.setText("\n"+ result);
	}

	//Prints out table of usernames, their respective status, and offense counter
	public static void displayStatus(User[] Users) {
		System.out.println("---------------------------");
		System.out.printf("%-9s%-10s%-7s", "User", "Status", "Offenses");
		System.out.println();
		for (int i=0; i < Users.length; i++) {
			System.out.printf("%-9s%-10s%-7s", Users[i].nameCheck(), Users[i].banCheck(), Users[i].counterCheck());
			System.out.println();
		}
		System.out.println("---------------------------");
		System.out.println("If a user reaches 3");
		System.out.println("offenses. They are");
		System.out.println("banned.");
		System.out.println("---------------------------");

		String result = "";
        Formatter format = new Formatter();
		result += "---------------------------\n";
		result = format.format("\n%-9s%-10s%-7s", "User", "Status", "Offenses")+"\n";
		for (int i=0; i < Users.length; i++) {
			result = format.format("\n%-9s%-10s%-7s", Users[i].nameCheck(), Users[i].banCheck(), Users[i].counterCheck())+"\n";

		}
		result += "---------------------------\n"+"If a user reaches 3\n"+"offenses. They are\n"+" banned. One offense is\n"+"removed at the start of\n" + "each chat.\n " +"----------------------------\n";
		txtBanned.setText(result);

	}
	
	}
		
//}


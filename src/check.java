//Final Programming Project

//Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.String;
import java.util.Stack;

public class check {
	//Main method. For now this is just going to be used as a driver to test code
	public static void main(String[] args) {
		//Variable declaration
		Sam Sam = new Sam();
		Sarah Sarah = new Sarah();
		Sophia Sophia = new Sophia();
		User[] Users = new User[3];
		Random rand = new Random();
		//Stacks to show incidents
		Stack<String> incidents = new Stack<String>();
		Stack<String> incidentsOrder = new Stack<String>();
		
		//Populating the array of users
		Users[0] = Sam;
		Users[1] = Sarah;
		Users[2] = Sophia;
		
	
		//displayIncidents(incidents, incidentsOrder);
		System.out.println("");
		
		
	}
	
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
		System.out.println("banned. One offense is");
		System.out.println("removed at the start of");
		System.out.println("each chat.");
		System.out.println("---------------------------");
	}

	
} //End of QuotesChat class definition

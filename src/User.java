//Apparently you need to use import statements for classes...
import java.util.Random;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Super class for users. The users are going to be defined 4 different times (and maybe one for an
//admin/professor type user) Each with varying, unique quotes
public class User {
	
	//Each user needs to have a random number generator to select a random string to print
	Random rand = new Random();
	String nameTag;
	//Just gonna have the user's message declared as an individual variable so it's a little more friendly with the other methods...
	String message = null;
	String censoredMessage = "";
	//Each user will have a counter for incidents and a linked list to separate their message into individual words for review!
	private int counter=0;
	private boolean ban = false;
	String banned = "BANNED", online = "ONLINE";
	static List<String> words = new LinkedList<String>();
	
	
	//Moved the curse array to a single declaration rather than inside the body of a method. Saves memory.
	final String[] curse = {"bullshit","fuck","fuckery","fucking","ass","damn","shit","bullshit.","\"Fuck\"","\"Fuck","ass.","damn.","Fuck","shit.","crap","ass?","hell","Hell","asses"};
	final String redact = "[Redacted]";
	
	//constructor
	User() {}
	
	//The user's offense counter is decremented by one for each chat log generated, that way they get unbanned eventually
	public void chatStart() {
		if (counter >= 3) {
			counter--;
		}
	}
	
	//generateMessage method to be overwritten(generates the message a user would like to send to the chat)
	public void generateMessage() {
		message = "this is a fucking test";
	} //End of generic chat method definition
	
	//check method, if the user has too many offenses their message is overwritten
	public void check() {
		if (ban == true) {
			message = "USER IS BANNED";
		}
	}
	
	//separates the user's desired message into a list so each individual word can be check for bannable words
	public void separate() {
		String[] div = message.split("\\s");
		
		//The words from the user's desired message then populate the words list
		for (int i = 0; i < div.length; i++)
			words.add(div[i]);
	}
	
	//Method to censor the user's desired message
	public void censor(Stack<String> incidents) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < curse.length; j++) {
				//Compares the words to blacklisted words and censors accordingly. The relevant message is then added to a stack for incidents and the user's incident counter is incremented
				if (words.get(i).compareTo(curse[j]) == 0) {
					incidents.push(nameTag + ": " + message);
					words.set(i, redact);
					counter++;
					if (counter >= 3) {
						ban = true;
					}
				}//End of conditional to censor
			}//End of secondary loop
		} //End of primary loop
	}
	
	//Method to generate the censored message! (also resets the words list!)
	public String censoredChat() {
		for (int i = 0; i < words.size(); i++) {
			censoredMessage += words.get(i) + " ";
		}
		//List is emptied to be used again
		words.clear();
		//Censored message is then returned
		return censoredMessage;
	}
	
	//Censored message is cleared so as to not overlap with the next message to be sent
	public void clear() {
		censoredMessage = "";
	}
	
	
	//Debugging methods
	
	//Returns the list of words to see if it was generated properly!
	public List<String> returnWords() {
		return words;
	}
	
	//Returns the user's uncensored message
	public String chat() {
		return message;
	}
	
	//Returns the user's incident counter
	public int counterCheck() {
		return counter;
	}
	
	//Returns the user's ban status
	public String banCheck() {
		if (ban == true) {
			return banned;
		}
		else {
			return online;
		}
	}
	
	//Returns the user's name tag
	public String nameCheck() {
		return nameTag;
	}
	
} //End of user definition

//This is the 2nd user: Sarah. Sarah is a bit nihilistic and curses 1/4 of the time
//She's also apparently a massive Marty Rubin fan...

public class Sarah extends User {
	//Constructor
	Sarah() {
		nameTag = "Sarah";
	}
	//Sarah's phrases
	String[] phrases = new String[] {
			"I can't go on, I'll go on. -Samuel Beckett",
			"There must be somebody there, because somebody must have said \"Nobody.\" -A.A. Milne",
			"The point is there ain't no point. -Cormac McCarthy",
			"Jeder für sich und Gott gegen alle. -Werner Herzog",
			"Nothing matters very much and most things don't matter at all. -Arthur Balfour",
			"You aren't rich if you have to be careful. -Dennis Canfield",
			"Expect nothing. Everything else is a sweet surprise. -Lee Tockar",
			"Hell is other people. -Jean Paul Sartre",
			"They see a void. I see everything that fills it. -Marty Rubin",
			"Nothing exists, all is shadow and illusion. -Bangambiki Habyarimana",
			"Even the faded flower denies nothingness. -Marty Rubin",
			"Nihilism is a subject for comedy. -Marty Rubin",
			"Chasms are deceived by rumors of their depth. -Marty Rubin",
			"Nothing is more seductive than nothing. -Marty Rubin",
			"One explains things until things have no meaning anymore. -Marty Rubin",
			//These are the quotes with profanity
			"I've been accused of vulgarity. I say that's bullshit. -Mel Brooks",
			"If you can't say \"Fuck\" you can't say, \"Fuck the government.\" -Lenny Bruce",
			"What kind of fuckery is this? -Amy Winehouse",
			"I am definitely not a fucking toaster. -Jim Chaseley",
			"Sometimes you just have to tell your fear to kiss your ass. -Junnita Jackson"
			
	};
	
	//Here is the method to print out a random string from the array (will be edited later once io files are figured out!)
	public void generateMessage() {
		int n = rand.nextInt(20);
		//The message is concatenated with the user's name!
		message = phrases[n];
	} //End of generateMessage method definition
	
	//Debugging methods
	//Returns the user's name
		public String nameCheck() {
			return nameTag;
		}
}

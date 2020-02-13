//This is the third user: Sophia. Sophia is a romantic, but also curses 1/2 of the time

public class Sophia extends User {
	//Constructor
	Sophia() {
		nameTag = "Sophia";
	}
	//Sophia's phrases
	String[] phrases = new String[] {
			"We love because it’s the only true adventure. -Nikki Giovanni",
			"We accept the love we think we deserve. -Stephen Chbosky",
			"Love harder than any pain you've ever felt. -Unknown",
			"Love loves to love love. -James Joyce",
			"When love is not madness, it is not love. -Pedro Calderon de la Barca",
			"Love is friendship set on fire. -Jeremy Taylor",
			"I have found that if you love life, life will love you back. -Arthur Rubinstein",
			"Love is never wrong. -Melissa Etheridge",
			"Where there is love, there is life. -Mahatma Gandhi",
			//These are the quotes with profanity
			"Style is knowing who you are, what you want to say, and not giving a damn. -Orson Welles",
			"Fuck the world and never tell them I love you. -M.F. Moonzajer",
			"Don't let the past fuck your future. -Deyth Banger",
			"Things are called shit for a reason, dear. -Chloe Jun",
			"Go, follow your heart and fuck yourself. -Sudheer Reddy",
			"Life is unbearable pile of shit. -Deyth Banger",
			"It's when you tolerate crap that you find yourself knee deep in waste. -Anthony Hincks",
			"How come life is so full of crap at times? -Anthony Hincks",
			"I have been an author for 20 years and an ass for 55. -Mark  Twain",
			"Where are you taking that ass? -Apuleius",
			"I'm not a religious man, but I do worship your ass. -Randi Black"
	};
	
	//Here is the method to print out a random string from the array (will be edited later once io files are figured out!)
	public void generateMessage() {
		int n = rand.nextInt(20);
		//The message is concatenated with the user's name!
		message = phrases[n];
	} //End of generateMessage method definition
	
	//debugging methods
	//Returns the user's name
		public String nameCheck() {
			return nameTag;
		}
}

//What differentiates these specific users from the User class is the array of strings they have
//Each user's array is going to contain varying amounts of offenses
//This is the 1st user: Sam. Sam does not curse at all. Sam mostly likes to share motivational quotes

public class Sam extends User {
	//Constructor
	Sam() {
		nameTag = "Sam";
	}
	//No idea what is a good amount of strings for now. These are just test strings to see if the RNG works!
	String[] phrases = new String[] {
			"You miss 100% of the shots you don’t take. –Wayne Gretzky",
			"Strive not to be a success, but rather to be of value. –Albert Einstein",
			"I attribute my success to this: I never gave or took any excuse. –Florence Nightingale",
			"Every strike brings me closer to the next home run. –Babe Ruth",
			"Life is what happens to you while you’re busy making other plans. –John Lennon",
			"We become what we think about. –Earl Nightingale",
			"Life is 10% what happens to me and 90% of how I react to it. –Charles Swindoll",
			"The mind is everything. What you think you become.  –Buddha",
			"An unexamined life is not worth living. –Socrates",
			"Eighty percent of success is showing up. –Woody Allen",
			"Winning isn’t everything, but wanting to win is. –Vince Lombardi",
			"Every child is an artist.  The problem is how to remain an artist once he grows up. –Pablo Picasso",
			"Either you run the day, or the day runs you. –Jim Rohn",
			"The best revenge is massive success. –Frank Sinatra",
			"Life shrinks or expands in proportion to one's courage. –Anais Nin",
			"There is only one way to avoid criticism: do nothing, say nothing, and be nothing. –Aristotle",
			"The only person you are destined to become is the person you decide to be. –Ralph Waldo Emerson",
			"Everything has beauty, but not everyone can see. –Confucius",
			"When I let go of what I am, I become what I might be. –Lao Tzu",
			"Happiness is not something readymade.  It comes from your own actions. –Dalai Lama",
						
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

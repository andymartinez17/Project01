
//
// Implement the tweet class according to the problem_set specifications.
//

class Tweet {

	//Attributes
 public int tweetid;
 public String tweetSentiment;
 public String tweetText;
 // Define the Attributes

//constructor.
public Tweet(int id, String sentiment, String msg) {

this.tweetid =  id;
this.tweetSentiment = sentiment;
this.tweetText = msg;

}


  // Override the toString method.
public String toString() {
	return String.format("%d (%s) : %s",this.tweetid, this.tweetSentiment, this.tweetText);
	
}

}

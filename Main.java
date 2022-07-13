import java.util.ArrayList;
import java.io.IOException;

class Main {

  public static void main(String[] args) {

      // Implement the main method according the the program specification

			
			ArrayList<Tweet> mylist  = new ArrayList<Tweet>();
			try {
			mylist = TweetLoader.loadAsArrayList("tweet_data.csv");
			  
			  
  } catch (IOException e) {
	  System.out.println(e);
  }
		for (int i = 0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
  //
  // Add any methods, specific to the Main class
  // based on the problem set specification.
  //


  }
} // end of Main class

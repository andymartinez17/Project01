import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TweetLoader {
	
	public static ArrayList<Tweet> loadAsArrayList(String filename) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
		String line = null;
		
		
		while ((line = reader.readLine()) !=null) {
			
		String[] tweet_data =line.split(",");
		
		Tweet new_tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]);
		
		tweetList.add(new_tweet);
		
		
		}
			reader.close();
		return tweetList;
		
		
		
		
	}
	
	


}  // end of TweetLoader class.

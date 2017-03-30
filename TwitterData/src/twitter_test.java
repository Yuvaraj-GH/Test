import java.util.List;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Status;


public class twitter_test {

	/**
	 * @param args
	 * @throws TwitterException 
	 */
	public static void main(String[] args) throws TwitterException {
		
		ConfigurationBuilder configurationBuilder=new ConfigurationBuilder();
		
		configurationBuilder.setDebugEnabled(true)
		.setOAuthConsumerKey("")
		.setOAuthConsumerSecret("")
		.setOAuthAccessToken("")
		.setOAuthAccessTokenSecret("");
		
		
		TwitterFactory twitterFactory=new TwitterFactory(configurationBuilder.build());
		
		twitter4j.Twitter twitter=twitterFactory.getInstance();
		System.out.println(twitter.getOAuthAccessToken());
		List<Status> status=twitter.getHomeTimeline();
		
		for(Status s :status){
		
		System.out.println(s.getUser().getName()+ "  "+s.getText());
		}
		}
	
	}



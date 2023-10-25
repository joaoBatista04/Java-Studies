package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class User {

    private String twitterId;
    private List<Tweet> tweets = new LinkedList<>();

    public User(String id)
    {
        this.twitterId=id;
    }

    public String getId() {
        return this.twitterId;
    }

    public void addTweet(Tweet t)
    {
        tweets.add(t);
    }

    public List<Tweet> getTweets()
    {
        return new LinkedList<Tweet>(tweets);
    }
}

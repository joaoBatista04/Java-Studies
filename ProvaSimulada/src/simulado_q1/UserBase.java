package simulado_q1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserBase {
    private Map<String,User> users = new HashMap<>();

    public Set<User> getUsers()
    {
        return new HashSet<User>(users.values());
    }

    public User createUser(String id, boolean isVerified) throws IdAlreadyUsed {
        if (users.containsKey(id)) throw new IdAlreadyUsed();
        User u = isVerified? new VerifiedUser(id) : new User(id);
        users.put(u.getId(), u);
        return u;
    }


    public double getPercentageVerifiedUsers()
    {
        if (users.isEmpty()) return 0.0;
        double nVerifiedUsers=0.0;
        for(User u: users.values())
        {
            if (u instanceof VerifiedUser) {
                nVerifiedUsers++;
            }
        }
        return nVerifiedUsers/users.size();
    }

    public double averageTweetLength()
    {
        double sum=0.0;
        int nTweets=0;
        for(User u : users.values())
        {
            for(Tweet t : u.getTweets())
            {
                sum+=t.getText().length();
                nTweets++;
            }
        }
        return sum/nTweets;
    }
}

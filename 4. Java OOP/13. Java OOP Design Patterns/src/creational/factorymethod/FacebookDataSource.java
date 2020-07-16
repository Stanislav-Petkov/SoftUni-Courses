package creational.factorymethod;

import java.util.List;

public class FacebookDataSource implements SocialMediaDataSource {
    @Override
    public List<String> getPublicationsForUser(String userId) {
        //calls facebook
        //returns posts for that user
        return null;
    }
}

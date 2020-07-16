package creational.factorymethod;

import java.util.List;

public interface SocialMediaDataSource {

    List<String> getPublicationsForUser(String userId);
}

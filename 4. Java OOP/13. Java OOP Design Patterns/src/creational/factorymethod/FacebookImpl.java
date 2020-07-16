package creational.factorymethod;

import java.util.List;

public class FacebookImpl extends FactoryMethod {
    @Override
    protected SocialMediaDataSource getDataSource() {
        return new FacebookDataSource();
    }

    @Override
    protected SocialMediaRepository getRepository() {
        return new SocialMediaRepository() {
            @Override
            public void save(List<String> posts) {
                //some repo saving stuff
            }
        };
    }
}

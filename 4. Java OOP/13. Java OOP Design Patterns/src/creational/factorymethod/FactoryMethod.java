package creational.factorymethod;

public abstract class FactoryMethod {

    public final void fetchNewPostsForUser(String user) {
        SocialMediaDataSource instance = getDataSource();
        SocialMediaRepository repository = getRepository();
        try {
            var publications = instance.getPublicationsForUser(user);
            repository.save(publications);
            System.out.println("great success");
        } catch (Exception e) {
            System.out.println("something went horribly wrong");
        }
    }

    protected abstract SocialMediaDataSource getDataSource();

    protected abstract SocialMediaRepository getRepository();
}

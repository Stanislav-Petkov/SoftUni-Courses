package singleResponsibilityExuserPermissions;

import singleResponsibilityExuserPermissions.repositories.ResourceRepository;
import singleResponsibilityExuserPermissions.resources.Resource;
import singleResponsibilityExuserPermissions.users.User;

public class UserService {
    private ResourceRepository resourceRepository;

    UserService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public void readResourceFor(User user) {
        Resource resource = resourceRepository.fetchOne();
        user.read(resource);
    }
}














package singleResponsibilityExuserPermissions.repositories;

import singleResponsibilityExuserPermissions.resources.Picture;
import singleResponsibilityExuserPermissions.resources.Resource;

public class PictureRepository implements ResourceRepository {

    @Override
    public Resource fetchOne() {
        return new Picture();
    }
}

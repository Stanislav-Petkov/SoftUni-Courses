package singleResponsibilityExuserPermissions.repositories;

import singleResponsibilityExuserPermissions.resources.File;
import singleResponsibilityExuserPermissions.resources.Resource;

public class FileRepository implements ResourceRepository {

    @Override
    public Resource fetchOne() {
        return new File();
    }
}

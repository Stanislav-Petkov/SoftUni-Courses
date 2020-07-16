package singleResponsibilityExuserPermissions.repositories;

import singleResponsibilityExuserPermissions.resources.Resource;
import singleResponsibilityExuserPermissions.resources.TextFile;

public class TextFileRepository implements ResourceRepository {

    @Override
    public Resource fetchOne() {
        return new TextFile();
    }
}

package singleResponsibilityExuserPermissions;


import singleResponsibilityExuserPermissions.repositories.TextFileRepository;
import singleResponsibilityExuserPermissions.resources.*;
import singleResponsibilityExuserPermissions.users.Admin;
import singleResponsibilityExuserPermissions.users.User;

public class Main {
    //ADMIN - read all , write all
    // RegularUser - read all, write file
    // Guest  read picture, write non
    public static void main(String[] args) {
        UserService userService = new UserService(new TextFileRepository());
        User admin = new Admin();
        userService.readResourceFor(admin);
    }
}















/*

public class Main {
    //ADMIN - read all , write all
    // RegularUser - read all, write file
    // Guest  read picture, write non
    public static void main(String[] args) {
        Picture pic = new Picture();
        File file = new TextFile();
        Resource music = new Music();

        User admin = new Admin();

        admin.read(file);
        admin.read(pic);
        admin.read(music);
    }
}
 */





package viceCity;

import viceCity.core.ControllerImpl;
import viceCity.core.EngineImpl;
import viceCity.core.interfaces.Controller;
import viceCity.core.interfaces.Engine;
public class Main {
    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();

//TODO da smenq na CIVIL PLayer life points ot 15 na 50
        //main playet life points 100


    }
}

/*
Gun test
        BaseGun rifle = new Rifle("Test");
        System.out.println(rifle.getName());
        System.out.println(rifle.getBulletsPerBarrel());
       // System.out.println(pistol.getLifePoints());
        rifle.fire();
        System.out.println(rifle.getBulletsPerBarrel());

 */

/*
fire test
  BaseGun rifle = new Rifle("Test");
        for (int i = 0; i < 250 ; i++) {

            System.out.println("Fire :" + rifle.fire());
            System.out.println("Bullets in barrel : " + rifle.getBulletsPerBarrel());
            System.out.println("Total in barrel : " + rifle.getTotalBullets());
                        System.out.println("Counter :" + i);

        }
 */

/*
pistol test
 BaseGun pistol = new Pistol("Test");
        for (int i = 0; i < 250 ; i++) {

            System.out.println("Fire :" + pistol.fire());
            System.out.println("Bullets in barrel : " + pistol.getBulletsPerBarrel());
            System.out.println("Total in barrel : " + pistol.getTotalBullets());
            System.out.println("Counter :" + i);
        }

 */

/*
        BasePlayer basePlayer = new MainPlayer();
        System.out.println(basePlayer.getName());
        System.out.println(basePlayer.getLifePoints());
        System.out.println(basePlayer.getGunRepository());

        BasePlayer civilPlayer = new CivilPlayer(" ");
        System.out.println(civilPlayer.getName());
        System.out.println(civilPlayer.getLifePoints());
        System.out.println(civilPlayer.getGunRepository());
 */
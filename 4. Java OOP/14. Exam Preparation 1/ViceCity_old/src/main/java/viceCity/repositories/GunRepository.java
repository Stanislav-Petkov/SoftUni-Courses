package viceCity.repositories;

import viceCity.models.guns.Gun;
import viceCity.models.players.Player;
import viceCity.repositories.interfaces.Repository;

import java.util.*;

public class GunRepository implements Repository {
    private List<Gun> models;

//The gun repository holds information about a player's guns.

    public GunRepository(){
        models = new ArrayList<>();
    }

    @Override
    public Collection getModels() {
        return this.models;
    }

    @Override
    public void add(Object model) {
        Gun newGun = (Gun) model;
        boolean isNotContained = true;
        for (Gun gun : this.models) {
            if(gun.getName().equals(newGun.getName())){
                isNotContained = false;
            }
        }
        if(isNotContained){
            this.models.add(newGun);
        }
    }

    @Override
    public boolean remove(Object model) {
        Gun gun = (Gun) model;
        if(this.models.contains(gun)){
            return this.models.remove(gun);
        }
        return false;
    }

    @Override
    public Object find(String name) {
        for (Gun model : this.models) {
            if(name.equals(model.getName())){
                return model;
            }
        }
        return null;
    }
}

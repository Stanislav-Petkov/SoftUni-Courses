package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

public class GunRepository implements Repository<Gun> {
    private Deque<Gun> guns;

    public GunRepository() {
        this.guns = new ArrayDeque<>();
    }

    @Override
    public Collection<Gun> getModels() {
        return Collections.unmodifiableCollection(this.guns);
    }

    @Override
    public void add(Gun model) {
        this.guns.offer(model);
    }

    @Override
    public boolean remove(Gun model) {
        return this.guns.removeIf(g -> g.getName().equals(model.getName()));
    }

    @Override
    public Gun find(String name) {
        for (Gun gun : guns) {
            if (gun.getName().equals(name)) {
                return gun;
            }
        }
        return null;
    }
}

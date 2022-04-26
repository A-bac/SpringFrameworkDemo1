package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Phone")
public class Phone {
    private String mob;

    public Phone() {
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

    public String getMob() {
        return mob;
    }

    @Autowired
    public void setMob(String mob) {
        this.mob = mob;
    }
}

package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Student")
public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student() {
    }

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAdd() {
        return add;
    }

    @Autowired
    @Qualifier("id")
    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired(required = false)
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    @Autowired(required = false)
    public void setAdd(Address add) {
        this.add = add;
    }
}

package by.tc.test.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "super_user")
public class SuperUser implements Serializable {

    private static final long serialVersionUID = 8017174700541660477L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public SuperUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + "}";
    }
}
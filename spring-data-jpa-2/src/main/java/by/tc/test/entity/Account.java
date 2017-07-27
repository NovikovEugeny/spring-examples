package by.tc.test.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {

    private static final long serialVersionUID = -8092535051180398509L;

    private int id;
    private User user;
    private double balance;

    public Account() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne
    @JoinColumn(name = "client_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
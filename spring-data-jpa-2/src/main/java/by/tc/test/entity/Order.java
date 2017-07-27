package by.tc.test.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 7946715111086122031L;

    private int id;
    private User user;
    private String pharmacistId;
    private double cost;
    private Date requestDate;
    private Date responseDate;
    private String status;

    private Set<Recipe> recipes;

    public Order() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "pharmacist_id")
    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Column(name = "request_date")
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Column(name = "response_date")
    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToMany(mappedBy = "orders", fetch = FetchType.EAGER)
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pharmacistId='" + pharmacistId + '\'' +
                ", cost=" + cost +
                ", requestDate=" + requestDate +
                ", responseDate=" + responseDate +
                ", status='" + status + '\'' +
                '}';
    }
}
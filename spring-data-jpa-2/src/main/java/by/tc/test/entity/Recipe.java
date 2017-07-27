package by.tc.test.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe implements Serializable {

    private static final long serialVersionUID = 7084319643144551061L;

    private String code;
    private User user;
    private String doctorId;
    private int drugId;
    private int quantity;
    private Date startDate;
    private Date endDate;
    private String status;

    private List<Order> orders;

    public Recipe() {
    }

    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "doctor_id")
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @Column(name = "drug_id")
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_recipe",
            joinColumns = @JoinColumn(name = "recipe_code", referencedColumnName = "code"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "code='" + code + '\'' +
                ", patient='" + user + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", drugId=" + drugId +
                ", quantity=" + quantity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                '}';
    }
}
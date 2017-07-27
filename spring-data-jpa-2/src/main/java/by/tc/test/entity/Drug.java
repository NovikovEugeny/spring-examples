package by.tc.test.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "drugs")
public class Drug implements Serializable {

    private static final long serialVersionUID = -3425426884567547656L;

    private int id;
    private String name;
    private String pharmGroup;
    private String form;
    private String drugAmount;
    private String activeSubstances;
    private String country;
    private String dispensing;
    private double price;
    private int quantity;
    private String isActive;

    public Drug() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Column(name = "pharm_group")
    public String getPharmGroup() {
        return pharmGroup;
    }

    public void setPharmGroup(String pharmGroup) {
        this.pharmGroup = pharmGroup;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Column(name = "drug_amount")
    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount;
    }

    @Column(name = "active_substances")
    public String getActiveSubstances() {
        return activeSubstances;
    }

    public void setActiveSubstances(String activeSubstances) {
        this.activeSubstances = activeSubstances;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDispensing() {
        return dispensing;
    }

    public void setDispensing(String dispensing) {
        this.dispensing = dispensing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "is_active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pharmGroup='" + pharmGroup + '\'' +
                ", form='" + form + '\'' +
                ", drugAmount='" + drugAmount + '\'' +
                ", activeSubstances='" + activeSubstances + '\'' +
                ", country='" + country + '\'' +
                ", dispensing='" + dispensing + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
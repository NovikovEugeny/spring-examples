package by.tc.test.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 5472666490925965544L;

    private String id;
    private String position;
    private String surname;
    private String name;
    private String patronymic;
    private String mobile;
    private String password;
    private String isActive;

    private Account account;
    private List<Recipe> recipes;
    private List<Order> orders;

    public User() {
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Column(name = "mobile_phone")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "is_active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @OneToOne(mappedBy = "user")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    /*При работе с сущностями, которые содержат коллекции других сущностей,
    возникает проблема известная как «N+1 selects».
    Первый запрос выберет только корневые сущности,
    а каждая связанная коллекция будет загружена отдельным запросом.
    FetchMode в Hibernate говорит как мы хотим, чтоб связанные сущности или коллекции были загружены:
      — SELECT — используя по дополнительному SQL запросу на коллекцию,
      — JOIN — в одном запросе с корневой сущностью, используя SQL оператор JOIN,
      — SUBSELECT— в дополнительном запросе, используя SUBSELECT.
    */
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SELECT)
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", isActive='" + isActive + '\'' +
                ", account=" + account +
                '}';
    }
}
package org.gkid.uaa.entity;

import jakarta.persistence.*;
import org.gkid.uaa.common.UserType;

@Entity(name = "user_accounts")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone", columnDefinition = "varchar(10)")
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", columnDefinition = "varchar(10)")
    private UserType userType = UserType.CUSTOMER;

    public UserAccount(Integer id, String firstName, String lastName, String email, String phone, UserType userType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.userType = userType;
    }

    public UserAccount() {

    }

    public Integer getId() {
        return id;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
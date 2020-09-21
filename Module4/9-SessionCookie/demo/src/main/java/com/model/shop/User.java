package com.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Size(min = 5, max = 32)
    private String account;
    @Column(unique = true)
    @Email
    @Size(min = 5, max = 64)
    private String email;
    @Size(min = 5, max = 18)
    private String password;

    public User() {
    }

    public User(long id, @NotBlank @Size(min = 5, max = 32) String account, @Email @Size(min = 5, max = 64) String email, @Size(min = 5, max = 18) String password) {
        this.id = id;
        this.account = account;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

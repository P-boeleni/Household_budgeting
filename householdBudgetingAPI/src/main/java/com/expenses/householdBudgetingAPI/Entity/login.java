package com.expenses.householdBudgetingAPI.Entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

/**
 * @author Takahiro Hirose
 * login Entity Class
 */

@Entity
@Data
@Table (name = "login")
public class login {

    @Id
    @Column(name = "id")
    // AUTO_INCREMENTをSQL任せに
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // login時に使用するid
    @Column(name = "login_id")
    private String loginId;

    // password
    @Column(name = "password")
    private String password;

    // admin
    @Column(name = "admin")
    private int admin;
}

package com.expenses.householdBudgetingAPI.Entity;

import lombok.Data;
import jakarta.persistence.Entity ;
import jakarta.persistence.Id ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table ;
import jakarta.persistence.Column ;

@Entity
@Data
@Table(name = "buy")
public class buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login_id")
    private int loginId;

    @Column(name = "tag_id")
    private int tagId;

    @Column(name = "total_price")
    private int totalPrice;

    @Column(name = "buy_date")
    private String buyDate;
}

package com.expenses.householdBudgetingAPI.Entity;

import lombok.Data;
import jakarta.persistence.Entity ;
import jakarta.persistence.Id ;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table ;
import jakarta.persistence.Column ;

/**
 * @author Takahiro Hirose
 * gambling Entity class
 */

@Entity
@Data
@Table(name = "gambling_detail")
public class gamblingDetail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gambling_id")
    private int gamblingId;

    @Column(name = "payment")
    private int payment;

    @Column(name = "income")
    private int income;

    @Column(name = "tag_id")
    private String tagId;

    @Column(name = "bet_type")
    private String betType;

    @Column(name = "memo")
    private String memo;
}

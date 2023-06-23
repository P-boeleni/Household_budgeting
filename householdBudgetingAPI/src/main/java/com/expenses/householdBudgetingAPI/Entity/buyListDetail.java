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
 */

@Entity
@Data
@Table(name = "gambling")
public class buyListDetail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // buyテーブルから引っ張ってくるid
    @Column(name = "buy_id")
    private int buyId;

    // 買ったもの
    @Column(name = "item")
    private String item;

    // 購入時の金額
    @Column(name = "price")
    private int price;

    //購入した店舗
    @Column(name = "purchase_stores")
    private String purchaseStores;

    //メモ
    @Column(name = "memo")
    private String memo;
}

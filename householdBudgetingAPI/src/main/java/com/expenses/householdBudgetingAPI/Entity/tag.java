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
@Table(name = "tag")
public class tag {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_type")
    private int tagType;
}

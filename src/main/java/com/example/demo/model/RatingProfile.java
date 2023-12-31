package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rating_profile")
public class RatingProfile {
    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Column(name = "calling_party")
    private String callingParty;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "rating_plan_id", referencedColumnName = "rating_plan_id")
    private RatingPlan ratingPlan;
}

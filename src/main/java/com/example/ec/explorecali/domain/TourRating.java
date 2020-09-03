package com.example.ec.explorecali.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TourRating {

    @EmbeddedId
    private TourRatingPK pk;

    @Column(nullable = false)
    private Integer score;

    @Column
    private String comment;
}

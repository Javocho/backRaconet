package com.example.raconet.review;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="review")
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @SequenceGenerator(
            name = "review_sequence",
            sequenceName = "review_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "review_sequence"
    )
    @Column
    private Long id_review;
    @Column
    private Long id_prof;
    @Column
    private String review;
    @Column
    private int explain_mark;
    @Column
    private int doubts_mark;
    @Column
    private int interest_mark;

    public Review(Long id_prof, String review, int explain_mark, int doubts_mark, int interest_mark) {
        this.id_prof = id_prof;
        this.review = review;
        this.explain_mark = explain_mark;
        this.doubts_mark = doubts_mark;
        this.interest_mark = interest_mark;
    }

    public Long getId_review() {
        return id_review;
    }

    public void setId_review(Long id_review) {
        this.id_review = id_review;
    }

    public Long getId_prof() {
        return id_prof;
    }

    public void setId_prof(Long id_prof) {
        this.id_prof = id_prof;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getExplain_mark() {
        return explain_mark;
    }

    public void setExplain_mark(int explain_mark) {
        this.explain_mark = explain_mark;
    }

    public int getDoubts_mark() {
        return doubts_mark;
    }

    public void setDoubts_mark(int doubts_mark) {
        this.doubts_mark = doubts_mark;
    }

    public int getInterest_mark() {
        return interest_mark;
    }

    public void setInterest_mark(int interest_mark) {
        this.interest_mark = interest_mark;
    }
}

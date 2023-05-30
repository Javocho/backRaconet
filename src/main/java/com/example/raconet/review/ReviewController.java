package com.example.raconet.review;

import com.example.raconet.review.Review;
import com.example.raconet.review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/review")
public class ReviewController {
    private final ReviewService reviewService;

    //qué es la inyección de dependencias y por qué tengo que poner @Service al service sino función en rojo y @autowired
    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getReview() {
        return reviewService.getReviews();
    }

    @PostMapping
    public void addNewReview(@RequestBody Review review) {
        reviewService.addNewReview(review);
    }

    @DeleteMapping(path = "{reviewId}")
    public void deleteReview(@PathVariable("reviewId") Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}

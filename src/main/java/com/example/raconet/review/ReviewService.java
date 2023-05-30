package com.example.raconet.review;

import com.example.raconet.review.Review;
import com.example.raconet.review.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Autowired
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    public void addNewReview(Review review) {
        reviewRepository.save(review);
    }

    public void deleteReview(Long id_review) {
        boolean exists = reviewRepository.existsById(id_review);
        if (!exists) {
            throw new IllegalStateException("review with id " + id_review + " does not exists ");
        }
        reviewRepository.deleteById(id_review);
    }
}

package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Feedback;

public interface FeedbackRepository extends MongoRepository<Feedback, Long>{
    //Get Feedback
    Optional<Feedback> findByFeedbackId(Long feedBackId);
}

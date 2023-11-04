package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.Feedback;

@Repository
public interface FeedbackRepository extends MongoRepository<Feedback, Long>{
    //Get Feedback
    Optional<Feedback> findByFeedbackId(Long feedBackId);

    Optional<Feedback> findByIsSingleParent(boolean isSingleParent);

    Optional<Feedback> findByIsVeteran(boolean isVeteran);

    Optional<Feedback> findByWasIncarcerated(boolean beenIncarcerated);

    Optional<Feedback> findByHasIDD(boolean hasIDD);
}

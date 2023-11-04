package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.Coach;

@Repository
public interface CoachRepository extends MongoRepository<Coach, Long> {
    //Find Coach
    Optional<Coach> findByCoachId(Long coachId);
}

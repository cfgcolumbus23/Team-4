package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Coach;

public interface CoachRepository extends MongoRepository<Coach, Long> {
    //Find Coach
    Optional<Coach> findByCoachId(Long coachId);
}

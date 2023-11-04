package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.IdCounter;

@Repository
public interface IdCounterRepository extends MongoRepository<IdCounter, Long>{
    Optional<IdCounter> findBycollectionName(String collectionName);
}

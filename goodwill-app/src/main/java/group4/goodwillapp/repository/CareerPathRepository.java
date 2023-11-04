package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.CareerPath;
import java.util.List;
import java.util.ArrayList;


@Repository
public interface CareerPathRepository extends MongoRepository<CareerPath, Long> {

    Optional<CareerPath> findByCareerPathId(long careerPathId);

    Optional<List<CareerPath>> findByCourseIds(ArrayList<Long> courseIds);
}

package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.Course;

@Repository
public interface CoursesRepository extends MongoRepository<Course, Long> {
    //Get Course
    Optional<Course> findByCourseId(Long courseId);

}

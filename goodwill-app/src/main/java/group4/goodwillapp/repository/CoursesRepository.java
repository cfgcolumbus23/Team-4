package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Course;


public interface CoursesRepository extends MongoRepository<Course, Long> {
    //Get Course
    Optional<Course> findByCourseId(Long courseId);

}

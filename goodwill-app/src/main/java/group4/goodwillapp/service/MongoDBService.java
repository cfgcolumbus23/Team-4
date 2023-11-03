package group4.goodwillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Course;
import group4.goodwillapp.repository.CoursesRepository;

@Service
public class MongoDBService {

    @Autowired
    private CoursesRepository coursesRepository;

    public void saveCourse(Course course) {
        coursesRepository.save(course);
    }

    public Optional<Course> getCourseById(Long courseId) {
        return coursesRepository.findByCourseId(courseId);
    }
    
}

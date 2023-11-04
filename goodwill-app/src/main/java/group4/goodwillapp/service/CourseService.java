package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Course;
import group4.goodwillapp.repository.CoursesRepository;

@Service
public class CourseService {
    
    @Autowired
    private CoursesRepository coursesRepository;

    // Course save and find and findAll
    public void saveCourse(Course course) {
        coursesRepository.save(course);
    }

    public Optional<Course> getCourseById(Long courseId) {
        return coursesRepository.findByCourseId(courseId);
    }

    public List<Course> getAllCourses() {
        return coursesRepository.findAll();
    }

}

package group4.goodwillapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group4.goodwillapp.model.Course;
import group4.goodwillapp.service.MongoDBService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private MongoDBService mongoDBService;

    @PostMapping("/saveCourse")
    public void saveCourse(@RequestBody Course course) {
        mongoDBService.saveCourse(course);
    }

    @GetMapping("/getCourse/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long courseId) {
        return mongoDBService.getCourseById(courseId)
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAllCourses")
    public ResponseEntity<Course> getAllCourses(@PathVariable Long courseId) {
        return mongoDBService.getCourseById(courseId)
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

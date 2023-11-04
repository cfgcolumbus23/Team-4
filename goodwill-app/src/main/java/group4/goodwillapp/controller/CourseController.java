package group4.goodwillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group4.goodwillapp.model.Course;
import group4.goodwillapp.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public void saveCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
    }

    @GetMapping("/get/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long courseId) {
        return courseService.getCourseById(courseId)
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourses() {
        try{
            return new ResponseEntity<List<Course>>(courseService.getAllCourses(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }  
    }

    
}

package group4.goodwillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.model.Course;
import group4.goodwillapp.model.Feedback;
import group4.goodwillapp.repository.ApplicantRepository;
import group4.goodwillapp.repository.CoursesRepository;

@Service
public class MongoDBService {

    @Autowired
    private CoursesRepository coursesRepository;

    @Autowired
    private ApplicantRepository applicantRepository;



    // Course save and find
    public void saveCourse(Course course) {
        coursesRepository.save(course);
    }

    public Optional<Course> getCourseById(Long courseId) {
        return coursesRepository.findByCourseId(courseId);
    }

    // Feedback save and find
    public void saveApplicant(Applicant applicant) {
        applicantRepository.save(applicant);
    }

    public Optional<Applicant> getApplicantId(Long applicantId) {
        return applicantRepository.findByApplicantId(applicantId);
    }

    
    



    
    
}

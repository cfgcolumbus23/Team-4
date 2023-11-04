package group4.goodwillapp.controller;

import java.util.List;
import java.util.Optional;

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

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.model.CareerPath;
import group4.goodwillapp.service.CareerPathService;

@RestController
@RequestMapping("/careerpath")
@CrossOrigin(origins = "http://localhost:3000")
public class CareerPathController {
    
    @Autowired
    private CareerPathService careerPathService;

    @PostMapping("/save")
    public void saveCareerPath(@RequestBody CareerPath careerPath) {
        careerPathService.saveCareerPath(careerPath);
    }

    @GetMapping("/get/{careerPathId}")
    public ResponseEntity<CareerPath> getCareerPathById(@PathVariable Long careerPathId) {
        return careerPathService.getCareerPathById(careerPathId)
                .map(careerpath -> new ResponseEntity<>(careerpath, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<CareerPath>> getAllCareerPaths() {
        try {
            return new ResponseEntity<>(careerPathService.getAllCareerPaths(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

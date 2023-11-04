package group4.goodwillapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.CareerPath;
import group4.goodwillapp.repository.CareerPathRepository;

@Service
public class CareerPathService {
    
    @Autowired
    private CareerPathRepository careerPathRepository;

    @Autowired
    private IdCounterService idCounterService;

    public void saveCareerPath(CareerPath careerPath) {
        careerPath.setCareerPathId(idCounterService.getIdCounterNumByCollection("careerpaths"));
        careerPathRepository.save(careerPath);
    }

    public Optional<CareerPath> getCareerPathById(long careerPathId){
        return careerPathRepository.findByCareerPathId(careerPathId);
    }

    public List<CareerPath> getAllCareerPaths() {
        return careerPathRepository.findAll();
    }

    public Optional<List<CareerPath>> getCareerPathByCourseId(ArrayList<Long> courseIds) {
        return careerPathRepository.findByCourseIds(courseIds);
    }

}

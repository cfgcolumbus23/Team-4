package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Coach;
import group4.goodwillapp.repository.CoachRepository;

@Service
public class CoachService {
    
    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private IdCounterService idCounterService;

    // Coach save and find and findAll
    public void saveCoach(Coach coach) {
        coach.setCoachId(idCounterService.getIdCounterNumByCollection("coaches"));
        coachRepository.save(coach);
    }

    public Optional<Coach> getCoachById(Long coachId) {
        return coachRepository.findByCoachId(coachId);
    }

    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

}

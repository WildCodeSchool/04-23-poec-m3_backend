package com.poec.projet_backend.domains.mentor;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class MentorService {
    private final MentorRepository mentorRepository;

    public List<Mentor> findAll() {
        return mentorRepository.findAll();
    }
    public Mentor findById(Long id) {
        return mentorRepository.findById(id).orElseThrow( () -> new RuntimeException("not found "));
    }
    public Mentor save(Mentor mentor) {
        return mentorRepository.save(mentor);
    }
}

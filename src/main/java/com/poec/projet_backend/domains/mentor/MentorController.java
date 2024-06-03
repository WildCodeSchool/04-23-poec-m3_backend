package com.poec.projet_backend.domains.mentor;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/mentors")
public class MentorController {
    private final MentorService mentorService;

    @GetMapping("/all")
    public ResponseEntity<List<Mentor>> getAllMentors() {
        return ResponseEntity.ok(mentorService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mentor> getMentorById(@PathVariable Long id) {
        return ResponseEntity.ok(mentorService.findById(id)) ;
    }
    @PostMapping("/add")
    public ResponseEntity<Mentor> addMentor(@RequestBody Mentor mentor) {
        return ResponseEntity.ok(mentorService.save(mentor));
    }

}

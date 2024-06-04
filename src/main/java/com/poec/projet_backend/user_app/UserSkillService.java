package com.poec.projet_backend.user_app;

import com.poec.projet_backend.domains.skill.Skill;
import com.poec.projet_backend.domains.skill.SkillRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class UserSkillService {
    private final UserAppRepository userRepository;
    private final SkillRepository skillRepository;

    public List<Skill> getSkillsByUserId(Long id) {
        UserApp user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        return user.getSkills();}

    public List<Skill> updateUserSkillList(Long id, List<Skill> skills) {
        UserApp user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        user.setSkills(skills);
        return userRepository.save(user).getSkills();
    }
}



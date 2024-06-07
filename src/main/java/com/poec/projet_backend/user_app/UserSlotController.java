package com.poec.projet_backend.user_app;

import com.poec.projet_backend.domains.slot.Slot;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/user/slot")
public class UserSlotController {
private final UserSlotService userSlotService;
private final UserAppRepository userAppRepository;

@PostMapping ("/add/{userId}")
public List<Slot> addSlotMentor(@RequestBody Slot slot, @PathVariable Long userId) {
    UserApp user = userAppRepository.findById(userId).orElseThrow(()->new RuntimeException("not found"));
    slot.setUser(user);
    return userSlotService.addSlotMentor(slot);


}
@GetMapping ("/{userId}")
public List<Slot> getSlotByUserId(@PathVariable Long userId) {
    return userSlotService.getSlotByUserId(userId);}
}

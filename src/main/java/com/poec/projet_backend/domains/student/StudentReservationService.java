package com.poec.projet_backend.domains.student;

import com.poec.projet_backend.domains.reservation.ReservationDTO;
import com.poec.projet_backend.domains.reservation.ReservationRepository;
import com.poec.projet_backend.user_app.UserApp;
import com.poec.projet_backend.user_app.UserAppRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class StudentReservationService {

    private final StudentRepository studentRepository;
    private final ReservationRepository reservationRepository;

    public List<ReservationDTO> getReservationsByUserId(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        return student.getReservation().stream().map(ReservationDTO::fromReservation).toList();
    }
}
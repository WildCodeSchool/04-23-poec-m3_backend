package com.poec.projet_backend.domains.slot;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.poec.projet_backend.user_app.UserApp;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "slot")
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dateBegin")
    private LocalDateTime dateBegin;
    @Column(name = "dateEnd")
    private LocalDateTime dateEnd;
    private boolean visio;
    @JsonProperty("isBooked")
    @Column(name = "isBooked")
    private boolean isBooked;
    @ManyToOne
    @JoinColumn(name = "userId")
    UserApp user;
}

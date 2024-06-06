package com.poec.projet_backend.domains.slot;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @Column(name = "userId")
    private Long userId;
    @JsonProperty("isBooked")
    @Column(name = "isBooked")
    private boolean isBooked;

}

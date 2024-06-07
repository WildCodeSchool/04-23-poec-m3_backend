package com.poec.projet_backend.domains.slot;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class slotDTO {
    private Long id;
    private LocalDateTime dateBegin;
    private LocalDateTime dateEnd;
    private boolean visio;
    private Long userId;
    private boolean isBooked;
}

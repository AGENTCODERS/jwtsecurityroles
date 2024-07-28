package com.agentesports.jwtsecurityroles.entities;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@Entity
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int prizePool;
    private LocalDateTime regStartTime;
    private LocalDateTime regEndTime;
    private int entryFee;

    @ElementCollection
    private Map<String, Integer> prizeDistribution;

    private String hostedBy;
    private String type;
    private int totalSlots;
    private int availableSlots;
    private String status;
}

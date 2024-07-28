package models;

import java.time.LocalDateTime;

public class AcessRequest {
    private String token;
    private Long medicineBoxId;
    private Long doctorId;
    private boolean approved;
    private LocalDateTime requestTime;
}

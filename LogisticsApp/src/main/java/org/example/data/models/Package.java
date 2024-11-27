package org.example.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Package {
    private Receiver receiver;
    private List<TrackingLog> trackingLog;
    private String description;
    private LocalDateTime createdAt;
    private Sender sender;
    @Id
    private String id;
    private BigDecimal deliveryFee;
    private int quantity;
}

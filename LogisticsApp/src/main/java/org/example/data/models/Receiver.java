package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Receiver {
    private String fullName;
    private String address;
    private String phone;
    @Id
    private String id;
}

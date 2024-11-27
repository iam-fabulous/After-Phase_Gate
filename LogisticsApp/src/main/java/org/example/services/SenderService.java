package org.example.services;

import org.example.dtos.request.SenderRequest;
import org.example.dtos.response.SenderResponse;

public interface SenderService {
    SenderResponse sender (SenderRequest senderRequest)
}

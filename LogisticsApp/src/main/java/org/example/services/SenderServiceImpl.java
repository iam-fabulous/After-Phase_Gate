package org.example.services;

import org.example.data.repositories.SenderRepo;
import org.example.dtos.request.SenderRequest;
import org.example.dtos.response.SenderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl  implements SenderService{
    @Autowired
    private SenderRepo senderRepo;

    @Override
    public SenderResponse sender(SenderRequest senderRequest) {
        return null;
    }
}

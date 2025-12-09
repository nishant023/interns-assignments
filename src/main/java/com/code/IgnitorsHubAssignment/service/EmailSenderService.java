package com.code.IgnitorsHubAssignment.service;

import com.code.IgnitorsHubAssignment.dto.EmailRequest;
import org.springframework.web.multipart.MultipartFile;

public interface EmailSenderService {
    void sendChallengeEmail(EmailRequest request, MultipartFile image) throws Exception;
}


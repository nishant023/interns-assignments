package com.code.IgnitorsHubAssignment.controller;

import com.code.IgnitorsHubAssignment.dto.EmailRequest;
import com.code.IgnitorsHubAssignment.service.EmailSenderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailSenderController {

    private final EmailSenderService emailService;

    @PostMapping(value = "/send", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String sendEmail(
            @RequestPart("info") String infoJson,
            @RequestPart("image") MultipartFile image) {

        try {
            ObjectMapper mapper = new ObjectMapper();   // create here (no injection errors)
            EmailRequest info = mapper.readValue(infoJson, EmailRequest.class);

            emailService.sendChallengeEmail(info, image);

            return "Email Sent Successfully!";
        } catch (Exception e) {
            return "Failed: " + e.getMessage();
        }
    }
}

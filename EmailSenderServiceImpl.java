package com.code.IgnitorsHubAssignment.service.impl;


import com.code.IgnitorsHubAssignment.dto.EmailRequest;
import com.code.IgnitorsHubAssignment.service.EmailSenderService;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
@RequiredArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender mailSender;


    @Override
    public void sendChallengeEmail(EmailRequest request, MultipartFile image) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo("hr@ignitershub.com");
        helper.setSubject("Challenge 3 Completed");


        // Email body
        String body = "Name: " + request.getName() + "\n"
                + "Semester: " + request.getSemester() + "\n"
                + "Branch: " + request.getBranch() + "\n"
                + "Roll Number: " + request.getRollNumber();

        helper.setText(body);

        // Add image attachment
        if (image != null && !image.isEmpty()) {
            helper.addAttachment(image.getOriginalFilename(), image);
        }

        // Send email
        mailSender.send(message);

    }
}

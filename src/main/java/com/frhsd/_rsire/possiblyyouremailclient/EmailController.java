package com.frhsd._rsire.possiblyyouremailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/recent")
    public List<Map<String, String>> getRecentEmails(
            @RequestParam String email,
            @RequestParam String password
    ) {
        return emailService.fetchRecentEmails(email, password);
    }

    @PostMapping("/send")
    public String sendEmail(@RequestBody Map<String, String> payload) {
        String fromEmail = payload.get("fromEmail");
        String password = payload.get("password");
        String toEmail = payload.get("toEmail");
        String subject = payload.get("subject");
        String body = payload.get("body");
        return emailService.sendEmail(fromEmail, password, toEmail, subject, body);
    }
}
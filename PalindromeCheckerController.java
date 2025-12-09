package com.code.IgnitorsHubAssignment.controller;

import com.code.IgnitorsHubAssignment.service.PalindromeCheckerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/isPalindrome")
@RequiredArgsConstructor
public class PalindromeCheckerController {
    private final PalindromeCheckerService palindromeCheckerService;

    @GetMapping("/{string}")
    public ResponseEntity<String> isPalindrome(@PathVariable String string) {
        return ResponseEntity.ok(palindromeCheckerService.isPalindrome(string));
    }
}

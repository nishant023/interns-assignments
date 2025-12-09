package com.code.IgnitorsHubAssignment.service.impl;

import com.code.IgnitorsHubAssignment.service.PalindromeCheckerService;
import org.springframework.stereotype.Service;
@Service
public class PalindromeCheckerServiceImpl implements PalindromeCheckerService {
    @Override
    public String isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s+", "");
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return "The String " + text + " is not a palindrome";
            }
        }
        return "The String " + text + " is a palindrome";
    }
}

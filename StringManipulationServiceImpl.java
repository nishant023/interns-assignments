package com.code.IgnitorsHubAssignment.service.impl;

import com.code.IgnitorsHubAssignment.service.StringManipulationService;
import org.springframework.stereotype.Service;

@Service
public class StringManipulationServiceImpl implements StringManipulationService {
    @Override
    public String stringManipulation(String string) {
        // Count words
        String[] words = string.trim().split("\\s+");
        int wordCount = words.length;

        // Reverse sentence
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }

        // Replace spaces with hyphens
        String modified = string.trim().replace(" ", "-");

        return "Number of words: " + wordCount + "\n" +
                "Reversed sentence: " + reversed + "\n" +
                "Modified sentence: " + modified;
    }
}

package com.code.IgnitorsHubAssignment.controller;

import com.code.IgnitorsHubAssignment.dto.StringRequest;
import com.code.IgnitorsHubAssignment.service.StringManipulationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/string")
@RequiredArgsConstructor
public class StringManipulationController {
    private final StringManipulationService stringManipulationService;

    @PostMapping("/manipulate")
    public ResponseEntity<String> stringManipulation(@RequestBody StringRequest request){
        return ResponseEntity.ok(stringManipulationService.stringManipulation(request.getString()));
    }
}

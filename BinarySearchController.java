package com.code.IgnitorsHubAssignment.controller;




import com.code.IgnitorsHubAssignment.dto.BinarySearchRequest;
import com.code.IgnitorsHubAssignment.service.BinarySearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BinarySearchController {
    private final BinarySearchService binarySearchService;

    @PostMapping("/binarySearch")
    public ResponseEntity<String> binarySearch(@RequestBody BinarySearchRequest request) {
        return ResponseEntity.ok(binarySearchService
                .binarySearch(request.getArray(), request.getTarget()));
    }
}



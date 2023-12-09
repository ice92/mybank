package com.zywatest.bankstatementapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/mybank")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;
    @PostMapping("/bankstatementrequest")
    public ResponseEntity<String> requestForm(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
            @RequestParam("email") String email
    ) {
        Request request = new Request();
        request.setStartDate(startDate);
        request.setEndDate(endDate);
        request.setEmail(email);

        requestRepository.save(request);

        // Simulate sending data to another API (replace with actual API integration)
        // For demonstration purposes, just return a success message.
        return ResponseEntity.ok("Request submitted successfully!");
    }



}

package com.example.visitormanagement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckinController {

    @PostMapping("/checkin")
    public String checkin(@RequestParam String name) {
        return "Welcome, " + name + "! to Amazon";
    }
}

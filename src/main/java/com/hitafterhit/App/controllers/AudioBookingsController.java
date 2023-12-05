package com.hitafterhit.App.controllers;

import com.hitafterhit.App.models.AudioBookings;
import com.hitafterhit.App.repositories.AudioBookingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hitafterhit")
@CrossOrigin("https://hahrec.vercel.app/")
public class AudioBookingsController {

    @Autowired
    private AudioBookingsRepo audioBookingsRepo;

    @PostMapping("/postBookings")
    public ResponseEntity<AudioBookings> postEnquiry(@RequestBody AudioBookings bookings) {
        audioBookingsRepo.save(bookings);
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/getBookings")
    public List<AudioBookings> getEnquiries() {
        return audioBookingsRepo.findAll();
    }
}
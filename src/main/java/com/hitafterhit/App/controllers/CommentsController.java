package com.hitafterhit.App.controllers;

import com.hitafterhit.App.models.Comments;
import com.hitafterhit.App.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hitafterhit")
@CrossOrigin("https://hahrec.vercel.app/")
public class CommentsController {

    private CommentsRepo commentsRepo;

    @PostMapping("/postComments")
    public ResponseEntity<Comments> postComments(@RequestBody Comments comments) {
        commentsRepo.save(comments);
        return ResponseEntity.ok(comments);
    }

    @GetMapping("/getComments")
    public List<Comments> getComments() {
        return commentsRepo.findAll();
    }
}
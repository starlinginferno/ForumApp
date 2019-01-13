package com.greenfox.rueppellii.seadog.forumapp.controllers;

import com.greenfox.rueppellii.seadog.forumapp.models.PostDTO;
import com.greenfox.rueppellii.seadog.forumapp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

    private PostDTO postDTO;
    private PostService postService;

    @Autowired
    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/reddit/statistics")
    public PostDTO listPostsAndCountThem() {
        return postService.listPostsInJson();
    }
}

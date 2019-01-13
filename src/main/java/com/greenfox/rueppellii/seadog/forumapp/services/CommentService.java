package com.greenfox.rueppellii.seadog.forumapp.services;

import com.greenfox.rueppellii.seadog.forumapp.models.Comment;
import com.greenfox.rueppellii.seadog.forumapp.repositories.CommentRepository;
import com.greenfox.rueppellii.seadog.forumapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;
    //   private PostService postService;

    @Autowired
    public CommentService(CommentRepository commentRepository, PostRepository postRepository, PostService postService) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
//        this.postService = postService;
    }

    public Iterable<Comment> findCommentsByID(Long id) {
        return commentRepository.findAllByPost_IdOrderByCreatedAt(id);
    }

    public Comment findComment(Long id) {
        if (commentRepository.findById(id).isPresent()) {
            return commentRepository.findById(id).get();
        }
        return null;
    }

}

package com.greenfox.rueppellii.seadog.forumapp.repositories;

import com.greenfox.rueppellii.seadog.forumapp.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    Iterable<Comment> findAllByOrderByVoteDesc();

    Iterable<Comment> findAllByPost_IdOrderByCreatedAt(Long id);
}
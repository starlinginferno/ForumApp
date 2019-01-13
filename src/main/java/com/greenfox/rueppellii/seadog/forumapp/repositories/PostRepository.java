package com.greenfox.rueppellii.seadog.forumapp.repositories;

import com.greenfox.rueppellii.seadog.forumapp.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByOrderByVoteDesc();

    Iterable<Post> findAllByTitleContainsOrContentContains(String keyword, String keyword2);

}

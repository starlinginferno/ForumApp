package com.greenfox.rueppellii.seadog.forumapp.models;

public class PostDTO {

    private Iterable<Post> posts;
    private Long postCount;

    public PostDTO() {
    }

    public Iterable<Post> getPosts() {
        return posts;
    }

    public void setPosts(Iterable<Post> posts) {
        this.posts = posts;
    }

    public Long getPostCount() {
        return postCount;
    }

    public void setPostCount(Long postCount) {
        this.postCount = postCount;
    }
}

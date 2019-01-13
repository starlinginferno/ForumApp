package com.greenfox.rueppellii.seadog.forumapp.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer vote;
    private String title;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @JsonManagedReference
    @OneToMany(mappedBy = "post", targetEntity = Comment.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Comment> comments;

    public Post(String title, String content) {
        this();
        this.title = title;
        this.content = content;
    }

    public Post() {
        this.vote = 0;
        this.createdAt = new Date();
        comments = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

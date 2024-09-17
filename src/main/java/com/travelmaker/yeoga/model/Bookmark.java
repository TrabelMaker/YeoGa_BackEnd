package com.travelmaker.yeoga.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Optional<User> user;

    private String BookmarkId;

    private String BookmarkTitle;

    private LocalDateTime BMCDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<User> getUser() {
        return user;
    }

    public void setUser(Optional<User> user) {
        this.user = user;
    }

    public String getBookmarkId() {
        return BookmarkId;
    }

    public void setBookmarkId(String bookmarkId) {
        BookmarkId = bookmarkId;
    }

    public String getBookmarkTitle() {
        return BookmarkTitle;
    }

    public void setBookmarkTitle(String bookmarkTitle) {
        BookmarkTitle = bookmarkTitle;
    }

    public LocalDateTime getBMCDate() {
        return BMCDate;
    }

    public void setBMCDate(LocalDateTime BMCDate) {
        this.BMCDate = BMCDate;
    }
}

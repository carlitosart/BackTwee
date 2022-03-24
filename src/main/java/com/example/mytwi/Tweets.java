package com.example.mytwi;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Tweets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tweet_id;

    private Integer users_user_id;

    private String text;

    @CreationTimestamp
    private LocalDateTime date;

    public Integer getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(Integer tweet_id) {
        this.tweet_id = tweet_id;
    }

    public Integer getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(Integer users_user_id) {
        this.users_user_id = users_user_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

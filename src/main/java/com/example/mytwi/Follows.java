package com.example.mytwi;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FOLLOWS")
@IdClass(RelationId.class)
public class Follows{

    @Id
    private Long users_master;

    @Id
    private Long users_follow;

    public Long getUsers_master() {
        return users_master;
    }

    public void setUsers_master(Long users_master) {
        this.users_master = users_master;
    }

    public Long getUsers_follow() {
        return users_follow;
    }

    public void setUsers_follow(Long users_follow) {
        this.users_follow = users_follow;
    }

    /*@ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users_master;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users_follow;

    public Users getUsers_master() {
        return users_master;
    }

    public void setUsers_master(Users users_master) {
        this.users_master = users_master;
    }

    public Users getUsers_follow() {
        return users_follow;
    }

    public void setUsers_follow(Users users_follow) {
        this.users_follow = users_follow;
    }*/
}

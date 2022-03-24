package com.example.mytwi;

import java.io.Serializable;

public class RelationId implements Serializable {
    private Long users_follow;
    private Long users_master;

    public Long getUsers_follow() {
        return users_follow;
    }

    public void setUsers_follow(Long users_follow) {
        this.users_follow = users_follow;
    }

    public Long getUsers_master() {
        return users_master;
    }

    public void setUsers_master(Long users_master) {
        this.users_master = users_master;
    }
}

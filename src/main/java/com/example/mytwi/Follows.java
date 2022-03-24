package com.example.mytwi;

import javax.persistence.*;

@Entity
@Table(name = "FOLLOWS")
public class Follows {

    @ManyToOne
    @JoinColumn(name = "users_master",nullable = false)
    private Follows users_master;
}

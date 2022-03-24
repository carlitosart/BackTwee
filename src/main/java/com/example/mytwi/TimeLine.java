package com.example.mytwi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimeLine extends JpaRepository<Tweets,Long> {
    @Query(value = "select tweets.*,users.*,follows.* from tweets  JOIN users ON tweets.users_user_id = users.user_id  JOIN follows ON users_follow = users.user_id  where follows.users_master = ?1",nativeQuery = true)
    List<Tweets> findByTimeline(Integer user_master);
}

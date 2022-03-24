package com.example.mytwi;

import org.springframework.data.repository.CrudRepository;

public interface TweetsRepo extends CrudRepository<Tweets,Integer> {
}

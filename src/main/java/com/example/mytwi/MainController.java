package com.example.mytwi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/twi")
public class MainController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TweetsRepo tweetsRepo;

    @PostMapping("/add")
    public @ResponseBody String addNewUser (@RequestParam String username){
        Users n = new Users();
        n.setUsername(username);
        userRepo.save(n);
        return "Saved";
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Users> getAllUsers(){
        return userRepo.findAll();
    }
    @PostMapping("/tweet")
    public @ResponseBody String addNewTweet(@RequestParam Integer users_user_id,@RequestParam String text){
        Tweets t = new Tweets();
        t.setUsers_user_id(users_user_id);
        t.setText(text);
        tweetsRepo.save(t);
        return "Tweet Guardado";
    }
    @GetMapping(path = "/allt")
    public @ResponseBody Iterable<Tweets> getAllTweets(){
        return tweetsRepo.findAll();
    }

}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/User")
@Service
public class UserController {

@Autowired
private IUserRepository iUserRepository;

    
    @PostMapping("/post")
    public void saveData(@RequestBody User User){
         iUserRepository.save(User);
    }
    
    @GetMapping("/{id}")
    public List<User> getData(){
       return  iUserRepository.findAll();
    }
}

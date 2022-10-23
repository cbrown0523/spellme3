//package com.spellme3.spellme3.controller;
//
//import com.spellme3.spellme3.model.TStatus;
//import com.spellme3.spellme3.model.TUser;
//import com.spellme3.spellme3.repositories.TUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
//import java.util.List;
//@RestController
//public class TUserController {
//    @Autowired
//    TUserRepository userRepository;
//    @PostMapping("/users/register")
//    public TStatus registerUser(@Valid @RequestBody TUser newUser) {
//        List<TUser> users = userRepository.findAll();
//        System.out.println("New user: " + newUser.toString());
//        for (TUser user : users) {
//            System.out.println("Registered user: " + newUser.toString());
//            if (user.equals(newUser)) {
//                System.out.println("User Already exists!");
//                return TStatus.USER_ALREADY_EXISTS;
//            }
//        }
//        userRepository.save(newUser);
//        return TStatus.SUCCESS;
//    }
//    @PostMapping("/users/login")
//    public TStatus loginUser(@Valid @RequestBody TUser user) {
//        List<TUser> users = userRepository.findAll();
//        for (TUser other : users) {
//            if (other.equals(user)) {
//                user.setLoggedIn(true);
//                userRepository.save(user);
//                return TStatus.SUCCESS;
//            }
//        }
//        return TStatus.FAILURE;
//    }
//    @PostMapping("/users/logout")
//    public TStatus logUserOut(@Valid @RequestBody TUser user) {
//        List<TUser> users = userRepository.findAll();
//        for (TUser other : users) {
//            if (other.equals(user)) {
//                user.setLoggedIn(false);
//                userRepository.save(user);
//                return TStatus.SUCCESS;
//            }
//        }
//        return TStatus.FAILURE;
//    }
//    @DeleteMapping("/users/all")
//    public TStatus deleteUsers() {
//        userRepository.deleteAll();
//        return TStatus.SUCCESS;
//    }
//}

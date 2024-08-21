package com.Postgres.GabrielT3.controler;

import com.Postgres.GabrielT3.Repository.UserRepository;
import com.Postgres.GabrielT3.exepciones.UserNotFoundException;
import com.Postgres.GabrielT3.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    User createUser(@RequestBody UserDto userDto){
        User user = new User(userDto);
        return userRepository.save(user);
    }

    User findById(@PathVariable Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent())
            return optionalUser.get();
        else throw new UserNotFoundException();
    }
}

package molpadia_streaming_media_webapp.controller;

import molpadia_streaming_media_webapp.core.models.User;
import molpadia_streaming_media_webapp.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> all() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}

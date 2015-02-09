package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void initDatabase() {

        User user = new User();
        user.setUsername("altfatterz@gmail.com");
        user.setPassword("secret");

        userRepository.save(user);

    }

}

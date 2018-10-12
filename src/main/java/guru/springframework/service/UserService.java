package guru.springframework.service;

import guru.springframework.domain.User;

import java.util.Set;

/**
 * Created by jd on 2018.09.27..
 */
public interface UserService {

    Set<User> getUsers();

}

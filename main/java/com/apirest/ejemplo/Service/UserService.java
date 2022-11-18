package com.apirest.ejemplo.Service;

import com.apirest.ejemplo.Model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService implements UserServiceI{

    HashMap<Integer,User> userData = new HashMap<>();


    @Override
    public HashMap<Integer, User> all() {
        return userData;
    }

    @Override
    public User create(User user) {
        Integer key= user.getId();
        return userData.put(key,user);
    }

    @Override
    public User findById(Integer id) {
        return userData.get(id);
    }

    @Override
    public void deleteById(Integer id) {
        userData.remove(id);
    }

    @Override
    public User update(Integer id, User user) {
        return userData.put(id,user);
    }
}

package com.apirest.ejemplo.Service;

import com.apirest.ejemplo.Model.User;

import java.util.HashMap;

public interface UserServiceI {
    HashMap<Integer, User> all();
    User create( User user );
    User findById( Integer id );
    void deleteById( Integer id );
    User update(Integer id, User user);
}

package com.lms.userservice.service;

import com.lms.userservice.model.Book;
import com.lms.userservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<Book> getCurrentBook(Integer id);
    User getUserById(Integer id);
    List<User> getAll();
    User updateUser(User user);
    User getUserByUniversityId(Integer uId);
    User deleteUser(Integer id);
}

package com.kirars.user.service;

import com.kirars.user.dto.Book;
import com.kirars.user.dto.ResponseTemplate;
import com.kirars.user.model.User;
import com.kirars.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser in UserService");
        return userRepository.save(user);
    }

    public ResponseTemplate getUserWithBook(Long userId) {
        log.info("Inside getUserWithBook in UserService");
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = userRepository.findByUserId(userId);
        Book book = restTemplate.getForObject("http://BOOK-SERVICE/books/" + user.getBookId(), Book.class);
        responseTemplate.setUser(user);
        responseTemplate.setBook(book);
        return responseTemplate;
    }
}

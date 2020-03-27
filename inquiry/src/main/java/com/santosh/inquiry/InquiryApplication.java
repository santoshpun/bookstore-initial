package com.santosh.inquiry;

import com.santosh.authentication.model.User;
import com.santosh.authentication.repository.UserRepository;
import com.santosh.inquiry.model.Book;
import com.santosh.inquiry.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.santosh"})
public class InquiryApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(InquiryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.findAll();
        log.info("users : " + users);

        List<Book> books = bookRepository.findAll();
        log.info("books : " + books);
    }
}

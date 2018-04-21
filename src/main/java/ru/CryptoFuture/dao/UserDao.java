package ru.CryptoFuture.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.CryptoFuture.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

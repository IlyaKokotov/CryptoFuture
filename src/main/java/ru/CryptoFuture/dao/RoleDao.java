package ru.CryptoFuture.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.CryptoFuture.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}

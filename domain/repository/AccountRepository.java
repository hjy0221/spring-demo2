package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByLoginId(String loginId);
}

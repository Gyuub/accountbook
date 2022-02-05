package com.gyub.accountbook.web.account.repository;

import com.gyub.accountbook.web.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
   List<Account> findByName(String name);
}

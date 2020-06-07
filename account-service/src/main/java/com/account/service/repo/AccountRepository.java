package com.account.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.account.service.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}

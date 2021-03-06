package com.library.backend.Repository;

import com.library.backend.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface userRepository extends JpaRepository<user, Integer> {

    Optional<user> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("update user a " + "set a.enabled = true where a.email = ?1")
    int enableUser (String email);
}

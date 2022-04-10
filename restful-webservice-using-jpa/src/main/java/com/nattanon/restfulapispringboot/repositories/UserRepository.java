package com.nattanon.restfulapispringboot.repositories;

import com.nattanon.restfulapispringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

// Another way
//@Repository
//public interface UserRepository  extends JpaRepository<User, Long>{
//
//    User findByUsername(String username);
//}

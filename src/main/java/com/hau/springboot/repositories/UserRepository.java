package com.hau.springboot.repositories;

import com.hau.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hau on 20/04/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByIdStudent(String idStudent);
}

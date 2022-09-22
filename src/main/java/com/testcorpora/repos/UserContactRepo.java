package com.testcorpora.repos;

import com.testcorpora.dto.UserDto;
import com.testcorpora.models.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserContactRepo extends JpaRepository<UserContact, Long> {

    @Query( value = "SELECT new com.testcorpora.dto.UserDto(a.id, a.adress, b.name, b.age) FROM UserContact  a INNER JOIN User b ON a.user_id = b.id")
    List<UserDto> getAllUser();

}

package com.example.accessingdataoracle.accessingdataoracle;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<UserData, Integer> {
    @Query(value = "select * from user_data where id = ?1", nativeQuery = true)
    List<UserData> findById(int id);
}

package com.example.accessingdataoracle.accessingdataoracle;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Transactional
@Repository
public interface UserRepository extends CrudRepository<UserData, Integer> {
    @Query(value = "select * from user_data where id = ?1", nativeQuery = true)
    List<UserData> findById(int id);

    @Modifying
    @Query(value = "update user_data set name = :name,email = :email where id = :id", nativeQuery = true)
    void updateUserName(@Param("id") int id, @Param("name") String name, @Param("email") String email);

    @Modifying
    @Query(value = "delete from user_data where id = :id", nativeQuery = true)
    void deleteById(@Param("id") int id);

    @Modifying
    @Query(value = "insert into user_data (id,name,email) values (USER_DATA_SEQ.nextval,:name,:email)", nativeQuery = true)
    void addNewUser(@Param("name")String name, @Param("email")String email);

}

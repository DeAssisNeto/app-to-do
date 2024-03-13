package com.app.todo.repositories;

import com.app.todo.models.UserModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository <UserModel, UUID>{
//    void saveUser(@Para)
    @Query("INSERT INTO tb_user (name, email, password) VALUES (:name, :email, :password)")
    UserModel saveUser(@Param(value = "name") String name,
                       @Param(value = "email") String email,
                       @Param(value = "password") String password);

}

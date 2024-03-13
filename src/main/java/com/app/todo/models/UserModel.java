package com.app.todo.models;

import com.app.todo.dtos.UserRecordDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tb_user")
public class UserModel {
    @Id
    private UUID id;
    private String name;
    private String email;
    private String password;

    public UserModel(UserRecordDto dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.password = dto.password();
    }
}

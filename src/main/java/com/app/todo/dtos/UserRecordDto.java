package com.app.todo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecordDto(@NotBlank @NotNull String name,
                            @NotBlank @NotNull String email,
                            @NotBlank @NotNull String password) {
}

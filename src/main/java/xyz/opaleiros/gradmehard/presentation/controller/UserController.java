package xyz.opaleiros.gradmehard.presentation.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.opaleiros.gradmehard.application.dto.CreateUserDTO;
import xyz.opaleiros.gradmehard.application.usecase.CreateUserUseCase;
import xyz.opaleiros.gradmehard.domain.entity.User;
import xyz.opaleiros.gradmehard.presentation.request.CreateUserRequest;
import xyz.opaleiros.gradmehard.presentation.response.UserResponse;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final CreateUserUseCase useCase;

    @PostMapping
    public ResponseEntity<UserResponse> create(
            @RequestBody CreateUserRequest request
    ) {

        CreateUserDTO dto =
                new CreateUserDTO(
                        request.name(),
                        request.email(),
                        request.password()
                );

        User user = useCase.execute(dto);

        UserResponse response =
                new UserResponse(
                        user.getId(),
                        user.getName(),
                        user.getEmail()
                );

        return ResponseEntity.ok(response);
    }
}
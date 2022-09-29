package com.example.users.controller;

import com.example.users.dto.request.UserRequestDto;
import com.example.users.dto.response.UserResponseDto;
import com.example.users.model.User;
import com.example.users.service.UserService;
import com.example.users.service.mapper.RequestDtoMapper;
import com.example.users.service.mapper.ResponseDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final RequestDtoMapper<UserRequestDto, User> userRequestDtoMapper;
    private final ResponseDtoMapper<User, UserResponseDto> userResponseDtoMapper;

    public UserController(UserService userService,
                          RequestDtoMapper<UserRequestDto, User> userRequestDtoMapper,
                          ResponseDtoMapper<User, UserResponseDto> userResponseDtoMapper) {
        this.userService = userService;
        this.userRequestDtoMapper = userRequestDtoMapper;
        this.userResponseDtoMapper = userResponseDtoMapper;
    }

    @PostMapping()
    public UserResponseDto create(@RequestBody @Valid UserRequestDto requestDto) {
        User user = userService.save(userRequestDtoMapper.mapToModel(requestDto));
        return userResponseDtoMapper.mapToDto(user);
    }
}

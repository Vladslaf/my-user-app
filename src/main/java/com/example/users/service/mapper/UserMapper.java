package com.example.users.service.mapper;

import com.example.users.dto.request.UserRequestDto;
import com.example.users.dto.response.UserResponseDto;
import com.example.users.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<User, UserResponseDto>,
RequestDtoMapper<UserRequestDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        return responseDto;
    }

    @Override
    public User mapToModel(UserRequestDto dto) {
        User user = new User();
        return null;
    }
}

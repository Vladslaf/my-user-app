package com.example.users.service.mapper;

public interface ResponseDtoMapper<M, D> {
    D mapToDto(M m);
}

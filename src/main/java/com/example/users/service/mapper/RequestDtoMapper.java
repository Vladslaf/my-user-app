package com.example.users.service.mapper;

public interface RequestDtoMapper<D, M> {
    M mapToModel(D dto);
}

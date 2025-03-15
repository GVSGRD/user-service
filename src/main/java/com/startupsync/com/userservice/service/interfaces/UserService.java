package com.startupsync.com.userservice.service.interfaces;


import com.startupsync.com.userservice.payload.UserRequestDto;
import com.startupsync.com.userservice.payload.UserResponseDto;

import java.util.List;

public interface UserService {
	UserResponseDto createUser(UserRequestDto userRequestDto);
	UserResponseDto findUserById(Long userId);
	UserResponseDto findByEmail(String email);
	List<UserResponseDto> findAllUsers();
	UserResponseDto updateUser(UserRequestDto user, Long userId);
	void deleteUser(Long userId);
}


package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dto.user.TrendStoreDto;
import com.ssafy.happyhouse.model.dto.user.UserDto;

public interface UserService {
	
	UserDto login(UserDto userDto) throws Exception;
	
	int idCheck(String checkId) throws Exception;
	
	boolean registerUser(UserDto userDto) throws Exception;
	UserDto userInfo(String userid) throws Exception;
	boolean updateUser(UserDto userDto) throws Exception;
	boolean deleteUser(String userid) throws Exception;
	
//	List<TrendStoreDto> listTstore() throws Exception;
	TrendStoreDto getStoreData(int ageGroup) throws Exception;
	boolean updateCount(UserDto userDto) throws Exception;
}

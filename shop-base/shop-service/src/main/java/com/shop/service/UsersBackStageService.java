package com.shop.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.pojo.Users;

@Service
public interface UsersBackStageService {

	List<Users> findUsesByExample(String name);

	Users getUsersByUserid(String userid);

	int deleteUserByUserid(String userid);

	List<Users> searchUserLike(String name);

	int updateUsersByUserid(Users users);


}

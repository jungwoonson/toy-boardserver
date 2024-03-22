package com.boardserver.service.impl;

import com.boardserver.dto.UserDTO;
import com.boardserver.exception.DuplicateIdException;
import com.boardserver.mapper.UserProfileMapper;
import com.boardserver.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.boardserver.utils.SHA256Util.encryptSHA256;

@Service
public class UserServiceImpl implements UserService {

    private UserProfileMapper userProfileMapper;

    public UserServiceImpl(UserProfileMapper userProfileMapper) {
        this.userProfileMapper = userProfileMapper;
    }

    @Override
    public void register(UserDTO userProfile) {
        boolean duplicateIdResult = isDuplicatedId(userProfile.getUserId());
        if (duplicateIdResult) {
            throw new DuplicateIdException("등록된 아이디입니다.");
        }
        userProfile.setCreateTime(new Date());
        userProfile.setPassword(encryptSHA256(userProfile.getPassword()));
    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicatedId(String id) {
        return false;
    }

    @Override
    public UserDTO getUserInfo(String userId) {
        return null;
    }

    @Override
    public void updatePassword(String id, String beforePassword, String afterPassword) {

    }

    @Override
    public void deleteId(String id, String password) {

    }
}

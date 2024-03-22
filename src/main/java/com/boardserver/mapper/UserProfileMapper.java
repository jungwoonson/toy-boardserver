package com.boardserver.mapper;

import com.boardserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
interface UserProfileMapper {
    public UserDTO getUserProfile(@Param("id") String id);

    int insertUserProfile(
            @Param("") int id,
            @Param("userId") String userId,
            @Param("password") String password,
            @Param("nickname") String nickname,
            @Param("isAdmin") boolean isAdmin,
            @Param("createTime") Date createTime,
            @Param("isWithDraw") boolean isWithDraw,
            @Param("status") UserDTO.Status status,
            @Param("updateTime") Date updateTime
    );
}

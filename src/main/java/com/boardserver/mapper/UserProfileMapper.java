package com.boardserver.mapper;

import com.boardserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface UserProfileMapper {
    UserDTO getUserProfile(@Param("id") String id);

    int insertUserProfile(
            @Param("id") int id,
            @Param("userId") String userId,
            @Param("password") String password,
            @Param("nickname") String nickname,
            @Param("isAdmin") boolean isAdmin,
            @Param("createTime") Date createTime,
            @Param("isWithDraw") boolean isWithDraw,
            @Param("status") UserDTO.Status status,
            @Param("updateTime") Date updateTime
    );

    int deleteUserProfile(@Param("userId") String userId);

    UserDTO findByIdAndPassword(@Param("id") String id, @Param("password") String password);

    boolean isCheck(@Param("id") String id);

    int updatePassword(UserDTO user);

    int updateAddress(UserDTO user);

    int register(UserDTO user);

    UserDTO findByUserIdAndPassword(String id, String cryptoPassword);
}

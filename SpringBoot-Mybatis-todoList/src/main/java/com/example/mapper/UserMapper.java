package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.entity.UserEntity;
import com.example.model.vo.UserVO;

@Mapper
public interface UserMapper {

    /**
     * 查詢全部
     * 
     * @return
     */
    List<UserEntity> getUserList();

    /**
     * 根據 id 查詢
     * 
     * @return
     */
    UserEntity getUserById(Integer userId);

    /**
     * 資料新增
     * 
     * @param user
     * @return 自增主鍵
     */
    int insertUser(UserVO user);

    /**
     * 資料修改
     * 
     * @param user
     * @return
     */
    int updateUser(UserVO user);

    /**
     * 根據 id 刪除
     * 
     * @param userId
     * @return
     */
    int deleteUserById(Integer userId);
}

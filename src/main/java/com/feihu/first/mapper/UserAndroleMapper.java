package com.feihu.first.mapper;

import com.feihu.first.entity.UserAndrole;
import com.feihu.first.entity.UserAndroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAndroleMapper {
    long countByExample(UserAndroleExample example);

    int deleteByExample(UserAndroleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAndrole record);

    int insertSelective(UserAndrole record);

    List<UserAndrole> selectByExample(UserAndroleExample example);

    UserAndrole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAndrole record, @Param("example") UserAndroleExample example);

    int updateByExample(@Param("record") UserAndrole record, @Param("example") UserAndroleExample example);

    int updateByPrimaryKeySelective(UserAndrole record);

    int updateByPrimaryKey(UserAndrole record);
}
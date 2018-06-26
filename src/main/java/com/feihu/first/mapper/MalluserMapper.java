package com.feihu.first.mapper;

import com.feihu.first.entity.Malluser;
import com.feihu.first.entity.MalluserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MalluserMapper {
    long countByExample(MalluserExample example);

    int deleteByExample(MalluserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Malluser record);

    int insertSelective(Malluser record);

    List<Malluser> selectByExample(MalluserExample example);

    Malluser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Malluser record, @Param("example") MalluserExample example);

    int updateByExample(@Param("record") Malluser record, @Param("example") MalluserExample example);

    int updateByPrimaryKeySelective(Malluser record);

    int updateByPrimaryKey(Malluser record);
}
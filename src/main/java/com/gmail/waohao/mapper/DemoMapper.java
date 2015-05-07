package com.gmail.waohao.mapper;

import com.gmail.waohao.model.Demo;
import com.gmail.waohao.model.DemoExample;
import com.gmail.waohao.model.DemoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    int countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int deleteByPrimaryKey(DemoKey key);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    List<Demo> selectByPrimaryKey(DemoKey key);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}
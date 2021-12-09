package com.smart.coach.dao;

import com.smart.coach.entity.DevData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DevDataDao {
    void saveOneDevData(DevData data);

    List<DevData> selectByDevId(long devId);

    void truncateTable();
}

package com.smart.coach.service;


import com.smart.coach.entity.DevData;

import java.util.List;

public interface DevDataService {

    void saveOneDevData(DevData devData);

    List<DevData> selectByDevId(long devId);

    void truncate();
}

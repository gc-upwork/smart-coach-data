package com.smart.coach.service;

import com.smart.coach.dao.DevDataDao;
import com.smart.coach.entity.DevData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DevDataServiceImpl implements DevDataService {

    private final DevDataDao devDataDao;

    @Override
    public void saveOneDevData(DevData devData) {
        devData.setTimestamp(new Date());
        devDataDao.saveOneDevData(devData);
    }

    @Override
    public List<DevData> selectByDevId(long devId) {
        return devDataDao.selectByDevId(devId);
    }

    @Override
    public void truncate() {
        devDataDao.truncateTable();
    }
}

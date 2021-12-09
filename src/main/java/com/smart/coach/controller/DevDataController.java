package com.smart.coach.controller;

import com.smart.coach.entity.DevData;
import com.smart.coach.service.DevDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
@Api(tags = "DevData")
public class DevDataController {
    private static final String TRUNCATE = "truncate";

    private final DevDataService devDataService;

    @PostMapping("/save")
    public String saveDevData(@RequestBody DevData devData) {
        devDataService.saveOneDevData(devData);
        return "success";
    }

    @GetMapping("/queryByDevId")
    public List<DevData> queryByDevId(Long devId) {
        return devDataService.selectByDevId(devId);
    }

    @ApiOperation(value = "Input:  truncate")
    @GetMapping("/truncate")
    public String truncateTable(String message) {
        if (TRUNCATE.equals(message)) {
            devDataService.truncate();
            return "delete all data success";
        }
        return "no change in db";
    }
}

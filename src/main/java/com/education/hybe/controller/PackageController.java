package com.education.hybe.controller;

import com.education.hybe.domain.Package;
import com.education.hybe.service.PackageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/packages")
public class PackageController {
    @Autowired
    private PackageService packageService;

    @ApiOperation(value = "#1. 패키지 리스트 조회", notes = "패키지 리스트를 통해 쳅터, 영상 활용")
    @GetMapping(value = "")
    public @ResponseBody Map<String, Object> selectPackages() {
        Map<String, Object> result = new HashMap<String, Object>();
        List<String> resultMessage = new ArrayList<>();
        List<Package> packageList = packageService.findPackageList();

        if(packageList != null && packageList.size() > 0) {
            result.put("packages", packageList);
            resultMessage.add("SUCCESS");
        } else {
            resultMessage.add("packages NULL_DATA");
        }

        result.put("result_message", resultMessage);

        return result;
    }
}

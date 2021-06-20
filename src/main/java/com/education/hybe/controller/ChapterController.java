package com.education.hybe.controller;

import com.education.hybe.domain.Chapter;
import com.education.hybe.service.ChapterService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/chapters")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @ApiOperation(value = "#2. 챕터 리스트", notes = "pakageId값으로 리스트 조회")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "packageId", value = "패키지 아이디", required = true, dataType = "int", paramType = "path", defaultValue = ""),
    })
    @GetMapping(value = "/{packageId}")
    public @ResponseBody
    Map<String, Object> selectChapters(@PathVariable Integer packageId) {
        Map<String, Object> result = new HashMap<String, Object>();
        List<String> resultMessage = new ArrayList<>();

        if(packageId > 0) {
            List<Chapter> chapterList = chapterService.findChapterList(packageId);

            if (!chapterList.isEmpty()) {
                result.put("chapters", chapterList);
                resultMessage.add("SUCCESS");
            } else {
                result.put("data", "fail");
                resultMessage.add("packageId NOT_MATCH");
            }
        }
        result.put("result_message", resultMessage);

        return result;
    }
}

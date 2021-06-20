package com.education.hybe.controller;

import com.education.hybe.domain.Video;
import com.education.hybe.service.VideoService;
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
@RequestMapping(value = "/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @ApiOperation(value = "# 3. 영상 리스트", notes = "chapterId 값으로 리스트 조회")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "chapterId", value = "chapter id 값", required = true, dataType = "int", paramType = "path", defaultValue = "")
    })
    @GetMapping(value = "/{chapterId}")
    public @ResponseBody Map<String, Object> selectVideos(@PathVariable Integer chapterId) {
        Map<String, Object> result = new HashMap<String, Object>();
        List<String> resultMessage = new ArrayList<>();

        if(chapterId > 0) {
            List<Video> videoList = videoService.findVideoList(chapterId);

            if (!videoList.isEmpty()) {
                result.put("videos", videoList);
                resultMessage.add("SUCCESS");
            } else {
                result.put("data", "fail");
                resultMessage.add("chapterId NULL_DATA");
            }
        }

        result.put("result_message", resultMessage);

        return result;
    }

    @ApiOperation(value = "# 4. 영상 검색", notes = "1) 영상 제목 2) 영상 태그")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "영상 제목", required = false, dataType = "String", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "tag", value = "영상 태그", required = false, dataType = "String", paramType = "path", defaultValue = "")
    })
    @GetMapping(value = "/search")
    public @ResponseBody Map<String, Object> searchVideos(@RequestParam(value = "title", required = false) String title,
                                                          @RequestParam(value = "tag", required = false) String tag) {
        Map<String, Object> result = new HashMap<String, Object>();
        List<String> resultMessage = new ArrayList<>();
        List<Video> videoList = new ArrayList<>();

        if(title == null && tag == null) {
            resultMessage.add("NULL_DATA");
        } else {
            if(title != null) {
                videoList = videoService.searchTitleVideo(title);
            } else if(tag != null) {
                videoList = videoService.searchTagVideo(tag);
            }

            if (!videoList.isEmpty()) {
                result.put("videos", videoList);
                resultMessage.add("SUCCESS");
            } else {
                resultMessage.add("NULL_DATA");
            }
        }
        result.put("result_message", resultMessage);

        return result;
    }
}


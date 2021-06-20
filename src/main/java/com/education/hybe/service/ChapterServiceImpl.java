package com.education.hybe.service;

import com.education.hybe.domain.Chapter;
import com.education.hybe.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Override
    public Chapter findById(Integer id) {

        return chapterRepository.findById(id).get();
    }

    @Override
    public List<Chapter> findChapterList(Integer packageId) {

        return chapterRepository.findByPackageId(packageId);
    }
}
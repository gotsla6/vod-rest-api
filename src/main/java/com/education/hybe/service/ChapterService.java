package com.education.hybe.service;

import com.education.hybe.domain.Chapter;

import java.util.List;

public interface ChapterService {

    public Chapter findById(Integer id);

    public List<Chapter> findChapterList(Integer packageId);
}

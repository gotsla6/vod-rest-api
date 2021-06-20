package com.education.hybe.service;

import com.education.hybe.domain.Package;
import com.education.hybe.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {
    @Autowired
    private PackageRepository packageRepository;

    @Override
    public List<Package> findPackageList() {

        return packageRepository.findAll();
    }
}

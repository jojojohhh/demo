package com.osci.demo.service;

import com.osci.demo.entity.CrowdUser;
import com.osci.demo.repository.CrowdUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Log4j2
public class CrowdUserService {

    private final CrowdUserRepository crowdUserRepository;

    public Stream<CrowdUser> streamAll() {
        log.info("com.osci.demo.repository.CrowdUserRepository method findAll()");
        return crowdUserRepository.streamAll();
    }
}

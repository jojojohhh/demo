package com.osci.demo.scheduler;

import com.osci.demo.entity.CrowdUser;
import com.osci.demo.service.CrowdUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
@Log4j2
public class Scheduler {

    private final CrowdUserService crowdUserService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void cronRun() {
        Stream<CrowdUser> crowdUsers = crowdUserService.streamAll();
        /*
        for (CrowdUser user : crowdUsers) {
            log.info(user.toString());
        }

         */
    }
}

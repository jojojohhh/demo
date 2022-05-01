package com.osci.demo.Controller;

import com.osci.demo.service.CrowdUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class CrowdUserRestController {

    private final CrowdUserService crowdUserService;

    @GetMapping("/user")
    public String getAll() {
        return crowdUserService.streamAll().toString();
    }
}

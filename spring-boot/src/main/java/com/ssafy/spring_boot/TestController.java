package com.ssafy.spring_boot;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/tests")
public class TestController {

    private final TestService testService;

    @GetMapping
    public List<Test> findAllTests() {
        return testService.findAllTests();
    }

    @PostMapping("/create")
    public Test createTest(@RequestBody Test test) {
        return testService.createTest(test);
    }
}

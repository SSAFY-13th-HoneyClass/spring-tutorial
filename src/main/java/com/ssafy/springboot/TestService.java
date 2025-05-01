package com.ssafy.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    /* Read All*/
    @Transactional(readOnly = true)
    public List<Test> findAllTests() {
        return testRepository.findAll();
    }

    @Transactional
    public Test saveTest(String name) {
        Test test = new Test();
        test.setName(name);
        return testRepository.save(test);
    }

}
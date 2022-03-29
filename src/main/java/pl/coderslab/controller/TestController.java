package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.Test;
import pl.coderslab.repository.TestRepository;

@Controller
public class TestController {
private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/test")
    @ResponseBody
    private String findAll(){
        Test test = new Test();
        test.setContent("content1");
        testRepository.save(test);
        return testRepository.findAll().toString();
    }
}

package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public List<TestObject> getAllTestObjects () {
        return testService.getAll();
    }

    @PostMapping
    public TestObject save(@RequestBody TestObject object) {
        return testService.save(object);

    }
}

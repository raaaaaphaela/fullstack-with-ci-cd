package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public List<TestObject> getAll() {
        return testRepository.findAll();
    }

    public TestObject save(TestObject object) {
        return testRepository.save(object);
    }
}

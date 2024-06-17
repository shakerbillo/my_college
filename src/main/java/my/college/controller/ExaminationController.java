package my.college.controller;

import my.college.domain.Examination;
import my.college.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examinations")
public class ExaminationController {

    private final ExaminationService examinationService;

    @Autowired
    public ExaminationController(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    @GetMapping
    public List<Examination> getAllExaminations() {
        return examinationService.findAll();
    }

    @GetMapping("/{id}")
    public Examination getExaminationById(@PathVariable Long id) {
        return examinationService.findById(id).orElseThrow(() -> new RuntimeException("Examination not found"));
    }

    @PostMapping
    public Examination createExamination(@RequestBody Examination examination) {
        return examinationService.save(examination);
    }
}

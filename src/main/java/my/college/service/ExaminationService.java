package my.college.service;

import my.college.domain.Examination;

import java.util.List;
import java.util.Optional;

public interface ExaminationService {
    List<Examination> findAll();
    Optional<Examination> findById(Long id);
    Examination save(Examination examination);
}

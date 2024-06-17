package my.college.service;

import my.college.domain.Examination;
import my.college.repository.ExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationServiceImpl implements ExaminationService {

    private final ExaminationRepository examinationRepository;

    @Autowired
    public ExaminationServiceImpl(ExaminationRepository examinationRepository) {
        this.examinationRepository = examinationRepository;
    }

    @Override
    public List<Examination> findAll() {
        return examinationRepository.findAll();
    }

    @Override
    public Optional<Examination> findById(Long id) {
        return examinationRepository.findById(id);
    }

    @Override
    public Examination save(Examination examination) {
        return examinationRepository.save(examination);
    }
}

package my.college.config;

import my.college.domain.Examination;
import my.college.repository.ExaminationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(ExaminationRepository examinationRepository) {
        return args -> {
            examinationRepository.save(new Examination(null, "SW Deployment Exam", "2024-06-14", "Eligible students"));
            examinationRepository.save(new Examination(null, "SW Architecture Exam", "2024-06-16", "Eligible students"));
            examinationRepository.save(new Examination(null, "ML Exam", "2024-06-19", "Eligible students"));
            examinationRepository.save(new Examination(null, "Text Mining Exam", "2024-06-30", "Eligible students"));
            examinationRepository.save(new Examination(null, "Database Exam", "2024-06-16", "Eligible students"));
            examinationRepository.save(new Examination(null, "Cyber Crime Exam", "2024-06-21", "Eligible students"));
            examinationRepository.save(new Examination(null, "SW Engineering Exam", "2024-06-18", "Eligible students"));
        };
    }
}

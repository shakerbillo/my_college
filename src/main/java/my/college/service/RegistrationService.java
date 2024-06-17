package my.college.service;

import my.college.domain.Registration;

import java.util.List;

public interface RegistrationService {
    Registration save(Registration registration);
    void delete(Long id);
    List<Registration> findAll();
}

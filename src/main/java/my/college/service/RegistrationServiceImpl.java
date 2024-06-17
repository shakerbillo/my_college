package my.college.service;

import my.college.domain.Registration;
import my.college.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;
    private final ConfirmationService confirmationService;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository registrationRepository, ConfirmationService confirmationService) {
        this.registrationRepository = registrationRepository;
        this.confirmationService = confirmationService;
    }

    @Override
    public Registration save(Registration registration) {
        Registration savedRegistration = registrationRepository.save(registration);
        // Send confirmation after successful registration
        confirmationService.sendConfirmation(savedRegistration.getStudentId(), savedRegistration.getExamId());
        return savedRegistration;
    }

    @Override
    public void delete(Long id) {
        registrationRepository.deleteById(id);
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }
}

package my.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import my.college.domain.Registration;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}

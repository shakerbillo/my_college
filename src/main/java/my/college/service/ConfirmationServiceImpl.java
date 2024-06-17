package my.college.service;

import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class ConfirmationServiceImpl implements ConfirmationService {

    private static final Logger logger = Logger.getLogger(ConfirmationServiceImpl.class.getName());

    @Override
    public void sendConfirmation(Long studentId, Long examId) {

        //  sending a confirmation message
        logger.info("Confirmation sent to student ID " + studentId + " for exam ID " + examId + " All the best in your exams!!!!! ");
    }
}

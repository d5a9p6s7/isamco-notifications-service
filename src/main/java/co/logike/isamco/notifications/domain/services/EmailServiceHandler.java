package co.logike.isamco.notifications.domain.services;

import co.logike.isamco.notifications.application.model.SendEmailRequest;
import co.logike.isamco.notifications.application.model.SendEmailResponse;
import co.logike.isamco.notifications.domain.ports.incoming.EmailService;
import co.logike.isamco.notifications.domain.ports.outcoming.SendEmail;
import co.logike.isamco.notifications.infrastructure.SendEmailHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailServiceHandler implements EmailService {

    private final SendEmail sendEmail;

    public EmailServiceHandler(SendEmailHandler sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public SendEmailResponse sendEmail(SendEmailRequest request) {
        log.debug("method: sendEmail({})", request);
        return sendEmail.sendEmail(request);
    }
}

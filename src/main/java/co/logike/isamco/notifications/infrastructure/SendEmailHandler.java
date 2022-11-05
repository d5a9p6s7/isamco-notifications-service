package co.logike.isamco.notifications.infrastructure;

import co.logike.isamco.notifications.domain.model.SendEmailRequest;
import co.logike.isamco.notifications.domain.model.SendEmailResponse;
import co.logike.isamco.notifications.domain.ports.outcoming.SendEmail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class SendEmailHandler implements SendEmail {

    @Override
    public SendEmailResponse sendEmail(SendEmailRequest request) {
        log.debug("method: sendEmail({})", request);
        return null;
    }
}

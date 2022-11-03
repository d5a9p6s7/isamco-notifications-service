package co.logike.isamco.notifications.domain.ports.incoming;

import co.logike.isamco.notifications.application.model.SendEmailRequest;
import co.logike.isamco.notifications.application.model.SendEmailResponse;

public interface EmailService {

    SendEmailResponse sendEmail(final SendEmailRequest request);
}

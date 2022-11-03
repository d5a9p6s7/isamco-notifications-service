package co.logike.isamco.notifications.domain.ports.outcoming;

import co.logike.isamco.notifications.application.model.SendEmailRequest;
import co.logike.isamco.notifications.application.model.SendEmailResponse;

public interface SendEmail {

    SendEmailResponse sendEmail(final SendEmailRequest request);
}

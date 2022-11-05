package co.logike.isamco.notifications.domain.ports.outcoming;

import co.logike.isamco.notifications.domain.model.SendEmailRequest;
import co.logike.isamco.notifications.domain.model.SendEmailResponse;

public interface SendEmail {

    SendEmailResponse sendEmail(final SendEmailRequest request);
}

package co.logike.isamco.notifications.domain.ports.incoming;

import co.logike.isamco.notifications.domain.exception.ApplicationException;
import co.logike.isamco.notifications.domain.model.SendEmailRequest;
import co.logike.isamco.notifications.domain.model.SendEmailResponse;

public interface EmailService {

    SendEmailResponse sendEmail(final SendEmailRequest request) throws ApplicationException;
}

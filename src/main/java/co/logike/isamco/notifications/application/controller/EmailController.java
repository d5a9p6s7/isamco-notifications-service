package co.logike.isamco.notifications.application.controller;

import co.logike.isamco.notifications.application.model.ResponseEvent;
import co.logike.isamco.notifications.application.model.SendEmailRequest;
import co.logike.isamco.notifications.application.model.SendEmailResponse;
import co.logike.isamco.notifications.domain.ports.incoming.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/email")
public class EmailController extends APIController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @Operation(summary = "Service for send a Email.")
    @PostMapping("/")
    public ResponseEntity<ResponseEvent<SendEmailResponse>> sendEmail(@RequestBody final SendEmailRequest request) {

        log.debug("method: sendEmail({})", request);
        var response = emailService.sendEmail(request);
        log.debug("method: sendEmail({}) -> {}", request, response);
        return buildHttpResponse(response);
    }
}

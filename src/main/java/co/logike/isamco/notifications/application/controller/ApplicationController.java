package co.logike.isamco.notifications.application.controller;

import co.logike.isamco.notifications.application.model.APIControllerRecord;
import co.logike.isamco.notifications.application.model.ResponseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApplicationController extends APIController {

    private final APIControllerRecord apiControllerRecord;

    @Autowired
    public ApplicationController(APIControllerRecord apiControllerRecord) {
        this.apiControllerRecord = apiControllerRecord;
    }

    @GetMapping("/")
    public ResponseEntity<ResponseEvent<String>> root() {

        var message = getMessage(apiControllerRecord, "root()");
        log.info("method: root() -> Message {}", message);

        return buildHttpResponse(message);
    }
}

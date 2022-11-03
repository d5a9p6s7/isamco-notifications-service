package co.logike.isamco.notifications.application.controller;

import co.logike.isamco.notifications.application.model.APIControllerRecord;
import co.logike.isamco.notifications.application.model.ResponseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class APIController {

    public static <T> ResponseEntity<ResponseEvent<T>> buildHttpResponse(T response) {

        log.debug("method: buildHttpResponse({})", response);

        return new ResponseEntity<>(new ResponseEvent<T>().ok("Success", response), HttpStatus.OK);
    }

    protected String getMessage(APIControllerRecord apiControllerRecord, final String methodName) {

        log.debug("method: getMessage({})", methodName);
        return String.format("method: %s", methodName) +
                String.format(" -> Date: %s,", new SimpleDateFormat(apiControllerRecord.getDateFormat()).format(new Date())) +
                String.format(" -> ProfileEntity active: %s", apiControllerRecord.getProfile()) +
                String.format(" -> Time Zone: %s", apiControllerRecord.getTimeZone());
    }
}

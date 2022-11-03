package co.logike.isamco.notifications.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIControllerRecord {
    private String profile;
    private String timeZone;
    private String dateFormat;
}

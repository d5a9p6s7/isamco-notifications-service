package co.logike.isamco.notifications.application.config;

import co.logike.isamco.notifications.application.model.APIControllerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIControllerConfiguration {

    @Value("${spring.config.activate.on-profile}")
    private String profile;

    @Value("${configuration.properties.time-zone}")
    private String timeZone;

    @Value("${configuration.properties.date-format}")
    private String dateFormat;

    @Bean
    public APIControllerRecord apiControllerRecord() {
        return new APIControllerRecord(profile, timeZone, dateFormat);
    }
}

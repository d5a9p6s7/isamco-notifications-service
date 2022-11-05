package co.logike.isamco.notifications.domain.model;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SendEmailRequest {

    private String to;
    private String cc;
    private String cco;
    private String subject;
    private String body;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

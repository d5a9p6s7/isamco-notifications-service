package co.logike.isamco.notifications.application.model;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SendEmailResponse {

    private String status;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

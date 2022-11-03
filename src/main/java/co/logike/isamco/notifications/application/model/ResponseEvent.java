package co.logike.isamco.notifications.application.model;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseEvent<T> {

    private ResponseCode code;
    private String message;
    private T data;

    public ResponseEvent<T> ok(String message) {
        return ok(message, null);
    }

    public ResponseEvent<T> ok(String message, T data) {
        setCode(ResponseCode.OK);
        setMessage(message);
        setData(data);
        return this;
    }

    public ResponseEvent<T> noContent(String message) {
        setCode(ResponseCode.NO_CONTENT);
        setMessage(message);
        return this;
    }

    public ResponseEvent<T> badRequest(String message) {
        setCode(ResponseCode.BAD_REQUEST);
        setMessage(message);
        return this;
    }

    public ResponseEvent<T> applicationError(String message) {
        setCode(ResponseCode.APPLICATION_ERROR);
        setMessage(message);
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

package com.example.userservice.domains;

import org.springframework.http.HttpStatus;

public class HttpResponse {

    private int HttpStatusCode;
    private HttpStatus httpStatus;
    private String reason;
    private String message;

    public HttpResponse() {
    }

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        HttpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    public int getHttpStatusCode() {
        return HttpStatusCode;
    }

    public HttpResponse setHttpStatusCode(int httpStatusCode) {
        HttpStatusCode = httpStatusCode;
        return this;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public HttpResponse setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public HttpResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public HttpResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}

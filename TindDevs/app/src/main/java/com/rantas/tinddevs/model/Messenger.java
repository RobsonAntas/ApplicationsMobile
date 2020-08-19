package com.rantas.tinddevs.model;

public class Messenger {

    private String failureMessage;
    private int errorCode;


    public Messenger(String failureMessage, int errorCode) {
        this.errorCode =errorCode;
        this.failureMessage = failureMessage;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }


}


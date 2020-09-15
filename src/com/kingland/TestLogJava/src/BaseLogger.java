/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.TestLogJava.src;

public class BaseLogger {
    private String header;

    /**
     * The minimum length of message
     */
    private int minLength;

    /**
     * The maximum length of message
     */
    private int maxLength;
    public void setHeader(String header) {
        this.header = header;
    }
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
    public void log(String exception) throws Exception {
        validException(exception);
        System.out.println(header + exception);
    }
    public void log(String exception, String message) throws Exception {
        validMessage(message);
        validException(exception);
        System.out.println(header + message);
        System.out.println(header + exception);
    }
    private void validException(String exception) throws Exception {
        final String EXCEPTION = "Exception";
        if (null == exception || !exception.startsWith(EXCEPTION)) {
            throw new Exception("Exception does not conform to the rules!" + null == exception ? "null" : "start error");
        }
    }
    private void validMessage(String message) throws Exception {
        if (null == message || message.length() < minLength || message.length() > maxLength) {
            throw new Exception("Message does not conform to the rules!" + null == message ? "null" : String.valueOf(message.length()));
        }
    }
}

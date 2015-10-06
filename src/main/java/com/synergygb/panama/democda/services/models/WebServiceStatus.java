package com.synergygb.panama.democda.services.models;

import com.synergygb.panama.democda.config.messages.MessagesProperties;
import java.io.Serializable;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class WebServiceStatus implements Serializable {

    private int code;
    private String status;
    private String msg;
    private String error;

    private static final String OK_STATUS = "OK";
    private static final int OK_CODE = 200;
    private static final String FAIL_STATUS = "FAIL";
    private static final int FAIL_CODE = 500;
    
    public WebServiceStatus() {
    }

    public WebServiceStatus(int code, String status, String msg, String error) {
        this.code = code;
        this.status = status;
        this.msg = msg;
        this.error = error;
    }

    public WebServiceStatus(int code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public WebServiceStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }
    
    public static WebServiceStatus okResponse() {
        return new WebServiceStatus(OK_CODE, OK_STATUS);
    }

    public static WebServiceStatus failResponseByDefault() {
        return new WebServiceStatus(FAIL_CODE, FAIL_STATUS, MessagesProperties.getDEFAULT_ERROR());
    }
    
    public static WebServiceStatus failResponseByDefault(Exception ex) {
        return new WebServiceStatus(FAIL_CODE, FAIL_STATUS, MessagesProperties.getDEFAULT_ERROR(), ex.getMessage());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static String getOK_STATUS() {
        return OK_STATUS;
    }

    public static int getOK_CODE() {
        return OK_CODE;
    }

    public static String getFAIL_STATUS() {
        return FAIL_STATUS;
    }

    public static int getFAIL_CODE() {
        return FAIL_CODE;
    }

    @Override
    public String toString() {
        return "WebServiceStatus{" + "code=" + code + ", status=" + status + ", msg=" + msg + ", error=" + error + '}';
    }
    
}

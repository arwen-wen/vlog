package com.arwen.vlog.common;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serviceVersionUID = 1L;
    private int resultCode;
    private String message;
    private T data;
    public Result() {

    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }
}

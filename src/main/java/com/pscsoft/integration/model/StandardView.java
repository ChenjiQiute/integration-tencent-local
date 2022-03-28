package com.pscsoft.integration.model;

public class StandardView<T> {

    private final T content;
    private final String msg;
    private int code = 200;

    public StandardView(T content) {
        this.msg = null;
        this.content = content;
    }

    public StandardView(String msg, int code) {
        this.msg = msg;
        this.code = code;
        this.content = null;
    }

    public StandardView(String msg, T content, int code) {
        this.msg = msg;
        this.content = content;
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

}
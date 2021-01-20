package com.example.demo.controller;

import lombok.Data;

/**
 * 返回结果集
 */
@Data
public class Result {

    private boolean success;
    private String message;
    private Object data;

    public Result() {
    }
    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(boolean success, String message,Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


}
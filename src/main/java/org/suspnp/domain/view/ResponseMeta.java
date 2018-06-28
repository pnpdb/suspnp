package org.suspnp.domain.view;

/**
 * Created by lianhai on 2018/4/9.
 */
public enum ResponseMeta {

    /* 请求成功 */
    SUCCESS(0, "操作成功");

    private Integer code;

    private String message;

    ResponseMeta(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.message;
    }
    }

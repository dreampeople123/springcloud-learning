package com.ze.demo.springcloud.ribbonservice.pojo;

/**
 * @author Gze
 * @ClassName:Result
 * @Description: TODO
 * @date 2021/3/24 15:26
 * 注意：本内容仅限于全民通科技内部传阅，禁止外泄以及用于其他的商业目
 */
public class Result<T>
{
    private T data;

    private String message;

    private int code;

    public Result() {
    }

    public Result(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public Result(String message, Integer code) {
        this(null, message, code);
    }

    public Result(T data) {
        this(data, "操作成功", 200);
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



}

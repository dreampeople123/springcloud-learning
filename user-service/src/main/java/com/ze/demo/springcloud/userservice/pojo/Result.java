package com.ze.demo.springcloud.userservice.pojo;

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
}

package com.ze.demo.springcloud.userservice.pojo;

/**
 * @author Gze
 * @ClassName:User
 * @Description: TODO
 * @date 2021/3/24 15:25
 * 注意：本内容仅限于全民通科技内部传阅，禁止外泄以及用于其他的商业目
 */
public class User
{
    private Long id;
    private String username;
    private String password;
    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

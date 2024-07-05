package cn.toguide.limgrave.base;

import lombok.Data;

@Data
public class Response {

    public static final String SUCCESS = "200";

    private String code;

    private String message;


    public static Response success() {
        var response = new Response();
        response.setCode(SUCCESS);
        response.setMessage("success");
        return new Response();
    }
}

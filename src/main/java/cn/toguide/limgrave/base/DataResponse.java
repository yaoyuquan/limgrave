package cn.toguide.limgrave.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResponse<T> extends Response {

    private T data;


    public static <T> DataResponse<T> success(T data) {
        DataResponse<T> response = new DataResponse<>();
        response.setData(data);
        response.setCode(SUCCESS);
        response.setMessage("success");

        return response;
    }

}

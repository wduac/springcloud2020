package com.wduac.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wduac
 * @date 2021/2/17 - 23:04
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    //404 Not found
    private Integer code;
    private String message;
    private T data;

    public  CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}

package com.bdqn.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 数据执行结果
 */

@Data
public class BaseResult implements Serializable {
    public static final String RESUTL_OK = "ok";
    public static final String RESUTL_NOT_OK = "not_ok";
    public static final String SUCCESS = "成功操作";


    private String result;
    private Object data;
    private Cursor cursor;
    private String success;
    private List<Error> errors;

    /**
     * 成功操作，无数据
     * @return
     */
    public static BaseResult ok(){
        return createResult(RESUTL_OK,null,null,SUCCESS,null);
    }

    /**
     * 成功操作，有数据
     * @param data
     * @return
     */
    public static BaseResult ok(Object data){
        return createResult(RESUTL_OK,data,null,SUCCESS,null);
    }

    /**
     * 失败
     * @param errors
     * @return
     */
    public static BaseResult notOk(List<Error> errors){
        return createResult(RESUTL_NOT_OK,null,null,"",errors);
    }
    /**
     * 生成执行结果
     * @param result
     * @param data
     * @param cursor
     * @param success
     * @param errors
     * @return
     */
    public static BaseResult createResult(String result,Object data,Cursor cursor,String success,List<Error> errors){
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(result);
        baseResult.setData(data);
        baseResult.setCursor(cursor);
        baseResult.setSuccess(success);
        baseResult.setErrors(errors);
        return baseResult;
    }

    /**
     * 分页数据
     */
    @Data
    public static class Cursor{
        private int total;
        private int offset;
        private int limit;
    }

    /**
     * 错误信息
     */
    @Data
    @AllArgsConstructor
    public static class Error{
        private String field;
        private String message;

    }
}

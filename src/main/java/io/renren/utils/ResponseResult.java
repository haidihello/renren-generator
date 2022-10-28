package io.renren.utils;


import java.io.Serializable;
import java.util.List;

/**
 * @author gengxin.hao
 * @version 2022/10/21
 */
public class ResponseResult<T> implements Serializable {

    private boolean success = true;

    private String status;

    private T data;

    private String rspMsg;

    private String rspCode;

    private List<ValidateError> errList;

    private final long timestamps = System.currentTimeMillis();

    public synchronized static <T> ResponseResult<T> e(ResponseCode statusEnum) {
        return e(statusEnum,null);
    }

//    public synchronized static <T> ResponseResult<T> e(PayCode payCode) {
//        ResponseResult<T> res = new ResponseResult<>();
//        res.setSuccess(false);
//        res.setStatus(payCode.name());
//        res.setRspMsg(payCode.getMsg());
//        res.setData(null);
//        res.setRspCode(payCode.name());
//        return res;
//    }
//
    public synchronized static <T> ResponseResult<T> e(ErrorCode errorCode) {
        return e(errorCode,null);
    }

    public synchronized static <T> ResponseResult<T> e(ErrorCode errorCode, T data) {
        ResponseResult<T> res = new ResponseResult<>();
        res.setSuccess(false);
        res.setStatus(errorCode.getStatus());
        res.setRspMsg(errorCode.getMsg());
        res.setData(data);
        res.setRspCode(errorCode.getCode());
        return res;
    }

    public synchronized static <T> ResponseResult<T> e(ResponseCode statusEnum, T data) {
        ResponseResult<T> res = new ResponseResult<>();
        res.setSuccess(false);
        res.setStatus(statusEnum.rspCode);
        res.setRspMsg(statusEnum.rspMsg);
        res.setData(data);
        res.setRspCode(statusEnum.rspCode);
        return res;
    }

    public synchronized static <T> ResponseResult<T> ok(ResponseCode statusEnum) {
        return ok(statusEnum,null);
    }

    public synchronized static <T> ResponseResult<T> ok(ResponseCode statusEnum, T data) {
        ResponseResult<T> res = new ResponseResult<>();
        res.setSuccess(true);
        res.setStatus(statusEnum.rspCode);
        res.setRspMsg(statusEnum.rspMsg);
        res.setData(data);
        res.setRspCode(statusEnum.rspCode);
        return res;
    }

    public synchronized static <T> ResponseResult<T> ok() {
        return ok(ResponseCode.OK,null);
    }
    public synchronized static <T> ResponseResult<T> e() {
        return e(ResponseCode.FAIL,null);
    }
    public synchronized static <T> ResponseResult<T> ok(T data) {
        return ok(ResponseCode.OK,data);
    }

    private static final long serialVersionUID = 8992436576262574064L;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRspMsg() {
        return rspMsg;
    }

    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public List<ValidateError> getErrList() {
        return errList;
    }

    public void setErrList(List<ValidateError> errList) {
        this.errList = errList;
    }

    public long getTimestamps() {
        return timestamps;
    }
}

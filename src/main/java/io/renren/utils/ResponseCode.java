package io.renren.utils;



/**
 * 尽量使用少的错误码。前台判断起来不方便，容易晕。一般操作的错误返回-1即可,RequestException.fail("错误信息");
 *
 * @author gengxin.hao
 * @version 2022/10/21
 */
public enum ResponseCode {

    OK("00","操作成功"),
    ERROR("99","功能暂未开放"),
    PARAM_INVALID("99","无效参数"),
    ORDER_ID_REPEAT("99","交易订单号重复"),
    FAIL("99","操作失败");

    public String rspCode;

    public String rspMsg;

    public String getRspCode() {
        return rspCode;
    }

    public String getRspMsg() {
        return rspMsg;
    }

    ResponseCode(String rspCode, String rspMsg) {
        this.rspCode = rspCode;
        this.rspMsg = rspMsg;
    }
}


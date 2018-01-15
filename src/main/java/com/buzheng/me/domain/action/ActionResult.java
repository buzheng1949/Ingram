package com.buzheng.me.domain.action;

import com.sun.istack.internal.Nullable;
import lombok.Data;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class ActionResult<R> {
    /**
     * 返回数据格式 此部分数据格式自定义
     */
    R data;
    /**
     * 是否成功
     *
     * @see Status#success
     */
    boolean isSuccess;
    /**
     * 状态码
     *
     * @see Status#code
     */
    Integer code;
    /**
     * 返回信息
     *
     * @see Status#message
     */
    String message;

    /**
     * 对外构建结果对象
     *
     * @param status
     * @param data
     * @return
     */
    public ActionResult<R> of(Status status, R data) {
        ActionResult<R> actionResult = new ActionResult<R>();
        actionResult.setCode(status.getCode());
        actionResult.setData(data);
        actionResult.setMessage(status.getMessage());
        actionResult.setSuccess(status.isSuccess());
        return actionResult;
    }

    /**
     * 对外构建结果对象
     *
     * @param status
     * @return
     */
    public ActionResult of(Status status) {
        ActionResult actionResult = new ActionResult();
        actionResult.setCode(status.getCode());
        actionResult.setMessage(status.getMessage());
        actionResult.setSuccess(status.isSuccess());
        return actionResult;
    }

}

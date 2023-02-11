package com.onlineEdu.base.exception;

/**
 * @author Astronaut
 * @version 1.0
 * @description
 * @date 2022/10/10 9:14
 */
public class OnlineEduExpection extends RuntimeException {

    private String errMessage;

    public OnlineEduExpection() {
        super();
    }

    public OnlineEduExpection(String message) {
        super(message);
        this.errMessage = message;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(String errMessage) {
        throw new OnlineEduExpection(errMessage);
    }

    public static void cast(CommonError commonError) {
        throw new OnlineEduExpection(commonError.getErrMessage());
    }
}

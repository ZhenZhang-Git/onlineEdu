package com.onlineEdu.base.exception;

/**
 * @author Astronaut
 * @version 1.0
 * @description 
 * @date 2022/10/10 9:14
 */
public class OnlineEduException extends RuntimeException {

    private String errMessage;

    public OnlineEduException() {
        super();
    }

    public OnlineEduException(String message) {
        super(message);
        this.errMessage = message;
    }

    public String getErrMessage(){
        return errMessage;
    }

    public static void cast(String errMessage){
        throw new OnlineEduException(errMessage);
    }
    public static void cast(CommonError commonError){
        throw new OnlineEduException(commonError.getErrMessage());
    }
}

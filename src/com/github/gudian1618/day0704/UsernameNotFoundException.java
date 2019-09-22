package com.github.gudian1618.day0704;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 3:07 下午
 */

public class UsernameNotFoundException extends Exception {

    public UsernameNotFoundException() {
    }

    public UsernameNotFoundException(String message) {
        super(message);
    }

    public UsernameNotFoundException(Throwable cause) {
        super(cause);
    }

    public UsernameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

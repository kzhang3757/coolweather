package com.kzhang.coolweather.util;

/**
 * Created by ZK on 2016/3/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

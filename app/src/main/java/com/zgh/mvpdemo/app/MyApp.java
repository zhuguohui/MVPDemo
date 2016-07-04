package com.zgh.mvpdemo.app;

import android.app.Application;

import com.zgh.mvpdemo.R;
import com.zgh.mvpdemo.retry.LoadingAndRetryManager;

/**
 * Created by yuelin on 2016/6/29.
 */
public class MyApp extends Application {
    public static MyApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //设置多个页面共享加载和重试页面
        LoadingAndRetryManager.BASE_RETRY_LAYOUT_ID = R.layout.base_retry;
        LoadingAndRetryManager.BASE_LOADING_LAYOUT_ID = R.layout.base_loading;
        LoadingAndRetryManager.BASE_EMPTY_LAYOUT_ID = R.layout.base_empty;
    }
}

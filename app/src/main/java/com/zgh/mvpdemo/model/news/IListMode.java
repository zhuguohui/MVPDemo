package com.zgh.mvpdemo.model.news;

/**
 * Created by yuelin on 2016/6/29.
 */
public interface IListMode {
    void LoadData(boolean useCache,String url,DataResultListener listener);
}

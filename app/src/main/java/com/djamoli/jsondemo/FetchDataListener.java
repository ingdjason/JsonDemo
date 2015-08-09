package com.djamoli.jsondemo;

/**
 * Created by Ing Djason(Admin) on 09-Aug-15.
 */
import java.util.List;

public interface FetchDataListener {
    public void onFetchComplete(List<Application> data);
    public void onFetchFailure(String msg);
}
package com.simple.plugin;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.supconit.develop.JSBridge;
import com.supconit.develop.Response;

import org.json.JSONArray;

public class SimpleAndroidPluginNativiePart implements JSBridge {

    @Override
    public void onApplicationCreate(Application application) {

    }

    // todo 为了释放callBack内存 必须回调其中success或者error方法
    @Override
    public void execute(String action, JSONArray args, Response callbackContext) {
        callbackContext.success(action + "ok 33333?");
    }

    @Override
    public void onActivityCreate(Activity activity) {

    }

    @Override
    public void onActivityPase(Activity activity) {

    }

    @Override
    public void onActivityDestory(Activity activity) {

    }
}
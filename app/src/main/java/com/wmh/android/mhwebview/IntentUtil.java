package com.wmh.android.mhwebview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class IntentUtil {

    private static final String TAG = IntentUtil.class.getSimpleName();

    /**
     * 打开Android设置界面
     */

    /**
     *  采用Bundle的方式传递数据
     */
    public static void startNewIntent(Context context,Class clazz,Bundle bundle,String bundleName){
        Intent intent = new Intent();
        intent.putExtra(bundleName,bundle);
        intent.setClass(context,clazz);
        context.startActivity(intent);
    }

    public static void startNewIntent(Context context,Class clazz,String...args){
        Intent intent = new Intent();
        for (String arg : args) {
            if (null != intent)
            intent.putExtra(arg,arg);
        }
        intent.setClass(context,clazz);
        context.startActivity(intent);
    }



    public static void putBooleanExtra(Intent intent,boolean ...args){
        for (boolean arg : args) {
            if (null != intent)
            intent.putExtra(String.valueOf(arg),args);
        }
    }

    public static void putStringExtra(Intent intent,String ...args){
        for (String arg : args) {
            if (null != intent)
            intent.putExtra(arg,args);
        }
    }

    public static void putIntegerExtra(Intent intent,Integer ...args){
        for (Integer arg : args) {
            if (null != intent)
            intent.putExtra(String.valueOf(arg),args);
        }
    }

//    public void putExtra(Intent intent,Object ...args){
//        for (Object arg : args) {
//            if (null != intent)
//                intent.putExtra(String.valueOf(arg),arg);
//        }
//    }

    public static Bundle getIntentBundleValue(AppCompatActivity context,String bundleName){
        Intent intent = context.getIntent();
        Bundle bundleExtra = intent.getBundleExtra(bundleName);
        return bundleExtra;
    }

    //    public static void startNewIntent(Context context,Class clazz,Object...args){
//        Intent intent = new Intent();
//        for (Object arg : args) {
//            if (null != intent)
//                intent.putExtra(String.valueOf(arg),arg);
//        }
//        intent.setClass(context,clazz);
//        context.startActivity(intent);
//    }
}

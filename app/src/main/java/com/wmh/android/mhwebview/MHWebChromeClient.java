package com.wmh.android.mhwebview;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class MHWebChromeClient extends WebChromeClient {

    private static final String TAG = MHWebChromeClient.class.getSimpleName();

    private Context mContext;
    private ProgressBar mProgressBar;
    private View customView;

    public MHWebChromeClient(Context mContext) {
        this.mContext = mContext;
    }

    public MHWebChromeClient(Context mContext, ProgressBar mProgressBar) {
        this.mContext = mContext;
        this.mProgressBar = mProgressBar;
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {

        if (null != mProgressBar){
            if (newProgress == 100) {
                mProgressBar.setVisibility(View.INVISIBLE);
            } else {
                if (View.INVISIBLE == mProgressBar.getVisibility()) {
                    mProgressBar.setVisibility(View.VISIBLE);
                }
                mProgressBar.setProgress(newProgress);
            }
        }
        super.onProgressChanged(view, newProgress);
    }

    @Override
    public void onShowCustomView(View view, CustomViewCallback callback) {

        // if a view already exists then immediately terminate the new one
        super.onShowCustomView(view, callback);
    }

    @Override
    public void onHideCustomView() {
        super.onHideCustomView();
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        return super.onJsAlert(view, url, message, result);
    }

    @Override
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, filePathCallback, fileChooserParams);
    }

    //The undocumented magic method override
    //Eclipse will swear at you if you try to put @Override here

    // For Android 3.0+
    public void openFileChooser(ValueCallback<Uri> uploadMsg) {
        Log.d(TAG, "openFileChooser1");
        openFileChooser(uploadMsg,null);
    }

    // For Android 3.0+
    public void openFileChooser(ValueCallback uploadMsg, String acceptType) {
        Log.d(TAG, "openFileChooser2");
        openFileChooser(uploadMsg,acceptType,null);
    }

    //For Android 4.1
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        Log.d(TAG, "openFileChooser3");

    }

    public void setProgressBar(ProgressBar progressBar){
        this.mProgressBar = progressBar;
    }
}

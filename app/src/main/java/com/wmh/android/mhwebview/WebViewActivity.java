package com.wmh.android.mhwebview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;

/**
 * Created by Administrator on 2017/8/3 0003.
 */

public class WebViewActivity extends AppCompatActivity {

    private static final String TAG = WebViewActivity.class.getSimpleName();
    private ProgressBar mProgressbar;
    private MHWebView   mMhwebview;
    private String url = "https://www.baidu.com/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_layout);
        initView();
        processLogic();
    }

    private void initView() {
        mProgressbar = (ProgressBar) findViewById(R.id.progressbar);
        mMhwebview = (MHWebView) findViewById(R.id.mhwebview);
    }

    private void processLogic() {
        MHWebChromeClient mMHWebChromeClient = new MHWebChromeClient(this);
        mMHWebChromeClient.setProgressBar(mProgressbar);
        MHWebViewClient mMHWebViewClient = new MHWebViewClient(this);
        mMHWebViewClient.setWebView(mMhwebview);
        mMhwebview.setWebChromeClient(mMHWebChromeClient);
        mMhwebview.setWebViewClient(mMHWebViewClient);
        mMhwebview.loadUrl(url);
        String strJs = null;
        mMhwebview.evaluateJavascript(strJs, new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String s) {
                
            }
        });
    }

}

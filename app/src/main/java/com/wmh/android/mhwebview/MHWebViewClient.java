package com.wmh.android.mhwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.webkit.WebView.HitTestResult.ANCHOR_TYPE;
import static android.webkit.WebView.HitTestResult.EDIT_TEXT_TYPE;
import static android.webkit.WebView.HitTestResult.EMAIL_TYPE;
import static android.webkit.WebView.HitTestResult.GEO_TYPE;
import static android.webkit.WebView.HitTestResult.IMAGE_ANCHOR_TYPE;
import static android.webkit.WebView.HitTestResult.IMAGE_TYPE;
import static android.webkit.WebView.HitTestResult.PHONE_TYPE;
import static android.webkit.WebView.HitTestResult.SRC_ANCHOR_TYPE;
import static android.webkit.WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE;
import static android.webkit.WebView.HitTestResult.UNKNOWN_TYPE;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class MHWebViewClient extends WebViewClient {

    private static final String TAG = MHWebViewClient.class.getSimpleName();
    private Context mContext;
    private WebView mWebView;

    public MHWebViewClient(Context context) {
        this.mContext = context;
    }

    public MHWebViewClient(Context mContext, WebView mWebView) {
        this.mContext = mContext;
        this.mWebView = mWebView;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

        //获取点击的类型
        WebView.HitTestResult hitTestResult = view.getHitTestResult();
        int type = hitTestResult.getType();
        switch (type){
            case ANCHOR_TYPE:  //废弃
                break;
            case EDIT_TEXT_TYPE:
                break;
            case EMAIL_TYPE:
                break;
            case GEO_TYPE:
                break;
            case IMAGE_ANCHOR_TYPE:  //废弃
                break;
            case IMAGE_TYPE:
                break;
            case PHONE_TYPE:
                break;
            case SRC_ANCHOR_TYPE:
                break;
            case SRC_IMAGE_ANCHOR_TYPE:
                break;
            case UNKNOWN_TYPE:
                break;
            default:
                break;
        }

        return super.shouldOverrideUrlLoading(view, request);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

    }

    public void setWebView(WebView webView){
        this.mWebView = webView;
    }



}

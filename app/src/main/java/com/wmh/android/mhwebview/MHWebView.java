package com.wmh.android.mhwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class MHWebView extends WebView {

    private static final String TAG = MHWebView.class.getSimpleName();
    private Context mContext;

    public MHWebView(Context context) {
        super(context);
        this.mContext = context;
        initWebView();
    }

    public MHWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initWebView();
    }

    public MHWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initWebView();
    }
    private void initWebView() {
        WebSettings settings = this.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setDefaultTextEncodingName("UTF-8");
        settings.setMediaPlaybackRequiresUserGesture(true);
        //this.setWebViewClient(new MHWebViewClient(mContext));
        //this.setWebChromeClient(new MHWebChromeClient(mContext));
    }
}

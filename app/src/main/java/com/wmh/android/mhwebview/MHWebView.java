package com.wmh.android.mhwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class MHWebView extends WebView {

    /**
     * 1.	在目前的项目经验中WebView中涉及到的功能：
     * WebView中与JavaScript之间的交互问题；
     * WebView中存在图片等资源问题，右键长按菜单选择事件；
     * WebView中存在多个图片自选需要调用图片查看器等；
     * WebView中存在视频内容和音频内容等多媒体部件等处理；
     * 项目中配合使用的Jsoup对后台编辑器传递的文章正文进行自定义修改；
     * WebView调用系统相册/系统相机/系统文件管理中的资源，比如说图片上传功能
     */

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

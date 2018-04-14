package com.wmh.android.mhwebview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 1.上传文件（图片等资源）到网页当中
     * 2.WebView中的视频播放问题
     * 3.按返回键返回退到上一层goBack
     * 4.WebView退出关闭掉音乐、视频等声音
     * 5.对应注入js代码，长按保存图片到本地
     * 6.点击进入图片查看器
     * 7.WebView在使用过程中遇到的安全问题，在Android低版本的手机当中WebView与JS之间的漏洞问题
     * 8.360面试闻到的关于WebView的漏洞和安全问题。
     * 9.WebView 在Android不同版本之间的问题
     * 10.Android低版本上WebView的漏洞问题
     * 11.WebView中与原生视频的交互问题
     * 12.WebView多视频与多音频之间的交互问题
     */


    /**
     * 默认WebView
     */
    private Button mBtnWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnWebview = (Button) findViewById(R.id.btn_webview);
        mBtnWebview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_webview:
                IntentUtil.startNewIntent(this, WebViewActivity.class);
                break;
            default:
                break;
        }
    }
}

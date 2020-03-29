package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url != null && url.startsWith("market://")) {
            view.getContext().startActivity(
                    new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;
        } else {
            return false;
        }
    }
}

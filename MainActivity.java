package your.engine.product;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Setup your WebView
        WebView webView = new WebView(this);
        setContentView(webView);
        
        // --- THE VIP PASS SECRURITY BYPASS ---
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);      // CRITICAL FOR AIDE
        webSettings.setAllowUniversalAccessFromFileURLs(true); // CRITICAL FOR AIDE
        webSettings.setDomStorageEnabled(true);
        
        // Load your board
        webView.loadUrl("file:///android_asset/board.html");
    }
}

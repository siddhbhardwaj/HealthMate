package com.example.my_health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class article extends AppCompatActivity {
    TextView name;
    ImageView imageView;
    private WebView webView;
    //Button back_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        //name=findViewById(R.id.topic_name);
        //imageView=findViewById(R.id.imageView);
        //back_a=findViewById(R.id.back_a);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        String namet= intent.getStringExtra("position");
       // name.setText(namet);
         if (namet.compareTo("COVID-19") == 0){
             webView.loadUrl("https://www.bannerhealth.com/healthcareblog/tags/covid-19?page=1");
        }
        if (namet.compareTo("SMOKING KILLS")==0){
            webView.loadUrl("https://blogs.cdc.gov/niosh-science-blog/category/smoking/");
        }
        if (namet.compareTo("HEALTHY EATING") == 0){
            webView.loadUrl("https://realfoodrealdeals.com/");
        }
        if (namet.compareTo("EXERCISE DAILY") == 0){
            webView.loadUrl("https://www.mayoclinic.org/healthy-lifestyle/fitness/expert-answers/exercise/faq-20057916");
        }

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        /*back_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(article.this,Home.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

            }
        });*/

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
package com.example.userpc.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        WebView browser=findViewById(R.id.webView);
        int data=getIntent().getIntExtra("data",0);

        if (data==0){
            //load html file
            browser.loadUrl("file:///android_asset/Persons/1.html");
        }
        //continue for next person else if
        else  if (data==1){
            browser.loadUrl("file:///android_asset/Persons/2.html");

        }
        else if (data==2){
            browser.loadUrl("file:///android_asset/Persons/3.html");
        }
        else if (data==3){
            browser.loadUrl("file:///android_asset/Persons/4.html");
        }
        else if (data==4){
            browser.loadUrl("file:///android_asset/Persons/5.html");
        }
        else if (data==5){
            browser.loadUrl("file:///android_asset/Persons/6.html");
        }
        else if (data==6){
            browser.loadUrl("file:///android_asset/Persons/7.html");
        }
        else if (data==7){
            browser.loadUrl("file:///android_asset/Persons/8.html");
        }
        else if (data==8){
            browser.loadUrl("file:///android_asset/Persons/9.html");
        }
        else if (data==9){
            browser.loadUrl("file:///android_asset/Persons/10.html");
        }
        else if (data==10){
            browser.loadUrl("file:///android_asset/Persons/11.html");
        }
        else if (data==11){
            browser.loadUrl("file:///android_asset/Persons/12.html");
        }
    }
}

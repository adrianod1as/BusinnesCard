package com.example.adrianodiasx93.businnescard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView linkedlin;
    private TextView github;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkedlin = (TextView) findViewById(R.id.textView4);

       /* webview.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                String url2="http://www.playbuzz.org/";
                // all links  with in ur site will be open inside the webview
                //links that start ur domain example(http://www.example.com/)
                if (url != null && url.startsWith(url2)){
                    return false;
                }
                // all links that points outside the site will be open in a normal android browser
                else  {
                    view.getContext().startActivity(
                            new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                }
            }
        });

*/
        linkedlin.setText(Html.fromHtml("<a href=\"https://www.linkedin.com/in/adriano-dias-b01484b0\">Linkedlin</a>"));
        linkedlin.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());

        github = (TextView) findViewById(R.id.textView5);
        github.setText(Html.fromHtml("<a href=\"https://github.com/adrianodiasx93\">GitHub</a>"));
        github.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());


    }
}

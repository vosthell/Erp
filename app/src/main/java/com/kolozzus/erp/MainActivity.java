package com.kolozzus.erp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.wv_web);
        /*CON ESTA LINEA LOS CLICKS SE ABRIRAN DENTRO DEL WEBVIEW*/
        wv.setWebViewClient(new WebViewClient());
        //HABILITAR JAVASCRIPT
        wv.getSettings().setJavaScriptEnabled(true);
        //HABILITAR ZOOM
        wv.getSettings().setBuiltInZoomControls(true);
        //wv.loadUrl("file:///android_asset/www/index.html");
        wv.loadUrl("http://servicios.comisiontransito.gob.ec/koloxus");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

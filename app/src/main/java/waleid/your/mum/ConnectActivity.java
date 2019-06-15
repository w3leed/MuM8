package waleid.your.mum;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class ConnectActivity extends AppCompatActivity {
    TextView ibrahimFace,waleedFace,ibrahimMobile,waleedMoble;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        webView =(WebView)findViewById(R.id.webview);
        ibrahimFace=(TextView)findViewById(R.id.ibrahimFace);
        ibrahimFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl("");
            }
        });
        waleedFace=(TextView)findViewById(R.id.WaleedFace);
        waleedFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl("https://www.facebook.com/new.human.359");
            }
        });
        ibrahimMobile=(TextView)findViewById(R.id.ibrahimMobile);
        ibrahimMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:01126336946"));
                Intent intent1 = Intent.createChooser(intent, "Make Call");
                startActivity(intent1);
            }
        });
        waleedMoble=(TextView)findViewById(R.id.WaleedMobile);
        waleedMoble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:01126336946"));
                Intent intent1 = Intent.createChooser(intent, "Make Call");
                startActivity(intent1);
            }
        });
    }
}

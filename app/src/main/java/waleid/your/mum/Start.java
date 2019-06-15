package waleid.your.mum;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by AWYEL on 10/13/2018.
 */

public class Start extends AppCompatActivity implements View.OnClickListener {
   ImageButton butto1, bTN_admin, help, connect;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        butto1 = (ImageButton) findViewById(R.id.butto1);

        connect = (ImageButton) findViewById(R.id.connect);
        help = (ImageButton) findViewById(R.id.help);
       // mAdView= (AdView) findViewById(R.id.adView);
      //  bTN_admin.setOnClickListener(this);
    help.setOnClickListener(this);
        butto1.setOnClickListener(this);
        connect.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        if (v == butto1) {

            Intent intent = new Intent(Start.this,LoginActivity.class);
            startActivity(intent);
        }

        if (v == help) {

            // Use bounce interpolator with amplitude 0.2 and frequency 20

            Intent intent = new Intent(Start.this, HelpActivity.class);
            startActivity(intent);
        }

        if (v == connect) {


            Intent intent = new Intent(Start.this, ConnectActivity.class);
            startActivity(intent);
        }
        /*if (v == adView) {
            final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
            // Use bounce interpolator with amplitude 0.2 and frequency 20
            AdView adView = new AdView(this);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId("ca-app-pub-7457764619873732~9582865535");
        }*/

    }
}


package pbru_ice.pramrudeevajasen.ice_59;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static pbru_ice.pramrudeevajasen.ice_59.R.id.g4;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView comImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bind widget
        bindwidget();
        //show View
        showView();

    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.a1);
        int intIndex = getIntent().getIntExtra("Index",0);

        titleTextView.setText(strTitle);
        comImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.com_detail);
        detailTextView.setText(strDetail[intIndex]);

    }//show view

    private void bindwidget() {
        titleTextView = (TextView) findViewById(R.id.g4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        comImageView = (ImageView) findViewById(R.id.imageView2);

    }//bind widget.
}

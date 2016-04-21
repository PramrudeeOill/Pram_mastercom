package pbru_ice.pramrudeevajasen.ice_59;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    //explicit
    private Button aboutmeButton;
    private ListView title_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind Widget
        bindWidget();
        buttoncontroller();
        creatListview();

    }


    private void bindWidget() {
        aboutmeButton = (Button) findViewById(R.id.button);
        title_list = (ListView) findViewById(R.id.listView);
    }//bindWidget


    private void creatListview() {
        final int[] intIcon = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,
                R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13,
                R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20};
        final String[] titleStrings = new String[20];
        titleStrings[0] = "AGP Slot (Accelerator Graphic Port)";
        titleStrings[1] = "ATX Power Connector";
        titleStrings[2] = "BIOS (Basic Input Output )";
        titleStrings[3] = "CASE";
        titleStrings[4] = "CMOS Battery";
        titleStrings[5] = "Microprocessor / CPU (Central Processing Unit)";
        titleStrings[6] = "Display Card";
        titleStrings[7] = "Floppy Disk Connector";
        titleStrings[8] = "Heatsink + FAN";
        titleStrings[9] = "IDE Connector";
        titleStrings[10] = "Keyboard";
        titleStrings[11] = "Line in - Line out - Microphone Jack";
        titleStrings[12] = "Monitor";
        titleStrings[13] = "Mouse";
        titleStrings[14] = "Parallel Port";
        titleStrings[15] = "RAM (Random Access Memory)";
        titleStrings[16] = "SCANNER";
        titleStrings[17] = "Sound Card";
        titleStrings[18] = "CPU Socket";
        titleStrings[19] = "USB Port (Universal Serial Bus)";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        title_list.setAdapter(myAdapter);



        title_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Img", intIcon[i]);
                intent.putExtra("Index", i);

                startActivity(intent);
            }
        });


    }

    private void buttoncontroller() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/oil.dii.5"));

                startActivity(intent);

            }
        });
    }//button
}




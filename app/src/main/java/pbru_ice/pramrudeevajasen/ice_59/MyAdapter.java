package pbru_ice.pramrudeevajasen.ice_59;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

/**
 * Created by Oiy on 4/6/2016.
 */
public class MyAdapter extends BaseAdapter {
    //ประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private  String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;

    }
    @Override
     public int getCount() {
         return iconInts.length;
     }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public  long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.title_list,viewGroup,false);
        //for icon

        ImageView iconInImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconInImageView.setImageResource(iconInts[i]);
      //for title

        TextView titleTextView = (TextView) view1.findViewById(R.id.g1);
        titleTextView.setText(titleStrings[i]);
        //for default

        TextView detailTextView = (TextView) view1.findViewById(R.id.g2);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }

}


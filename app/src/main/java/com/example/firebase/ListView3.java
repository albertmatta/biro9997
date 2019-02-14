package com.example.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListView3 extends AppCompatActivity {
    int[] Images={R.drawable.bakry,R.drawable.gaber,R.drawable.gabr,R.drawable.elsaid,R.drawable.elshenawy,R.drawable.kino,R.drawable.soliman};
    String[] Names={                 "Kino",                        "Gaber",                 "Gabr",               "Elsaid",               "Elshenawy",              "Soliman",                      "Bakry"                   };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3);

        ListView listView=(ListView)findViewById(R.id.ListView);




    }
    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.row,null);

            return null;
        }
    }

}

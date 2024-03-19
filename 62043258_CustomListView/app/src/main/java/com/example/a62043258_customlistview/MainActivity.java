package com.example.a62043258_customlistview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        list = (ListView ) findViewById(R.id.list);

    list.setAdapter(new CustomListView(getApplicationContext()));


    }

    public  class CustomListView extends BaseAdapter
    {
    public Context mContext;
    public LayoutInflater minflater;

    public  CustomListView(Context context)
    {
        mContext = context;
        minflater = LayoutInflater.from(mContext);
    }
        @Override
        public int getCount() {
            return 20;
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
        public View getView(int position, View view, ViewGroup parent) {
            ViewHolder holder = null;
          if(view == null)
          {
              view = minflater.inflate(R.layout.list_item,null);
              holder = new ViewHolder();
              holder.title = view.findViewById(R.id.topic);
              view.setTag(holder);
          }
          else
          {
              holder = (ViewHolder) view.getTag();
          }
            holder.title.setText(position + 1 + ". EXAPLE TITLE");
          return  view;
        }
    }
    public  class ViewHolder
    {
        TextView title;
    }


}
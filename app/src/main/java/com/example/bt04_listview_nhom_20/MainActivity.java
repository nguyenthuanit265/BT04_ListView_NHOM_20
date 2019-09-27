package com.example.bt04_listview_nhom_20;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    boolean iscolor = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<User> users = new ArrayList<>();

        User user1 = new User("Minh Thuan","1234");
        User user2 = new User("Khanh Hoang","1234");
        User user3 = new User("Trung Tho","1234");
        User user4 = new User("Huu Vinh","1234");
        User user5 = new User("Minh Thuan","1234");
        User user6 = new User("Khanh Hoang","1234");
        User user7 = new User("Trung Tho","1234");
        User user8 = new User("Huu Vinh","1234");
        User user9 = new User("Minh Thuan","1234");
        User user10 = new User("Khanh Hoang","1234");


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);



        Integer[] avatar={R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,
                R.drawable.photo5,R.drawable.photo6,R.drawable.photo7,R.drawable.photo8,R.drawable.photo9,R.drawable.photo10};
        Integer[] icon={R.mipmap.photo4,R.mipmap.photo5,R.mipmap.photo5,R.mipmap.photo4,
                R.mipmap.photo4,R.mipmap.photo5,R.mipmap.photo4,R.mipmap.photo5,R.mipmap.photo4,R.mipmap.photo5};
        final ListView listViewInfor=findViewById(R.id.listViewInfor);
        final TextView txtInfor=findViewById(R.id.txtInfor);
        final CustomListAdapter arrayAdapter= new CustomListAdapter(this,R.layout.layout_item,users,avatar,icon);
        listViewInfor.setAdapter(arrayAdapter);

        listViewInfor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                    //view.setBackgroundColor(Color.YELLOW);
                   // String text="Name: " + users.get(position).getName()+ "\nPhone: " + users.get(position).getPhone();
                    String text= users.get(position).getName();
                    txtInfor.setText(text);

            }




        });

    }
}

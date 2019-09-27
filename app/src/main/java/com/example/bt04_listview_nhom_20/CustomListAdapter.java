package com.example.bt04_listview_nhom_20;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<User> {
    Context context;
    List<User> user;
    Integer[] avatar;
    Integer[] icon;



    public CustomListAdapter(Context context,int layoutToBeInflated ,List<User> user,Integer[] avatar,Integer[] icon) {
        super(context,R.layout.layout_item,user);
        this.context = context;
        this.user=user;
        this.avatar=avatar;
        this.icon=icon;

    }

    @NonNull
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Integer[] getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer[] avatar) {
        this.avatar = avatar;
    }

//    public String[] getName() {
//        return name;
//    }
//
//    public void setItems(String[]name) {
//        this.name= name;
//    }
//
//    public String[] getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String[]phone) {
//        this.phone= phone;
//    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public User getOneUser(int position) {
        return user.get(position);
    }

    public void setOneUser(User user, int position) {
        this.user.get(position).setName(user.getName());
        this.user.get(position).setPhone(user.getPhone());

    }

    public Integer[] getIcon() {
        return icon;
    }

    public void setIcon(Integer[] icon) {
        this.icon = icon;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=((Activity)context).getLayoutInflater();
        View row=layoutInflater.inflate(R.layout.layout_item,null);
        TextView txtName=row.findViewById(R.id.txtName);
        TextView txtPhone=row.findViewById(R.id.txtPhone);
        ImageView imgAvatar=row.findViewById(R.id.imgAvatar);
        ImageView imgIcon=row.findViewById(R.id.imgIcon);

        txtName.setText(user.get(position).getName());
        txtPhone.setText(user.get(position).getPhone());
        imgAvatar.setImageResource(avatar[position]);
        imgIcon.setImageResource(icon[position]);
        parent.setBackgroundColor(Color.TRANSPARENT);
        return row;
    }
}

package com.gmail.ahmedozmaan.diiwaan.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gmail.ahmedozmaan.diiwaan.Users;
import com.gmail.ahmedozmaan.diiwaan.R;

import java.util.List;


/**
 * Created by AhmedOzmaan on 5/28/2016.
 */
public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ThreadHolder>{

    LayoutInflater layoutInflater;
    private List<Users> keydMessages;

    public UsersAdapter(Context mContext, List<Users> messageArrayList){
        layoutInflater = LayoutInflater.from(mContext);
       this.keydMessages = messageArrayList;

    }


    @Override
    public ThreadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.user_row_item, parent, false);
          return new ThreadHolder(view);
    }

    @Override
    public void onBindViewHolder(ThreadHolder holder, int position) {
        Users message = keydMessages.get(position);
            holder.nameTextView.setText(message.getName());
            holder.phoneTextView.setText(message.getPhone());
            holder.conImage.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return keydMessages.size();
    }

    public void update(List<Users> mKeydMessages) {
            keydMessages.clear();
            keydMessages.addAll(mKeydMessages);
            notifyDataSetChanged();
    }

    class ThreadHolder extends RecyclerView.ViewHolder  {
        TextView nameTextView, phoneTextView;
        ImageView conImage;
        CardView cardView;

        public ThreadHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            nameTextView = (TextView) itemView.findViewById(R.id.sms_address);
            phoneTextView = (TextView) itemView.findViewById(R.id.sms_body);
            conImage = (ImageView) itemView.findViewById(R.id.con_image);

        }

    }



}

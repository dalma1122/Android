package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hf7.Contact;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.VH>{
    private Activity context;
    private List<Contact> mContacts;

    public ContactsAdapter(Activity context, List<Contact> mContacts) {
        this.context = context;
        this.mContacts = mContacts;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new VH(itemView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Contact contact = mContacts.get(position);
        holder.img.setImageResource(contact.getmThumbnailDrawable());
        holder.name.setText(contact.getmName());
        holder.text.setText(contact.getmName());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        View rootView;
        ImageView img;
        TextView name;
        TextView text;
        public VH(@NonNull View itemView, Context context) {
            super(itemView);
            rootView = itemView;
            img = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            text = itemView.findViewById(R.id.txt);
        }

    }
}

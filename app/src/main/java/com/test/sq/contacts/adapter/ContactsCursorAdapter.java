package com.test.sq.contacts.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

/**
 * Created by sq on 15-11-27.
 */
public class ContactsCursorAdapter extends CursorAdapter {

    private int mLayout;

    public ContactsCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to) {
        super(context, layout, c);
        mTo = to;
        mOriginalFrom = from;
        findColumns(c, from);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
}

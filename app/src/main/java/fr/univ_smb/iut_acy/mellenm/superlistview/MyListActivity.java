package fr.univ_smb.iut_acy.mellenm.superlistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyListActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = { "Android", "iPhone", "Windows Phone", "Ubuntu", "Windows", "Mac OS X" };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.rowlayout, R.id.label, values);
        this.setListAdapter(adapter);
    }
}
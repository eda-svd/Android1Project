package android1.android1project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android1.android1project.Parcel;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static org.xmlpull.v1.XmlPullParser.TEXT;


public class Fragment1 extends ListFragment {
    Parcel currentParcel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list,container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        currentParcel=new Parcel(position);
        String s = "text";

        Toast.makeText(getContext(),String.valueOf(currentParcel.getPosition()),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(getActivity(),WeatherActivity.class);
        intent.putExtra("city2",currentParcel.getPosition());
        startActivity(intent);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.cities,android.R.layout.simple_list_item_activated_1);
        setListAdapter(adapter);
    }
}

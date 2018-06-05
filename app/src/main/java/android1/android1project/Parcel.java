package android1.android1project;

import java.io.Serializable;

public class Parcel implements Serializable{
    int position;

    public Parcel(int position){
        this.position = position;
    }

    public int getPosition() {
        return position;
    }


}

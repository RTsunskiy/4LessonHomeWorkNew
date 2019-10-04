package com.example.a4lessonhomework;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


@SuppressLint("ParcelCreator")
public class TestModel implements Parcelable {

    private String string1;
    private String string2;
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    protected TestModel(String string1, String string2, List<Integer> list1, List<Integer> list2) {
        this.string1 = string1;
        this.string2 = string2;
        this.list1 = list1;
        this.list2 = list2;
    }

    public static final Creator<TestModel> CREATOR = new Creator<TestModel>() {
        @Override
        public TestModel createFromParcel(Parcel in) {
            return new TestModel(in);
        }

        @Override
        public TestModel[] newArray(int size) {
            return new TestModel[size];
        }
    };

    public TestModel(Parcel in) {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public void setList1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void setList2(ArrayList<Integer> list2) {
        this.list2 = list2;
    }
}

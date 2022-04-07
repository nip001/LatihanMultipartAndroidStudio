package com.example.androidkeretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Peserta implements Parcelable {
    private long id;
    private String nama;
    private String umur;
    private String gambar;

    public Peserta(long id, String nama, String umur, String gambar) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.gambar = gambar;
    }

    public Peserta() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.nama);
        dest.writeString(this.umur);
        dest.writeString(this.gambar);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readLong();
        this.nama = source.readString();
        this.umur = source.readString();
        this.gambar = source.readString();
    }

    protected Peserta(Parcel in) {
        this.id = in.readLong();
        this.nama = in.readString();
        this.umur = in.readString();
        this.gambar = in.readString();
    }

    public static final Parcelable.Creator<Peserta> CREATOR = new Parcelable.Creator<Peserta>() {
        @Override
        public Peserta createFromParcel(Parcel source) {
            return new Peserta(source);
        }

        @Override
        public Peserta[] newArray(int size) {
            return new Peserta[size];
        }
    };
}

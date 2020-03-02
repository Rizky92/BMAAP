package com.rizky92.dicodingsubmissionv2.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Hape implements Parcelable {
    private String nama;
    private String announced;
    private String status;
    private String network;
    private String dimensions;
    private String weight;
    private String build;
    private String sim;
    private String type;
    private String size;
    private String res;
    private String os;
    private String chipset;
    private String cpu;
    private String gpu;
    private String ram;
    private String internal;
    private String external;
    private String rearCam;
    private String rearFeat;
    private String rearVideo;
    private String frontCam;
    private String frontFeat;
    private String frontVideo;
    private String speaker;
    private String jack;
    private String wlan;
    private String bluetooth;
    private String radio;
    private String usb;
    private String sensors;
    private String battery;
    private String price;
    private Integer foto;
    private Integer id;

    Hape() {

    }

    private Hape(Parcel in) {
        nama = in.readString();
        announced = in.readString();
        status = in.readString();
        network = in.readString();
        dimensions = in.readString();
        weight = in.readString();
        build = in.readString();
        sim = in.readString();
        type = in.readString();
        size = in.readString();
        res = in.readString();
        os = in.readString();
        chipset = in.readString();
        cpu = in.readString();
        gpu = in.readString();
        ram = in.readString();
        internal = in.readString();
        external = in.readString();
        rearCam = in.readString();
        rearFeat = in.readString();
        rearVideo = in.readString();
        frontCam = in.readString();
        frontFeat = in.readString();
        frontVideo = in.readString();
        speaker = in.readString();
        jack = in.readString();
        wlan = in.readString();
        bluetooth = in.readString();
        radio = in.readString();
        usb = in.readString();
        sensors = in.readString();
        battery = in.readString();
        price = in.readString();
        if (in.readByte() == 0) {
            foto = null;
        } else {
            foto = in.readInt();
        }
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(announced);
        dest.writeString(status);
        dest.writeString(network);
        dest.writeString(dimensions);
        dest.writeString(weight);
        dest.writeString(build);
        dest.writeString(sim);
        dest.writeString(type);
        dest.writeString(size);
        dest.writeString(res);
        dest.writeString(os);
        dest.writeString(chipset);
        dest.writeString(cpu);
        dest.writeString(gpu);
        dest.writeString(ram);
        dest.writeString(internal);
        dest.writeString(external);
        dest.writeString(rearCam);
        dest.writeString(rearFeat);
        dest.writeString(rearVideo);
        dest.writeString(frontCam);
        dest.writeString(frontFeat);
        dest.writeString(frontVideo);
        dest.writeString(speaker);
        dest.writeString(jack);
        dest.writeString(wlan);
        dest.writeString(bluetooth);
        dest.writeString(radio);
        dest.writeString(usb);
        dest.writeString(sensors);
        dest.writeString(battery);
        dest.writeString(price);
        if (foto == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(foto);
        }
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Hape> CREATOR = new Creator<Hape>() {
        @Override
        public Hape createFromParcel(Parcel in) {
            return new Hape(in);
        }

        @Override
        public Hape[] newArray(int size) {
            return new Hape[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getExternal() {
        return external;
    }

    public void setExternal(String external) {
        this.external = external;
    }

    public String getRearCam() {
        return rearCam;
    }

    public void setRearCam(String rearCam) {
        this.rearCam = rearCam;
    }

    public String getRearFeat() {
        return rearFeat;
    }

    public void setRearFeat(String rearFeat) {
        this.rearFeat = rearFeat;
    }

    public String getRearVideo() {
        return rearVideo;
    }

    public void setRearVideo(String rearVideo) {
        this.rearVideo = rearVideo;
    }

    public String getFrontCam() {
        return frontCam;
    }

    public void setFrontCam(String frontCam) {
        this.frontCam = frontCam;
    }

    public String getFrontFeat() {
        return frontFeat;
    }

    public void setFrontFeat(String frontFeat) {
        this.frontFeat = frontFeat;
    }

    public String getFrontVideo() {
        return frontVideo;
    }

    public void setFrontVideo(String frontVideo) {
        this.frontVideo = frontVideo;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getJack() {
        return jack;
    }

    public void setJack(String jack) {
        this.jack = jack;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

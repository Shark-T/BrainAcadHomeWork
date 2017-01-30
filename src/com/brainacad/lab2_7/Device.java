package com.brainacad.lab2_7;

import java.util.Objects;

/**
 * Created by SHARK on 25.01.2017.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;



    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
class Monitor extends Device{
    private int resolutionX;
    private int getResolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" + "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "resolutionX=" + resolutionX +
                ", getResolutionY=" + getResolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return getResolutionY == monitor.getResolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + getResolutionY;
        return result;
    }
}
class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" + "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + getMac().hashCode();
        return result;
    }
}
class Main{
    public static void main(String[] args) {
        Device [] devices = new Device[3];
        Monitor monitor = new Monitor();
        monitor.setGetResolutionY(1024);
        monitor.setResolutionX(768);
        monitor.setManufacturer("IBM");
        monitor.setPrice(125.5f);
        monitor.setSerialNumber("qwerty");
        devices[0] = monitor;
        monitor = new Monitor();
        monitor.setGetResolutionY(800);
        monitor.setResolutionX(600);
        monitor.setManufacturer("IBM");
        monitor.setPrice(100.5f);
        monitor.setSerialNumber("ytrewq");
        devices[1] = monitor;
        EthernetAdapter ethernetAdapter = new EthernetAdapter();
        ethernetAdapter.setManufacturer("Cisco");
        ethernetAdapter.setSerialNumber("asdfghjkl");
        ethernetAdapter.setPrice(28.8f);
        ethernetAdapter.setMac("q1w2w3e3e4r5t6y7u8");
        ethernetAdapter.setSpeed(100);
        devices[2] = ethernetAdapter;
        for (Device device : devices){
            System.out.println(device);
        }
    }


}
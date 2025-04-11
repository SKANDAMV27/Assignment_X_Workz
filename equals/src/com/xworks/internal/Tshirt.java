package com.xworks.internal;

public class Tshirt {
    private String brand;
    private int price;
    private int size;
    private boolean avaliable;

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Tshirt)
            {
                System.out.println("ref is Tshirt we compare..");
                Tshirt tshirt1 = this;
                Tshirt tshirt2 =(Tshirt) obj;
                if(tshirt2.brand==tshirt1.brand && tshirt2.price==tshirt1.price && tshirt2.size==tshirt2.size && tshirt1.avaliable==tshirt2.avaliable)
                {
                    System.out.println("Both are Same");
                    return true;
                }
            }

        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}

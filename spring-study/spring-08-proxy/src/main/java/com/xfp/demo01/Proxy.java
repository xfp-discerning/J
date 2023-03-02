package com.xfp.demo01;

//代理角色要代理房东，给租客租房子
public class Proxy implements Rent{
    private LandLord landLord;

    @Override
    public void Rent() {
        landLord.Rent();
        seeHouse();
    }

    public Proxy(LandLord landLord) {
        this.landLord = landLord;
    }
    public void seeHouse(){
        System.out.println("看房子");
    }
}

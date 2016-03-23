package com.kzhang.coolweather.model;

/**
 * Created by ZK on 2016/3/23.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = this.id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }

}

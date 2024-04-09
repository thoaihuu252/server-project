package com.itboy.DACNPM.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAddress;
    private long idUser;
    private String detailAddress;
    private String commune;
    private String district;
    private String province;

    public Address(long idAddress, long idUser, String detailAddress, String commune, String district, String province) {
        this.idAddress = idAddress;
        this.idUser = idUser;
        this.detailAddress = detailAddress;
        this.commune = commune;
        this.district = district;
        this.province = province;
    }

    public Address() {

    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

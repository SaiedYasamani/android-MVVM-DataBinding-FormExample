package com.alimuzaffar.testproject.ui.main;

import java.util.List;

public class RequestDTO {

    List<String> reasons;
    String description;
    List<String> poses;
    String address;

    public RequestDTO(List<String> reasons, String description, List<String> poses, String address) {
        this.reasons = reasons;
        this.description = description;
        this.poses = poses;
        this.address = address;
    }

    public RequestDTO() {
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPoses() {
        return poses;
    }

    public void setPoses(List<String> poses) {
        this.poses = poses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

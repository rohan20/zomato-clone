package com.rohantaneja.zomatoclone.model.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class RInfo {

    @SerializedName("res_id")
    private Long resId;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }
}

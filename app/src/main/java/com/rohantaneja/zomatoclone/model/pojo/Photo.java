package com.rohantaneja.zomatoclone.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rohantaneja on 04/04/18.
 */

class Photo {
    @SerializedName("photo")
    @Expose
    private PhotoDetails photo;

    public PhotoDetails getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoDetails photo) {
        this.photo = photo;
    }
}

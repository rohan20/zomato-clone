package com.rohantaneja.zomatoclone.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class Event {

    @SerializedName("event_id")
    @Expose
    private Long eventId;
    @SerializedName("friendly_start_date")
    @Expose
    private String friendlyStartDate;
    @SerializedName("friendly_end_date")
    @Expose
    private String friendlyEndDate;
    @SerializedName("friendly_timing_str")
    @Expose
    private String friendlyTimingStr;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("is_active")
    @Expose
    private Long isActive;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("restaurants")
    @Expose
    private List<Object> restaurants = null;
    @SerializedName("is_valid")
    @Expose
    private Long isValid;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("show_share_url")
    @Expose
    private Long showShareUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("display_time")
    @Expose
    private String displayTime;
    @SerializedName("display_date")
    @Expose
    private String displayDate;
    @SerializedName("is_end_time_set")
    @Expose
    private Long isEndTimeSet;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;
    @SerializedName("event_category")
    @Expose
    private Long eventCategory;
    @SerializedName("event_category_name")
    @Expose
    private String eventCategoryName;
    @SerializedName("book_link")
    @Expose
    private String bookLink;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getFriendlyStartDate() {
        return friendlyStartDate;
    }

    public void setFriendlyStartDate(String friendlyStartDate) {
        this.friendlyStartDate = friendlyStartDate;
    }

    public String getFriendlyEndDate() {
        return friendlyEndDate;
    }

    public void setFriendlyEndDate(String friendlyEndDate) {
        this.friendlyEndDate = friendlyEndDate;
    }

    public String getFriendlyTimingStr() {
        return friendlyTimingStr;
    }

    public void setFriendlyTimingStr(String friendlyTimingStr) {
        this.friendlyTimingStr = friendlyTimingStr;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Long getIsActive() {
        return isActive;
    }

    public void setIsActive(Long isActive) {
        this.isActive = isActive;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Object> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Object> restaurants) {
        this.restaurants = restaurants;
    }

    public Long getIsValid() {
        return isValid;
    }

    public void setIsValid(Long isValid) {
        this.isValid = isValid;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Long getShowShareUrl() {
        return showShareUrl;
    }

    public void setShowShareUrl(Long showShareUrl) {
        this.showShareUrl = showShareUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    public Long getIsEndTimeSet() {
        return isEndTimeSet;
    }

    public void setIsEndTimeSet(Long isEndTimeSet) {
        this.isEndTimeSet = isEndTimeSet;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Long getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(Long eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventCategoryName() {
        return eventCategoryName;
    }

    public void setEventCategoryName(String eventCategoryName) {
        this.eventCategoryName = eventCategoryName;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }
}

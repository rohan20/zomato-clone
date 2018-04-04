package com.rohantaneja.zomatoclone.model.pojo;

import android.location.Location;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rohantaneja on 04/04/18.
 */

public class Restaurant {

    @SerializedName("R")
    private RInfo r;
    @SerializedName("apikey")
    private String apikey;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("location")
    private Location location;
    @SerializedName("switch_to_order_menu")
    private Long switchToOrderMenu;
    @SerializedName("cuisines")
    private String cuisines;
    @SerializedName("average_cost_for_two")
    private Long averageCostForTwo;
    @SerializedName("price_range")
    private Long priceRange;
    @SerializedName("currency")
    private String currency;
    @SerializedName("offers")
    private List<Object> offers = null;
    @SerializedName("thumb")
    private String thumb;
    @SerializedName("user_rating")
    private UserRating userRating;
    @SerializedName("photos_url")
    private String photosUrl;
    @SerializedName("menu_url")
    private String menuUrl;
    @SerializedName("featured_image")
    private String featuredImage;
    @SerializedName("has_online_delivery")
    private Long hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    private Long isDeliveringNow;
    @SerializedName("deeplink")
    private String deeplink;
    @SerializedName("has_table_booking")
    private Long hasTableBooking;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("establishment_types")
    private List<Object> establishmentTypes = null;
    @SerializedName("zomato_events")
    private List<ZomatoEvent> zomatoEvents = null;
    @SerializedName("order_url")
    private String orderUrl;
    @SerializedName("order_deeplink")
    private String orderDeeplink;
    @SerializedName("book_url")
    private String bookUrl;

    public RInfo getR() {
        return r;
    }

    public void setR(RInfo r) {
        this.r = r;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    public void setSwitchToOrderMenu(Long switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public Long getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(Long averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public Long getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Long priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public UserRating getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Long getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(Long hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public Long getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(Long isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public Long getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(Long hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
    }

    public List<ZomatoEvent> getZomatoEvents() {
        return zomatoEvents;
    }

    public void setZomatoEvents(List<ZomatoEvent> zomatoEvents) {
        this.zomatoEvents = zomatoEvents;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getOrderDeeplink() {
        return orderDeeplink;
    }

    public void setOrderDeeplink(String orderDeeplink) {
        this.orderDeeplink = orderDeeplink;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }
}

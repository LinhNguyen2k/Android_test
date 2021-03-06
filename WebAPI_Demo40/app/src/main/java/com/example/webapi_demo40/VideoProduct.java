package com.example.webapi_demo40;

public class VideoProduct {
    private int id;
    private int publisher_id;
    private int content_type;
    private int tab;

    public VideoProduct(int id, int publisher_id, int content_type, int tab, String title, String avt) {
        this.id = id;
        this.publisher_id = publisher_id;
        this.content_type = content_type;
        this.tab = tab;
        this.title = title;
        this.avt = avt;
    }

    private String title;
    private String avt;

    @Override
    public String toString() {
        return "VideoProduct{" +
                "id=" + id +
                ", publisher_id=" + publisher_id +
                ", content_type=" + content_type +
                ", tab=" + tab +
                ", title='" + title + '\'' +
                ", avt='" + avt + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getContent_type() {
        return content_type;
    }

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }
}

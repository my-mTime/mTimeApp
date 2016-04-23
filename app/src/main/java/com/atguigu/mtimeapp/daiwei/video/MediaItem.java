package com.atguigu.mtimeapp.daiwei.video;

import java.io.Serializable;

/**
 * 作者：杨光福 on 2016/3/11 14:58
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：可以代表一个视频和音频
 */
public class MediaItem implements Serializable {

    private String name;//videoTitle

    private long duration;//毫秒

    private long size;//byte

    private String data;//url

    private String imageUrl;//coverImg

    private String desc;//movieName

    private String artist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", size=" + size +
                ", data='" + data + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", desc='" + desc + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
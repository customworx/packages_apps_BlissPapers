
package com.death2all110.blisspapers;

public class Wallpaper {

    String name;
    String author;
    String url;
    String thumbUrl;
    String date;

    public static int wallpapersCreated = 0;
    final int localIndex;

    public Wallpaper() {
        localIndex = wallpapersCreated++ +1;
    }

    public String getName() {
        if (name == null || name.isEmpty())
            return "Wallpaper #" + localIndex;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

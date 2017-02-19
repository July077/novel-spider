package com.suny.entites;

import java.io.Serializable;


/**
 * 孙建荣
 * 2017/02/19 10:36
 */
public class Chapter implements Serializable {

    private String title;
    private String url;

    public Chapter() {
    }

    public Chapter(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chapter chapter = (Chapter) o;

        if (title != null ? !title.equals(chapter.title) : chapter.title != null) return false;
        if (url != null ? !url.equals(chapter.url) : chapter.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}

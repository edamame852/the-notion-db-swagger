// This model is what the database looks like after postman

package com.edamame.notion.notion.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * object: "list"
 *  results: ["object, "id", "created_time", "last_edited_time", "cover", "icon", "archived", "url", "properties....]
 *  next_cursor: "string" | null
 *  has_more: false 
 */

public class Database {
    private String object;

    @JsonProperty
    private List<Page> pages = new ArrayList<>();

    @JsonProperty("next_cursor")
    private Boolean nextCursor;

    @JsonProperty("has_more")
    private Boolean hasMore;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Boolean getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(Boolean nextCursor) {
        this.nextCursor = nextCursor;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public String toString() {
        return "Database{" +
                "object='" + object + '\'' +
                ", pages=" + pages +
                ", nextCursor=" + nextCursor +
                ", hasMore=" + hasMore +
                '}';
    }

}

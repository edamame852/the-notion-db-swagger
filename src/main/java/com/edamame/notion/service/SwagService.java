package com.edamame.notion.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.edamame.notion.model.Swag;
import com.edamame.notion.notion.model.Page;

@Service
public class SwagService {

    public static Swag mapPageToTalk(Page page) {
        return new Swag(
                page.getId(),
                page.getProperties().get("Title").get("title").get(0).get("text").get("content").asText(),
                LocalDateTime.parse(page.getProperties().get("StartDate").get("date").get("start").asText(),
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                LocalDateTime.parse(page.getProperties().get("EndDate").get("date").get("start").asText(),
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                page.getProperties().get("URL").get("url").asText(),
                page.getProperties().get("Recording").get("url").asText());
    }

}
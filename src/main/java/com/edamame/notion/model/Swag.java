package com.edamame.notion.model;

import java.time.LocalDateTime;

// We're matching these to our database entries from notion
public record Swag(String id, String title, LocalDateTime startDate, LocalDateTime endDate, String url,
        String recording) {

}

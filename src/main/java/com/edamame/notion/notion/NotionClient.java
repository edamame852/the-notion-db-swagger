package com.edamame.notion.notion;

import org.springframework.stereotype.Component;

import com.edamame.notion.notion.service.DatabaseService;

// This is mimicking what the javascript is doing

@Component
public class NotionClient {
    // get instance of the database service

    public final DatabaseService databases;

    // Add constructor parameter, to let user to call like cleint.databases.query()
    public NotionClient(DatabaseService databases) {
        this.databases = databases;
    }

}

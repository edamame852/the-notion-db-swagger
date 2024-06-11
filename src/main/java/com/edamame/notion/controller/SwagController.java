package com.edamame.notion.controller;

import org.springframework.web.bind.annotation.RestController;

import com.edamame.notion.model.Swag;
import com.edamame.notion.notion.NotionClient;
import com.edamame.notion.notion.config.NotionConfigProperties;
import com.edamame.notion.notion.model.Page;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")

public class SwagController {

    private final NotionClient client;
    private final NotionConfigProperties notionConfigProperties;

    public SwagController(NotionClient client, NotionConfigProperties notionConfigProperties) {
        this.client = client;
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping("path")
    public List<Swag> finalAll() {
        List<Page> pages = client.databases.query(notionConfigProperties.databaseId());

        return null;
    }

}

// New object: To get the list of Swags back
// 1st thing: need notionClient and with that, we need a construction parameter

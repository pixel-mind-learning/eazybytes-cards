package com.eazybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * Record class to hold contact information for cards. As a data carrier
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "cards")
public class CardsContactInfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
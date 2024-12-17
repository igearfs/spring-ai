package com.igearfs.springai.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieRecommendationRequest {
    @JsonProperty("genre")
    private String genre;

    @JsonProperty("movies")
    private List<String> movies;
}

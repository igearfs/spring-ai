package com.igearfs.springai.controller;


import com.igearfs.springai.service.MovieRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.CollectionUtils.isEmpty;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieRecommendationController {

    private final MovieRecommendationService movieRecommendationService;

    @PostMapping("/recommend")
    public MovieRecommendationResponse recommend(@RequestBody MovieRecommendationRequest request)
    {
        if (request.getGenre() == null || request.getGenre().isEmpty())
        {
            throw new IllegalArgumentException("Parameter genre is mandatory to recommend movies");
        }

        if (!isEmpty(request.getMovies()))
        {
            return new MovieRecommendationResponse(movieRecommendationService.recommend(request.getGenre(), request.getMovies()));
        }

        return new MovieRecommendationResponse(movieRecommendationService.recommend(request.getGenre()));

    }
}

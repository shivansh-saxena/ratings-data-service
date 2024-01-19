package com.shiv.ratingsdataservice.resources;

import com.shiv.ratingsdataservice.models.Rating;
import com.shiv.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId,4);
    }
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId)
    {
        List<Rating> ratingList = Arrays.asList(
                new Rating("mov 1",4),
                new Rating("mov 2",3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingList);
        return userRating;
    }
}

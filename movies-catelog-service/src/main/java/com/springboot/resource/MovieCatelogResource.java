package com.springboot.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.model.CatelogItem;
import com.springboot.model.Movie;
import com.springboot.model.Rating;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatelogItem> getCatelog(String userId) {

		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

			List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("1235", 5), new Rating("1236", 2),
				new Rating("1237", 1));
		
		

		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatelogItem(movie.getName(), "TestDesc", rating.getRating());
		}).collect(Collectors.toList());
		
		
	/*ratings.stream().forEach(rating->{
		  
			  Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			  
		   });*/
		
		
		
		
		  
		  //return Collections.singletonList(new CatelogItem("testName", "TestDesc", 4));
		 

		// get all rated Movie Id
		// for each movie ID, call movie info service and get details
		// put them all together
	}
}

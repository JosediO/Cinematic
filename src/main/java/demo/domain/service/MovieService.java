package demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import demo.domain.entity.MovieEntity;
import demo.domain.gateway.MovieGateway;
import demo.domain.web.controller.dto.MovieDto;


@Service
public class MovieService {

	@Autowired
    private MovieGateway movieGateway;
	
	 public MovieEntity getMovieById(Integer id) {
	        return movieGateway.findById(id);
	    }

	public MovieEntity createMovie(MovieDto movieDto) {
		return movieGateway.createMovie(movieDto);
	}

	public ResponseEntity<Void> deletMovie(Integer id) {
		if (movieGateway.deletMovie(id)) {
	        return ResponseEntity.noContent().build(); // 204 No Content
	    } else {
	        return ResponseEntity.notFound().build(); // 404 Not Found
	    }
	}
}

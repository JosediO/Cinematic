package demo.domain.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import demo.domain.entity.MovieEntity;
import demo.domain.service.MovieService;
import demo.domain.web.controller.dto.MovieDto;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<MovieEntity> getMovieById(@PathVariable Integer id){
		return ResponseEntity.ok(movieService.getMovieById(id));
	}
	
	@PostMapping
	public ResponseEntity<MovieEntity> createMovie(@RequestBody MovieDto movieDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(movieService.createMovie(movieDto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMovie(@PathVariable Integer id) {
	    return movieService.deletMovie(id);
	}
}

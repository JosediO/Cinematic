package demo.resources.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.domain.entity.MovieEntity;
import demo.domain.gateway.MovieGateway;
import demo.domain.web.controller.dto.MovieDto;
import demo.resources.dao.MovieDao;
import demo.resources.database.mysql.MovieRepository;

@Component
public class MovieGatewayImpl implements MovieGateway {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public MovieEntity  findById(Integer id) {
		return toEntity(movieRepository.findById(id).orElse(null));
	}

	@Override
	public MovieEntity createMovie(MovieDto movieDto) {
		MovieDao daoMovie = toDao(movieDto);
		MovieDao savedDaoMovie = movieRepository.save(daoMovie);
		return savedDaoMovie.toEntity();
	}

	@Override
	public Boolean deletMovie(Integer id) {
		 if (movieRepository.existsById(id)) {
		        movieRepository.deleteById(id);
		        return true;
		    }
		    return false;
	}

	private MovieEntity toEntity(MovieDao daoMovie) {
		MovieEntity entity = new MovieEntity();
		entity.setId(daoMovie.getId());
		entity.setName(daoMovie.getName());
		entity.setGender(daoMovie.getGender());
		return entity;
	}

	private MovieDao toDao(MovieDto movieDto) {
		MovieDao daoMovie = new MovieDao();
		daoMovie.setId(movieDto.getId());
		daoMovie.setName(movieDto.getName());
		daoMovie.setGender(movieDto.getGender());
		daoMovie.setCreated_at(LocalDateTime.now()); 
		daoMovie.setUpdated_at(LocalDateTime.now()); 
		return daoMovie;
	}
	

}

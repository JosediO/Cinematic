package demo.domain.gateway;

import demo.domain.entity.MovieEntity;
import demo.domain.web.controller.dto.MovieDto;

public interface MovieGateway  {
	
	public MovieEntity findById(Integer id);
	public MovieEntity createMovie(MovieDto movieDto);
	public Boolean deletMovie(Integer id);
}

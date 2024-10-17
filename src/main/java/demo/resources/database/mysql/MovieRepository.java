package demo.resources.database.mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.resources.dao.MovieDao;

@Repository
public interface MovieRepository extends CrudRepository<MovieDao, Integer> {

	

}

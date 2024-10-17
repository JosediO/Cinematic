package demo.resources.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import demo.domain.entity.MovieEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MovieDao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String gender;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
	
	public MovieEntity toEntity() {
		MovieEntity entity = new MovieEntity();
		entity.setId(id);
		entity.setName(name);
		entity.setGender(gender);
		return entity;
	}
	
}

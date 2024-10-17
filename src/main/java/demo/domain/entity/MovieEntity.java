package demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity{
	
	private Integer id;
	private String name;
	private String gender;
	
	public MovieEntity(String name,String gender) {
		this.name = name;
		this.gender = gender;
	}
	
}

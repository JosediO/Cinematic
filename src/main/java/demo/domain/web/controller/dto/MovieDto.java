package demo.domain.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MovieDto {
	
	private Integer id;
	private String name;
	private String gender;

}

package kodlama.io.programmingLanguages.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponse {

	private int techId;
	private String techName;
	private String langName;
	
}

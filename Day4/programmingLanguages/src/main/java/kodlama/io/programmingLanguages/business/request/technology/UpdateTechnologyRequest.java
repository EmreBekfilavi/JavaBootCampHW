package kodlama.io.programmingLanguages.business.request.technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {

	private int techId;
	private String techName;
	
}

package kodlama.io.programmingLanguages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LanguageId")
	private int id;
	
	@Column(name="Language Name")
	private String name;

}

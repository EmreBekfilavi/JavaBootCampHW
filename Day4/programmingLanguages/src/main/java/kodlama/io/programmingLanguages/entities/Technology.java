package kodlama.io.programmingLanguages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TechId")
	private int id;
	
	@Column(name = "TechnologyName")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="LanguageName")
	private Language language;

}

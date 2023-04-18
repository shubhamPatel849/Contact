package in.ashokit.binding;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="contact")
public class contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;
	private String name;
	private String email;
	private String active_sw;
	
}

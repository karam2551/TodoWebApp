package to.model;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Todo {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer pk;
    
	private String task;

	private Date date;

	private boolean isDone;
}

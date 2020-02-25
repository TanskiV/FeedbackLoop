package feedbackloop.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "date" })
@Entity
@Table(name = "feedbacks")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Feedback implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	@Id
	LocalDate date;
	public Feedback(String message) {
		super();
		this.message = message;
		this.date = LocalDate.now();
	}

}

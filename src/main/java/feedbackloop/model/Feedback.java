package feedbackloop.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = {"date"})
@Entity
@Table(name = "feedbacks")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Feedback implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	LocalDate date;
	
}

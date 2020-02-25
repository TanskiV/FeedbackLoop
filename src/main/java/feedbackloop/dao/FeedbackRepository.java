package feedbackloop.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import feedbackloop.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, LocalDate>{
//	Feedback findByDate(String date);
	Feedback findByMessage(String message);
	List<Feedback> findByDate(LocalDate date);
	
	
}

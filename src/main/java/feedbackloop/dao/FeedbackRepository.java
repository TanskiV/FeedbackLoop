package feedbackloop.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import feedbackloop.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, LocalDate>{
	Feedback findByDate(LocalDate date);
	Feedback findByMessage(String message);
	
}

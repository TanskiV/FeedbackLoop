package feedbackloop.service;

import java.time.LocalDate;

import feedbackloop.dto.FeedbackDto;

public interface FeedbackService {
	boolean addFeedback (FeedbackDto feedbackDto);
	FeedbackDto findByMessage (String message);
	Iterable<FeedbackDto> findByDate (LocalDate date);

}

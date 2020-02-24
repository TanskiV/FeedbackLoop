package feedbackloop.service;

import feedbackloop.dto.FeedbackDto;

public interface FeedbackService {
	boolean addFeedback (FeedbackDto feedbackDto);
	FeedbackDto findByMessage (String message);

}

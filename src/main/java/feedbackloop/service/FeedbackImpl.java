package feedbackloop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feedbackloop.dao.FeedbackRepository;
import feedbackloop.dto.FeedbackDto;
import feedbackloop.model.Feedback;
@Service
public class FeedbackImpl implements FeedbackService {
	
	@Autowired
	FeedbackRepository feedbackRepository;

	@Override
	public boolean addFeedback(FeedbackDto feedbackDto) {
		if (feedbackRepository.existsById(feedbackDto.getDate())) {
			return false;
		}
		Feedback feedback = convertToFeedback(feedbackDto);
		feedbackRepository.save(feedback);
		return true;
	}



	@Override
	public FeedbackDto findByMessage(String message) {
		Feedback feedback = feedbackRepository.findByMessage(message);
		return feedbackToFeedbackDto(feedback) ;
	}
	




	private FeedbackDto feedbackToFeedbackDto(Feedback feedback) {
		return new FeedbackDto(feedback.getMessage(), feedback.getDate());
	}



	private Feedback convertToFeedback(FeedbackDto feedbackDto) {
		Feedback feedback = new Feedback(feedbackDto.getMessage(), feedbackDto.getDate());
		return feedback;
	}

}

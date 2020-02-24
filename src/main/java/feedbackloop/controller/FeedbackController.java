package feedbackloop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feedbackloop.dto.FeedbackDto;
import feedbackloop.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	
	@PostMapping
	public boolean addFeedback(@RequestBody FeedbackDto feedbackDto) {
		return feedbackService.addFeedback(feedbackDto);
	}
	
	@GetMapping("/{message}")
	public FeedbackDto findMessage(@PathVariable String messaString) {
		return feedbackService.findByMessage(messaString);
	}

}

package feedbackloop.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
//							include = JsonTypeInfo.As.PROPERTY,
//							property = "type")
public class FeedbackDto {
	String message;
	LocalDate date;
}

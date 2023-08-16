package org.zerock.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice //해당 객체가 스프링의 컨트롤러에서 발생하는 예외를 처리하는 존재임을 명시
@Log4j
public class CommonExceptionAdvice {

	@ExceptionHandler(Exception.class) //해당 메서드가 () 들어가는 예외 타입을 처리한다는 것을 의미, Exception 클래스 타입을 지정할 수 있음
	public String except(Exception ex, Model model) {
		
		log.error("Exception jex01...."+ ex.getMessage());
		model.addAttribute("exception", ex);
		log.error(model);
		
		return "error_page";
	}
}

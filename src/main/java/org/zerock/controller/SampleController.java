package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

//@RunWith(SpringJUnit4ClassRunner.class) //src/test/java에서 가능
@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("/exUpload...............");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {

		files.forEach(file ->{
			log.info("-----------------------------");
			log.info("name : " + file.getOriginalFilename());
			log.info("size : " + file.getSize());
		});
	}
	
	//error_page 동작 확인용
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("age") int age) {
		
		log.info("jex01 dto : "+dto);
		log.info("jex01 age : "+age);
		
		return "/sample/ex04";
	}
}

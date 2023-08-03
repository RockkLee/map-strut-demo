package idv.sheng.map_strut_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import idv.sheng.map_strut_demo.service.DateService;
import idv.sheng.map_strut_demo.service.dto.UserDateDto;

@RestController
public class DateController {
	@Autowired
	DateService dateService;
	
	@GetMapping
	public void saveUserDate(@RequestBody UserDateDto userDateDto) {
		dateService.saveUserDate(userDateDto);
	}
}

package idv.sheng.map_strut_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.sheng.map_strut_demo.dao.DateDao;
import idv.sheng.map_strut_demo.entity.UserDate;
import idv.sheng.map_strut_demo.service.dto.UserDateDto;


@Service
public class DateService {
	@Autowired
	DateDao dateDao;
	
	public void saveUserDate(UserDateDto userDateDto) {
		UserDate userDate = UserDateDto.DomainMapper.INSTANCE.toPo(userDateDto);
		System.out.println(userDate);
		dateDao.save(userDate);
	}
}

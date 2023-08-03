package idv.sheng.map_strut_demo.service.dto;

import java.sql.Date;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import idv.sheng.map_strut_demo.entity.UserDate;
import lombok.Data;

@Data
public class UserDateDto {
	private long userId;
	private String strDate;
	
	@Mapper
	public interface DomainMapper {
		DomainMapper INSTANCE = Mappers.getMapper(DomainMapper.class);
		
		//Dto轉PO
		//source: Dto的attribute
		//target: Po的attribute
	    @Mapping(target = "id", source = "userId")	//qualifiedByName: 對應到@Named，兩邊String的名字要一樣
	    @Mapping(target = "date", source = "strDate", qualifiedByName = "strDateToDate")
	    UserDate toPo(UserDateDto source);
	    
	    //@Named: 對應到qualifiedByName，兩邊String的名字要一樣
	    @Named("strDateToDate")
	    public static Date strDateToDate123(String strDate) { //Method的名字可以不用跟qualifiedByName、@Named一樣
	    	System.out.println("HitIt!!!");
	        return Date.valueOf(strDate);
	    }
	}
}

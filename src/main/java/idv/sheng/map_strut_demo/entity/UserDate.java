package idv.sheng.map_strut_demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserDate {
	@Id
	private long id;
	private Date date;
}

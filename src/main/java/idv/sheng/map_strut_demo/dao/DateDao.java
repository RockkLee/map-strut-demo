package idv.sheng.map_strut_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import idv.sheng.map_strut_demo.entity.UserDate;

public interface DateDao extends JpaRepository<UserDate, Long> {
}

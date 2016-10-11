package com.airbnb.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.airbnb.web.domains.Command;
import com.airbnb.web.domains.MemberDTO;
import com.airbnb.web.domains.Retval;
@Repository
public interface MemberMapper {
	public int insert(MemberDTO mem);
	public int update(MemberDTO mem);
	public int delete(MemberDTO mem);
	public List<?> find(Command command);
	public MemberDTO findById(String string);
	public List<?> findByName(String name);
	public Retval count();
	public boolean login(MemberDTO param);
	public int existId(String id);
/*	public MemberDTO findOne(Command command);*/
	public String regist(MemberDTO mem);
	public List<?> list(Command command);
	

}
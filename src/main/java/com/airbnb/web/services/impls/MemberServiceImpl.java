package com.airbnb.web.services.impls;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbnb.web.services.MemberService;
import com.airbnb.web.controllers.MemberController;
import com.airbnb.web.domains.Command;
import com.airbnb.web.domains.MemberDTO;
import com.airbnb.web.domains.Retval;
import com.airbnb.web.mappers.MemberMapper;


/**
 * @date  : 2016. 10. 11.
 * @author: choi inchul
 * @file  : Member.java
 * @story :
 */
@Service
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired	private SqlSession sqlSession;
	@Autowired	private MemberDTO member;
	@Autowired  private Command command ;
	@Autowired  private Retval retval ;


	public void logoutSession(MemberDTO member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		if (member.getId().equals(member.getId()) && member.getPw().equals(member.getPw())) {
			member = null;
		}
	}
	
	

	public List<?> findBy(String keyword) {
		return null;
	}
	
	public String myAccount() {
		return member.toString();
	}
	@Override
	public MemberDTO getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> list(Command command) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.list(command);
	}
	@Override
	public Retval count() {
		 MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.count();
	}

	   @Override
	   public String regist(MemberDTO member) {
	      return (sqlSession.getMapper(MemberMapper.class).insert(member) == -1)?"success":"fail";
	   }
	@Override
	   public String update(MemberDTO member) {
	      MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
	      int result = mapper.update(member);
	      String retval = "";
	      if (result == 1) {
	         retval = "success";
	         System.out.println("서비스 수정결과 성공");
	      } else {
	         retval = "fail";
	         System.out.println("서비스 수정결과 실패");
	      }
	      return retval;
	   }

	@Override
	public void delete(MemberDTO mem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> find (Command command) {
		// TODO Auto-generated method stub
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.find(command);
	}


	@SuppressWarnings("unchecked")
	@Override
	public MemberDTO login(MemberDTO param) {
		logger.info("MemberService login ID = {}",member.getId());
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		command.setKeyword(member.getId());
		command.setOption("mem_id");
		list =(List<MemberDTO>) mapper.find(command);
		String pw = list.get(0).getPw();
		if(pw.equals(param.getPw())){
			logger.info("MemberService login is {}"," SUCCESS ");
			
			return list.get(0);
		}else{
			logger.info("MemberService login is {}"," FAIL ");
			return list.get(0);
		}
	
	}



	@Override
	public MemberDTO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int existId(String id) {
		logger.info("MemberService existId ID = {}",id);
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.existId(id);
	}
	


}
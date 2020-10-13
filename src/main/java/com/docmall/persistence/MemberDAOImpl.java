package com.docmall.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.docmall.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	private final static String NS = "com.docmall.mappers.MemberMapper";
	
	@Autowired
	private SqlSession session;
	
	@Override
	public void join(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		session.insert(NS+".join", vo);
		
	}

}

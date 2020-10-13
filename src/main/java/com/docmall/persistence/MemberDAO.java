package com.docmall.persistence;

import com.docmall.domain.MemberVO;

public interface MemberDAO {

	public void join(MemberVO vo) throws Exception;
}

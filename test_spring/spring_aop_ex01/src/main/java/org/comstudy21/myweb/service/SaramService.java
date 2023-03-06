package org.comstudy21.myweb.service;

import java.util.List;

import org.comstudy21.myweb.model.SaramDTO;

public interface SaramService {

	// SaramDAO 에 있는 method들을 기준으로 Service 인터페이스를 만든다.
	// 우클릭 > Refactor > Extract interface 기능 활용
	List<SaramDTO> selectAll();

	SaramDTO selectOne(SaramDTO dto);

	void insert(SaramDTO dto);

	void update(SaramDTO dto);

	void delete(SaramDTO dto);

}
package dianCan.dao;

import java.util.List;

import dianCan.vo.Detail;

public interface DetailDao {
	
	public List<Detail> listByOrderId(int id);

	public int delete(int id);
}

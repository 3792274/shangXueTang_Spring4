package dianCan.services;

import java.util.List;

import dianCan.vo.Detail;

public interface DetailService {
	
	public List<Detail> listByOrderId(int id);

	public int delete(int orderId, int detailId);
}

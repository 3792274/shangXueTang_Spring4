package dianCan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dianCan.dao.OrderDao;
import dianCan.vo.Order;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public List<Order> list() {
		return orderDao.list();
	}
}

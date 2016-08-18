package dianCan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dianCan.dao.DetailDao;
import dianCan.dao.OrderDao;
import dianCan.vo.Detail;
import dianCan.vo.Order;

@Service("detailService")
public class DetailServiceImpl implements DetailService {
	
	
	@Autowired
	private DetailDao	detailDao;
	
	@Autowired
	private OrderDao	orderDao;

	@Override
	public int delete(int orderId, int detailId) {
		if (detailDao.delete(detailId) > 0) {
			Order order = orderDao.getById(orderId);
			List<Detail> detail = detailDao.listByOrderId(orderId);
			double totalPrice = calcuPrice(detail);
			order.setTotalPrice(totalPrice);
			if (orderDao.update(order) > 0) {
				return 1;
			}
		}
		// throw new Exeption();
		return 0;
	}

	@Override
	public List<Detail> listByOrderId(int id) {
		return detailDao.listByOrderId(id);
	}

	private double calcuPrice(List<Detail> list) {
		double sum = 0;
		for (Detail d : list) {
			sum += d.getMenu().getPrice() * d.getNum();
		}
		return sum;
	}
}

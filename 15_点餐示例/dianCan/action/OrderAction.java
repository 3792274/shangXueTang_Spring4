package dianCan.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dianCan.services.DetailService;
import dianCan.services.OrderService;
import dianCan.vo.Detail;
import dianCan.vo.Order;

@Controller
@Scope("prototype")
public class OrderAction {
	
	private List<Order>		list;
	
	private List<Detail>	details;
	
	private int				orderId;
	private int				detailId;
	
	@Autowired
	private OrderService	orderService;
	
	@Autowired
	private DetailService	detailService;

	// 获取所有订单---getList
	public String list() {
		list = orderService.list();
		return "success";
	}

	// 获取订单详情
	public String detail() {
		details = detailService.listByOrderId(orderId);
		return "success";
	}

	// 删除订单详情中的一项
	public String delete() {
		detailService.delete(orderId, detailId);
		return "success";
	}

	public List<Order> getList() {
		return list;
	}

	public void setList(List<Order> list) {
		this.list = list;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public DetailService getDetailService() {
		return detailService;
	}

	public void setDetailService(DetailService detailService) {
		this.detailService = detailService;
	}

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
}

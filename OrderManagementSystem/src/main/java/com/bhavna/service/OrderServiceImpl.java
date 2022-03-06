package com.bhavna.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.exceptions.MyException;
import com.bhavna.model.Category;
import com.bhavna.model.Orders;
import com.bhavna.repository.OrdersRepo;
import com.bhavna.repository.ProductsRepo;

@Service
public class OrderServiceImpl implements OrderServiceI {
	@Autowired
	OrdersRepo repositary;

	@Autowired
	ProductsRepo itemRepositary;

	Category category = new Category();

	public List<Orders> geAllOrders() {
		return repositary.findAll();
	}

	public String addOrder(Orders order) {
		Integer price = itemRepositary.getById(order.getProduct().getProductId()).getPrice();

		if ((order.getQuantity() <= 0)) {
			throw new MyException();
		} else {
			order.setPrice(order.getQuantity() * price);
			repositary.save(order);
			return "Your order is placed successfully...";
		}
	}

	public Optional<Orders> getOrderById(Integer id) {
		return repositary.findById(id);
	}

	public void deleteOrder(Integer id) {
		if (repositary.existsById(id)) {
			repositary.deleteById(id);
		} else {
			throw new NoSuchElementException();
		}
	}

	public Orders updateOrder(Integer order_id, Orders orders) {
		if (repositary.existsById(order_id)) {
			Integer price = itemRepositary.getById(orders.getProduct().getProductId()).getPrice();
			if ((orders.getQuantity() <= 0)) {
				throw new MyException();
			} else {
				orders.setPrice(orders.getQuantity() * price);
				return repositary.save(orders);
			}

		} else {
			throw new NoSuchElementException();
		}
	}

	public Orders patchOrder(Integer id, Integer item_id, Integer quantity) {
		Orders order = repositary.findById(id).get();
		if (quantity != null)
			order.setQuantity(quantity);
		if (item_id != null)
			order.setProduct(itemRepositary.findById(item_id).get());
		Integer price = itemRepositary.getById(order.getProduct().getProductId()).getPrice();
		order.setPrice(order.getQuantity() * price);
		System.out.println(order);
		return repositary.save(order);
	}

}

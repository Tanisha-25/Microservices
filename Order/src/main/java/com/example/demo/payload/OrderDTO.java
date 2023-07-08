package com.example.demo.payload;

import java.util.List;


import com.example.demo.entity.LineItems;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class OrderDTO {

	@Id
	private int orderId;
	private int customerId;
	private List<LineItems> items;
}

package com.example.demo.payload;



import jakarta.persistence.Id;
import lombok.Data;

@Data
public class lineItemsDTO {

	@Id
	private int itemId;
	private int inventoryId;
	private int quantity;
}

package com.cloudkitchen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FoodDetails {
	@Id
	private Integer foodId;
	private String foodName;
	private String foodDesc;
	private Double foodPrice;
	private String foodImgLoc;
}

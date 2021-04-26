package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "ORDER_DTLS")
@Data
public class OrderDetailsEntity {

	@Id
	@Column(name = "ORDER_ID")
	@GenericGenerator(
			name="order_id_gen",
			strategy="com.ashokit.generators.OrderIdGenerator"
	)
	@GeneratedValue(generator="order_id_gen")
	private String orderId; // OD1 OD2

	@Column(name = "ORDER_BY")
	private String orderBy;

	@Column(name = "ORDER_PLACED_DT")
	private Date orderPlacedDate;

}

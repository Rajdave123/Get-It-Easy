package com.auction.entites;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/* @Author: raj.dave
 * @Creation_date: 10-09-2021
 * @version 1.0.0
 * @Copyright: getiteasy.com
 *
 * */

@Entity // making POJO as persistence class
@Table(name = "order") // defining column name in Table
public class Order { // category class

	@Id // provide that it's primary key of table
	@Column(name = "order_id", nullable = false, length = 512)
	@GeneratedValue(strategy = GenerationType.AUTO) // used for primary key generation
	private long orderId;

	@ManyToOne()
	@Column(name = "buyer_id", nullable = false)
	private long buyerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "order_id")
	private Product product;

	@Column(name = "total_amount", nullable = false)
	private float totalAmount;

	@Column(name = "bidding_time", nullable = false)
	private LocalTime biddingTime;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "order_id")
	private Address address;
}

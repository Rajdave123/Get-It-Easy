package com.auction.entites;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* @Author: raj.dave
 * @Creation_date: 10-09-2021
 * @version 1.0.0
 * @Copyright: getiteasy.com
 *
 * */

@Entity // making POJO as persistence class
@Table(name = "bidder_detail") // defining column name in Table
public class BidderDetails { // category class

	@Id // provide that it's primary key of table
	@Column(name = "bidder_id", nullable = false, length = 512)
	@GeneratedValue(strategy = GenerationType.AUTO) // used for primary key generation
	private long bidderId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "buyer_id", nullable = false, referencedColumnName = )
	private User user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id",nullable = false, referencedColumnName = "bidder_id")
	private Product product;

	@Column(name = "bidding_price", nullable = false)
	private String biddingPrice;

	@Column(name = "bidding_time", nullable = false)
	private LocalTime biddingTime;

	@Column(name = "bidding_date", nullable = false)
	private LocalDate biddingDate;

	@Column(name = "bidding_status", nullable = false)
	private Boolean biddingStatus;

}

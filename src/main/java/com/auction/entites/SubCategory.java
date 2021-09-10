package com.auction.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* @Author: raj.dave
 * @Creation_date: 10-09-2021
 * @version 1.0.0
 * @Copyright: getiteasy.com
 *
 * */

@Entity // making POJO as persistence class
@Table(name="subcategory") //defining column name in Table
public class SubCategory {      // category class

	@Id // provide that it's primary key of table
	@Column(name = "subcategory_id", nullable = false, length = 512)
	@GeneratedValue(strategy = GenerationType.AUTO) // used for primary key generation
	private long categoryId;
	
	@Column(name="type", nullable = false)
	private String subCategoryType;
	
	

}

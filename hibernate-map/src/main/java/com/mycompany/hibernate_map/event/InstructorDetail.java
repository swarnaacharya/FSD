package com.mycompany.hibernate_map.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="instructorDetail")
public class InstructorDetail {
	
	@Id
	@Column(name = "instructorDetailId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instructor_detail_id;
	
	@Column(name="youtube_channels")
	private String youtube_channels;
	
	@Column(name="hobby")
	private String hobby;
	
	

}



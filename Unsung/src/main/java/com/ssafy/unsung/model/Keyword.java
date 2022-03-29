package com.ssafy.unsung.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor // 파라미터가 없는 기본 생성자 생성
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자
@Entity
@Table(name = "News_Analyze")
public class Keyword {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "code")
	private int code;
	
	@Column(name = "keyword", columnDefinition = "varchar(20)")
	private String keyword;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "total_count", columnDefinition = "int unsigned")
	private int total_count;
	
	@Column(name = "negative_count", columnDefinition = "int unsigned default '0'")
	private int negative_count;
	
	@Column(name = "neutral_count", columnDefinition = "int unsigned default '0'")
	private int neutral_count;
	
	@Column(name = "positive_count", columnDefinition = "int unsigned default '0'")
	private int positive_count;
	
	@Column(name = "unclassified_count", columnDefinition = "int unsigned default '0'")
	private int unclassified_count;
}

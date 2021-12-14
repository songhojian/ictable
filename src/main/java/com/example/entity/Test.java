package com.example.entity;



import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

import java.sql.Date;

/**
 * 第一种定义方式，使用@Table和@Column方式定义
 *
 * @author 徐森威
 * @date 2020/12/24
 */
@Data
@Table(name = "test")
public class Test extends BaseModel {

	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
	private Integer	id;
// defaultValue = "hello"
	@Column(name = "name",type = MySqlTypeConstant.INT, length = 11)
	private String	name;

	@Column(name = "auto_name",type = MySqlTypeConstant.INT,length = 45)
	private String	autoName;

	@Column(name = "description",type = MySqlTypeConstant.TEXT)
	private String	description;

	@Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
	private Date	createTime;

	@Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
	private Date	updateTime;

	@Column(name = "number",type = MySqlTypeConstant.BIGINT,length = 5)
	private Long	number;

	@Column(name = "lifecycle",type = MySqlTypeConstant.CHAR,length = 1)
	private String	lifecycle;

	@Column(name = "dekes",type = MySqlTypeConstant.DOUBLE,length = 5,decimalLength = 2)
	private Double	dekes;

}

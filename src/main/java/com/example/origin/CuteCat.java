package com.example.origin;



import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

/**
 * 第一种定义方式，使用@Table和@Column方式定义
 *
 * @author 徐森威
 * @date 2020/12/24
 */
@Data
@Table(name = "cute_cat")
public class CuteCat extends BaseModel {

	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
	private Integer	id;
// defaultValue = "hello"
	@Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 45,defaultValue = "xx")
	private String	name;

	@Column(name = "sex",type = MySqlTypeConstant.VARCHAR,length = 45,defaultValue = "girl")
	private String	sex;


}

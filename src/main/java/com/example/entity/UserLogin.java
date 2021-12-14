package com.example.entity;


import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;

/**
 * 第三种定义方式，懒人定义，按照驼峰规则转换
 * 不需要对每个字段设置@Column
 * 这里没有继承BaseModel，因为BaseModel离有OrderBy等参数，也会对其进行构建字段
 *
 * @author 徐森威
 * @date 2020/12/24
 */

@Table(name = "user_login")
public class UserLogin {

	@IsKey
	@IsAutoIncrement
	private Integer	id;

	private String	name;

	private String	type;

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

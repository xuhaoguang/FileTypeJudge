/**
 * @author Haoguang Xu
 * 
 * Copyright (c) 2016, UCAS
 * All rights reserved. 
 * 
 * TypeCount Class {@link TypeCount}:用于统计各文件类型出现的数目
 */

package com.xhg.filetypejudge;

public class TypeCount {
	String typename; // 文件名称
	int count; // 出现次数

	public TypeCount(String typename, int count) {
		this.typename = typename;
		this.count = count;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

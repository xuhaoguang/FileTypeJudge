/**
 * @author Haoguang Xu
 * 
 * Copyright (c) 2016, UCAS
 * All rights reserved. 
 * 
 * Test Class {@link Test}: 测试类
 */

package com.xhg.filetypejudge;

import java.io.File;

public class Test {
	public static void main(String args[]) throws Exception {

		TypeCount TypeCounts[] = new TypeCount[20]; // 用于统计各个文件类型的数目

		FileType[] fileTypes = FileType.values();

		int k = 0;
		for (FileType type : fileTypes) {
			TypeCounts[k] = new TypeCount(type.name(), 0); // 初始化各种文件类型的数目为0
			k++;
		}

		TypeCounts[19] = new TypeCount("NULL", 0); // 对于无法 判断的文件类型记为"NULL"

		String file_name = "C:/FirstClass/FirstClass/";
		File file = new File(file_name);
		String[] lists = file.list();

		for (int i = 0; i < 1000; i++) {
			String string;
			if (FileTypeJudge.getType(file_name + lists[i]) != null)
				string = FileTypeJudge.getType(file_name + lists[i]).name();
			else
				string = "NULL";

			for (int j = 0; j < TypeCounts.length; j++) {
				if (string.equals(TypeCounts[j].typename)) {
					TypeCounts[j].count++;
					break;
				}
			}
		}

		for (int j = 0; j < TypeCounts.length; j++) {
			System.out.println(TypeCounts[j].typename + "\t"
					+ TypeCounts[j].count);
		}
	}
}

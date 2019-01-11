package com.qut.jike;

import java.io.*;

public class FileOutputDemo{

	public static void main(String[] args) {
		FileOutputStream fos=null;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("请输入内容：");
			String str=sc.nextLine();
			fos.write(str.getBytes());
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			if (fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}

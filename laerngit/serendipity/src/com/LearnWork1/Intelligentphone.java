package com.LearnWork1;

public class Intelligentphone extends Phone implements Ismart{

	
	public Intelligentphone(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void web() {
		System.out.println("已经启动移动网络。。。。");
		
	}

	@Override
	public void video() {
		System.out.println("开始播放视频《小时代》。。。。");
		
	}

	@Override
	public void photo() {
		System.out.println("咔嚓。。。。拍照成功。。。。");
			
		
	}

	@Override
	public void sendPhoto() {
		System.out.println("发送带图片与文字的信息。。。。");
		
	}

	@Override
	public void videoCall() {
		System.out.println("开始视屏通话。。。。。");
		
	}
	
	
}

package com.LearnWork1;

public class Featurephone extends Phone implements Ifeature  {

	
	public Featurephone(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sandmessages() {
		System.out.println("发送文字信息。。。");
		
	}

	@Override
	public void playmusic() {
		System.out.println("开始播放音乐《热雪》。。。。。");
		
	}

	@Override
	public void call() {
		System.out.println("开始语音通话。。。。");
		
	}
	
}
	
	
	
	
	
	
	
	







	

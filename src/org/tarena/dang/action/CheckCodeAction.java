package org.tarena.dang.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;


import com.opensymphony.xwork2.Action;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CheckCodeAction extends BaseAction{
    private InputStream input;
	public InputStream getInput() {
		return input;
	}

	public void setInput(InputStream input) {
		this.input = input;
	}
	private static int WIDTH=200;//��֤��Ŀ��
	private static int HEIGHT=80;//��֤��ĸ߶�
	private static int NUM=5;//��֤��λ��
	
	//��֤���ַ�
	private static char[] seq={'A','B','C','D','E','F','G','H','I','J','K','L'
		,'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2',
		'3','4','5','6','7','8','9'};

	public String execute(){
		byte[] bytes = this.randomImage();
	    this.input=new ByteArrayInputStream(bytes);
		return Action.SUCCESS;
	}
	private byte[] randomImage(){
		Random r = new Random();
		//ͼƬ���ڴ�ӳ��
		BufferedImage image= new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		//��û��ʶ���
		Graphics g=image.getGraphics();
		g.setColor(randomColor(r));
		g.fillRect(0,0,WIDTH,HEIGHT);
		g.setColor(new Color(0,0,0));
		
		//���ڴ洢������ɵ���֤��
		StringBuffer number = new StringBuffer();
		
		//������֤��
		for(int i=0;i<NUM;i++){
			g.setColor(randomColor(r));
			int h=(int)((HEIGHT*60/100)*r.nextDouble()+(HEIGHT*30/100));
			g.setFont(new Font(null,Font.BOLD|Font.ITALIC,h));
			String ch=String.valueOf(seq[r.nextInt(seq.length)]);
			number.append(ch);
			g.drawString(ch, i*WIDTH/NUM*90/100, h);
		}
		session.put("validation",number.toString());
		//���Ƹ�����
		for(int i=0;i<=12;i++){
			g.setColor(randomColor(r));
			g.drawLine(r.nextInt(WIDTH), r.nextInt(HEIGHT), r.nextInt(WIDTH), r.nextInt(HEIGHT));
		}
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(os);
		//��BufferedImage�����е�ͼ����Ϣ�����
		//�򴴽��ö���(encoder)ʱָ������������
		try{
			encoder.encode(image);
			return os.toByteArray();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}
	}
	private Color randomColor(Random r){
		return new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
	}
}


package com.demo.custTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class CubeIt extends BodyTagSupport{
	
	int number;
	public void setNumber(int num){
		number=num;
	}
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter jw = pageContext.getOut();
		
		try {
			jw.println(number*number*number);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
		
		
	}
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		
		
		return SKIP_PAGE;
	}
	
	
	
}

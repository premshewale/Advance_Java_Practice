package com.demo.custTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class TestTag extends BodyTagSupport{

	@Override
	public int doStartTag() throws JspException {
		JspWriter jw =pageContext.getOut();
			
		try {
			jw.println("Inside doStartTag of testTag");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}
	
}

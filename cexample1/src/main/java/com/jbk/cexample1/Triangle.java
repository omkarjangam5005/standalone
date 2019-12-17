package com.jbk.cexample1;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	private  List<Point> points;
	ApplicationContext context=null;
	

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		for (Point point : points) {
			System.out.println("points= ("+point.getX()+","+point.getY());
		}
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}

	public void setBeanName(String beanname) {
		// TODO Auto-generated method stub
		System.out.println("bean name="+beanname);
	}
}

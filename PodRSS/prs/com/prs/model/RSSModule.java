package com.prs.model;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.impl.ObjectBean;
import com.rometools.rome.feed.module.Module;

public class RSSModule extends ObjectBean implements Module{

   
    private static final long serialVersionUID = 1L;
    private String uri;
    
    
    public RSSModule(Class<?> beanClass, Object obj) {
   	super(beanClass, obj);
   	// TODO Auto-generated constructor stub
       }
    
    @Override
    public Class<? extends CopyFrom> getInterface() {
	return Module.class;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	RSSModule module = (RSSModule)(obj);
	this.uri=module.uri;
    }

    @Override
    public String getUri() {
	return this.uri;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
	return null;
	
    }

}

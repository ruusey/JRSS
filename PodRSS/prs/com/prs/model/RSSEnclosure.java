package com.prs.model;

import java.io.Serializable;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.synd.SyndEnclosure;

public class RSSEnclosure implements SyndEnclosure ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String url;
    private long length;
    private String type;
    

    public RSSEnclosure(String url, long length, String type) {
	super();
	this.url = url;
	this.length = length;
	this.type = type;
    }

    @Override
    public Class<? extends CopyFrom> getInterface() {
	return SyndEnclosure.class;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	RSSEnclosure module = (RSSEnclosure)(obj);
	setUrl(module.getUrl());
	setLength(module.getLength());
	setType(module.getType());
	
    }

    @Override
    public String getUrl() {
	return this.url;
    }

    @Override
    public void setUrl(String url) {
	this.url=url;
	
    }
    @Override
    public long getLength() {
	return this.length;
    }

    @Override
    public void setLength(long length) {
	this.length=length;
	
    }

    @Override
    public String getType() {
	return this.type;
    }

    @Override
    public void setType(String type) {
	this.type=type;
	
    }

}

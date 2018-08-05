package com.prs.model;

import com.rometools.rome.feed.synd.SyndLink;

public class RSSLink implements SyndLink{
    private String rel;
    private String type;
    private String href;
    private String title;
    private String hrefLang;
    private long length;
    

    public RSSLink(String rel, String type, String href, String title, String hrefLang, long length) {
	super();
	this.rel = rel;
	this.type = type;
	this.href = href;
	this.title = title;
	this.hrefLang = hrefLang;
	this.length = length;
    }

    @Override
    public String getRel() {
	return this.rel;
    }

    @Override
    public void setRel(String rel) {
	this.rel=rel;
	
    }
    
    @Override
    public String getType() {
	return this.type;
    }

    @Override
    public void setType(String type) {
	this.type=type;
	
    }

    @Override
    public String getHref() {
	return this.href;
    }

    @Override
    public void setHref(String href) {
	this.href=href;
	
    }

    @Override
    public String getTitle() {
	return this.title;
    }

    @Override
    public void setTitle(String title) {
	this.title=title;
	
    }

    @Override
    public String getHreflang() {
	return this.hrefLang;
    }

    @Override
    public void setHreflang(String hrefLang) {
	this.hrefLang=hrefLang;
	
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
    public Object clone() throws CloneNotSupportedException{
	return null;
	
    }

}

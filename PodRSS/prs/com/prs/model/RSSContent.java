package com.prs.model;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.synd.SyndContent;

public class RSSContent implements SyndContent{

    private String type;
    private String mode;
    private String value;
    @Override
    public Class<? extends CopyFrom> getInterface() {
	return SyndContent.class;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	RSSContent content = (RSSContent)obj;
	this.setMode(content.getMode());
	this.setValue(content.getValue());
	this.setType(content.getType());
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
    public String getMode() {
	return this.mode;
    }

    @Override
    public void setMode(String mode) {
	this.mode=mode;
    }

    @Override
    public String getValue() {
	return this.value;
    }

    @Override
    public void setValue(String value) {
	this.value=value;
	
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
	return null;
	
    }

}

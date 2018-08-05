package com.prs.model;

import java.util.ArrayList;
import java.util.List;

import com.rometools.rome.feed.module.Module;
import com.rometools.rome.feed.synd.SyndPerson;

public class RSSPerson implements SyndPerson {
    private List<RSSModule> modules;
    private String name;
    private String uri;
    private String email;

    

    public RSSPerson(List<RSSModule> modules, String name, String uri, String email) {
	super();
	this.modules = modules;
	this.name = name;
	this.uri = uri;
	this.email = email;
    }

    @Override
    public Module getModule(String uri) {
	for(RSSModule m: modules) {
	    if(m.getUri().equals(uri)) {
		return m;
	    }
	}
	return null;
    }

    @Override
    public List<Module> getModules() {
	List<Module> mods = new ArrayList<Module>();
	for(Module m : this.modules) {
	    mods.add(m);
	}
	return mods;
    }

    @Override
    public void setModules(List<Module> modules) {
	List<RSSModule> mods = new ArrayList<RSSModule>();
	for(RSSModule m : this.modules) {
	    mods.add(m);
	}
	this.modules=mods;

    }

    @Override
    public String getName() {
	return this.name;
    }

    @Override
    public void setName(String name) {
	this.name = name;

    }

    @Override
    public String getUri() {
	return this.uri;
    }

    @Override
    public void setUri(String uri) {
	this.uri = uri;

    }

    @Override
    public String getEmail() {
	return this.email;
    }

    @Override
    public void setEmail(String email) {
	this.email = email;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
	return null;

    }

}

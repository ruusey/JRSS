package com.prs.model;

import java.util.Date;
import java.util.List;

import org.jdom2.Element;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.module.Module;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndEnclosure;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndLink;
import com.rometools.rome.feed.synd.SyndPerson;

public class RSSEntry implements SyndEntry{
    private String uri;
    private String title;
    private RSSContent content;
    private RSSContent cTitile;
    private List<RSSLink> links;
    private String link;
    private RSSContent description;
    private List<RSSContent> contents;
    private List<RSSEnclosure> enclosures;
    private Date publishDate;
    private Date updateDate;
    private List<RSSPerson> authors;
    private String author;
    private List<RSSPerson> contributors;
    private List<RSSCategory> categories;
    public RSSEntry() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public Class<? extends CopyFrom> getInterface() {
	return SyndEntry.class;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getUri() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setUri(String uri) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getTitle() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setTitle(String title) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public SyndContent getTitleEx() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setTitleEx(SyndContent title) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getLink() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setLink(String link) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndLink> getLinks() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setLinks(List<SyndLink> links) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public SyndContent getDescription() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setDescription(SyndContent description) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndContent> getContents() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setContents(List<SyndContent> contents) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndEnclosure> getEnclosures() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setEnclosures(List<SyndEnclosure> enclosures) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Date getPublishedDate() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setPublishedDate(Date publishedDate) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Date getUpdatedDate() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndPerson> getAuthors() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setAuthors(List<SyndPerson> authors) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getAuthor() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setAuthor(String author) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndPerson> getContributors() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setContributors(List<SyndPerson> contributors) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<SyndCategory> getCategories() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setCategories(List<SyndCategory> categories) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public SyndFeed getSource() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setSource(SyndFeed source) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Object getWireEntry() {
	return null;
    }

    @Override
    public Module getModule(String uri) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Module> getModules() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setModules(List<Module> modules) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<Element> getForeignMarkup() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setForeignMarkup(List<Element> foreignMarkup) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getComments() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setComments(String comments) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public SyndLink findRelatedLink(String relation) {
	// TODO Auto-generated method stub
	return null;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
	return null;
	
    }

}

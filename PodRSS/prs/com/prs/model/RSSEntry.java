package com.prs.model;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.io.Serializable;
import java.util.ArrayList;
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

public class RSSEntry implements SyndEntry, Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String uri;
    private String title;
    private RSSContent content;
    private RSSContent cTitle;
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

    public RSSEntry(String uri, String title, RSSContent content, RSSContent cTitle, List<RSSLink> links, String link,
	    RSSContent description, List<RSSContent> contents, List<RSSEnclosure> enclosures, Date publishDate,
	    Date updateDate, List<RSSPerson> authors, String author, List<RSSPerson> contributors,
	    List<RSSCategory> categories) {
	super();
	this.uri = uri;
	this.title = title;
	this.content = content;
	this.cTitle = cTitle;
	this.links = links;
	this.link = link;
	this.description = description;
	this.contents = contents;
	this.enclosures = enclosures;
	this.publishDate = publishDate;
	this.updateDate = updateDate;
	this.authors = authors;
	this.author = author;
	this.contributors = contributors;
	this.categories = categories;
    }

    @Override
    public Class<? extends CopyFrom> getInterface() {
	return SyndEntry.class;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	RSSEntry entry = (RSSEntry) (obj);

	this.uri = entry.uri;
	this.title = entry.title;
	this.content = entry.content;
	this.cTitle = entry.cTitle;
	this.links = entry.links;
	this.link = entry.link;
	this.description = entry.description;
	this.contents = entry.contents;
	this.enclosures = entry.enclosures;
	this.publishDate = entry.publishDate;
	this.updateDate = entry.updateDate;
	this.authors = entry.authors;
	this.author = entry.author;
	this.contributors = entry.contributors;
	this.categories = entry.categories;

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
    public String getTitle() {
	return this.title;
    }

    @Override
    public void setTitle(String title) {
	this.title = title;

    }

    @Override
    public SyndContent getTitleEx() {
	return this.cTitle;
    }

    @Override
    public void setTitleEx(SyndContent title) {
	this.cTitle = (RSSContent) title;

    }

    @Override
    public String getLink() {
	return this.link;
    }

    @Override
    public void setLink(String link) {
	this.link = link;

    }

    @Override
    public List<SyndLink> getLinks() {
	List<SyndLink> mods = new ArrayList<SyndLink>();
	for (RSSLink m : this.links) {
	    mods.add(m);
	}
	return mods;

    }

    @Override
    public void setLinks(List<SyndLink> links) {
	List<RSSLink> mods = new ArrayList<RSSLink>();
	for (SyndLink m : links) {
	    mods.add((RSSLink) m);
	}
	this.links = mods;

    }

    @Override
    public SyndContent getDescription() {
	return this.description;
    }

    @Override
    public void setDescription(SyndContent description) {
	this.description = (RSSContent) description;

    }

    @Override
    public List<SyndContent> getContents() {
	List<SyndContent> mods = new ArrayList<SyndContent>();
	for (RSSContent c : this.contents) {
	    mods.add(c);
	}
	return mods;
    }

    @Override
    public void setContents(List<SyndContent> contents) {
	List<RSSContent> mods = new ArrayList<RSSContent>();
	for (SyndContent m : contents) {
	    mods.add((RSSContent) m);
	}
	this.contents = mods;

    }

    @Override
    public List<SyndEnclosure> getEnclosures() {
	List<SyndEnclosure> mods = new ArrayList<SyndEnclosure>();
	for (RSSEnclosure c : this.enclosures) {
	    mods.add(c);
	}
	return mods;
    }

    @Override
    public void setEnclosures(List<SyndEnclosure> enclosures) {
	List<RSSEnclosure> mods = new ArrayList<RSSEnclosure>();
	for (SyndEnclosure m : this.enclosures) {
	    mods.add((RSSEnclosure) m);
	}
	this.enclosures = mods;

    }

    @Override
    public Date getPublishedDate() {
	return this.publishDate;
    }

    @Override
    public void setPublishedDate(Date publishedDate) {
	this.publishDate = publishedDate;

    }

    @Override
    public Date getUpdatedDate() {
	return this.updateDate;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
	this.updateDate = updatedDate;

    }

    @Override
    public List<SyndPerson> getAuthors() {
	List<SyndPerson> mods = new ArrayList<SyndPerson>();
	for (RSSPerson c : this.authors) {
	    mods.add(c);
	}
	return mods;
    }

    @Override
    public void setAuthors(List<SyndPerson> authors) {
	List<RSSPerson> mods = new ArrayList<RSSPerson>();
	for (SyndPerson m : authors) {
	    mods.add((RSSPerson) m);
	}
	this.authors = mods;
    }
    
    @Override
    public String getAuthor() {
	return this.author;
    }

    @Override
    public void setAuthor(String author) {
	this.author = author;

    }

    @Override
    public List<SyndPerson> getContributors() {
	List<SyndPerson> mods = new ArrayList<SyndPerson>();
	for (RSSPerson c : this.contributors) {
	    mods.add(c);
	}
	return mods;
    }

    @Override
    public void setContributors(List<SyndPerson> contributors) {
	List<RSSPerson> mods = new ArrayList<RSSPerson>();
	for (SyndPerson m : authors) {
	    mods.add((RSSPerson) m);
	}
	this.contributors = mods;
    }

    @Override
    public List<SyndCategory> getCategories() {
	List<SyndCategory> mods = new ArrayList<SyndCategory>();
	for (RSSCategory c : this.categories) {
	    mods.add((SyndCategory) c);
	}
	return mods;
    }

    @Override
    public void setCategories(List<SyndCategory> categories) {
	List<RSSCategory> mods = new ArrayList<RSSCategory>();
	for (SyndCategory m : categories) {
	    mods.add((RSSCategory) m);
	}
	this.categories = mods;

    }

    @Override
    public SyndFeed getSource() {
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
	return (Module) getModules();
    }

    @Override
    public List<Module> getModules() {
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
	

    }

    @Override
    public SyndLink findRelatedLink(String relation) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
	return null;

    }

}

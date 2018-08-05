package com.prs.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.jdom2.Element;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prs.util.PRSUtil;
import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.module.Module;
import com.rometools.rome.feed.module.ModuleImpl;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndCategoryImpl;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEnclosure;
import com.rometools.rome.feed.synd.SyndEnclosureImpl;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.feed.synd.SyndImageImpl;
import com.rometools.rome.feed.synd.SyndLink;
import com.rometools.rome.feed.synd.SyndLinkImpl;
import com.rometools.rome.feed.synd.SyndPerson;
import com.rometools.rome.feed.synd.SyndPersonImpl;

public class RSSBuilder {
    public static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final DateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {
	PRSUtil.getClassFields(SyndFeedImpl.class);
    }
   
    public static SyndEntryImpl createPRSEntry(SyndContent title, SyndContent desc,String link, String uri, Date published) {
	SyndEntryImpl entry = new SyndEntryImpl();
	
	  return entry;
    }
    public static SyndFeedImpl createPRSFeed() {
	SyndFeedImpl feed = new SyndFeedImpl();
        return feed;
	
    }
    public static SyndPersonImpl createPRSAuthor() {
	SyndPersonImpl cont = new SyndPersonImpl();
	
	return cont;
    }
    public static SyndContentImpl createPRSContent() {
	SyndContentImpl content = new SyndContentImpl();
	return content;
    }
    public static SyndCategoryImpl creatsPRSCategory(){
	SyndCategoryImpl category = new SyndCategoryImpl();
	return category;
    }
    public static SyndImageImpl createPRSImage() {
	SyndImageImpl img = new SyndImageImpl();
	return img;
    }
    public static SyndEnclosureImpl createPRSEnclosure() {
	SyndEnclosureImpl enc = new SyndEnclosureImpl();
	return enc;
    }
    public static SyndLinkImpl createPRSLink() {
	SyndLinkImpl link = new SyndLinkImpl();
	return link;
    }

   
    
    

}

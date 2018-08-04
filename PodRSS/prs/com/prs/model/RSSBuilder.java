package com.prs.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.jdom2.Element;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.module.Module;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEnclosure;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.feed.synd.SyndLink;
import com.rometools.rome.feed.synd.SyndPerson;

public class RSSBuilder {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final DateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");
  
   
    public static SyndEntryImpl createRssEntry() {
	SyndEntryImpl entry = new SyndEntryImpl();
	  SyndContent description;
	  return entry;
    }
  

   
    
    

}

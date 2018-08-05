package com.prs.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jdom2.Element;

import com.rometools.rome.feed.CopyFrom;
import com.rometools.rome.feed.WireFeed;
import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.impl.CopyFromHelper;
import com.rometools.rome.feed.impl.ObjectBean;
import com.rometools.rome.feed.module.Module;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.feed.synd.SyndImage;
import com.rometools.rome.feed.synd.SyndLink;
import com.rometools.rome.feed.synd.SyndPerson;
import com.rometools.rome.feed.synd.impl.Converters;

public class RSSFeed implements SyndFeed {
    private static final long serialVersionUID = 1L;
    private static final CopyFromHelper COPY_FROM_HELPER = null;
    private final ObjectBean objBean=null;
    private String encoding;
    private String uri;
    private String feedType;
    private String link;
    private String webMaster;
    private String managingEditor;
    private String docs;
    private String generator;
    private String styleSheet;
    private List<SyndLink> links;
    private SyndImage icon;
    private SyndImage image;
    private List<SyndEntry> entries;
    private List<Module> modules;
    private List<SyndPerson> authors;
    private List<SyndPerson> contributors;
    private List<Element> foreignMarkup;

    private WireFeed wireFeed = null;
    private boolean preserveWireFeed = false;

    private static final Converters CONVERTERS = new Converters();

    private static final Set<String> IGNORE_PROPERTIES = new HashSet<String>();
    
    
    public RSSFeed(String encoding, String uri, SyndContent title, SyndContent description, String feedType,
	    String link, String webMaster, String managingEditor, String docs, String generator, String styleSheet,
	    List<SyndLink> links, SyndImage icon, SyndImage image, List<SyndEntry> entries, List<Module> modules,
	    List<SyndPerson> authors, List<SyndPerson> contributors, List<Element> foreignMarkup, WireFeed wireFeed,
	    boolean preserveWireFeed) {
	super();
	this.encoding = encoding;
	this.uri = uri;
	this.feedType = feedType;
	this.link = link;
	this.webMaster = webMaster;
	this.managingEditor = managingEditor;
	this.docs = docs;
	this.generator = generator;
	this.styleSheet = styleSheet;
	this.links = links;
	this.icon = icon;
	this.image = image;
	this.entries = entries;
	this.modules = modules;
	this.authors = authors;
	this.contributors = contributors;
	this.foreignMarkup = foreignMarkup;
	this.wireFeed = wireFeed;
	this.preserveWireFeed = preserveWireFeed;
    }

    public static long getSerialversionuid() {
	return serialVersionUID;
    }

    public static CopyFromHelper getCopyFromHelper() {
	return COPY_FROM_HELPER;
    }

    public ObjectBean getObjBean() {
	return this.objBean;
    }

    public String getEncoding() {
	return this.encoding;
    }

    public String getUri() {
	return this.uri;
    }

    public String getFeedType() {
	return this.feedType;
    }

    public String getLink() {
	return this.link;
    }

    public String getWebMaster() {
	return this.webMaster;
    }

    public String getManagingEditor() {
	return this.managingEditor;
    }

    public String getDocs() {
	return this.docs;
    }

    public String getGenerator() {
	return this.generator;
    }

    public String getStyleSheet() {
	return this.styleSheet;
    }

    public List<SyndLink> getLinks() {
	return this.links;
    }

    public SyndImage getIcon() {
	return this.icon;
    }

    public SyndImage getImage() {
	return this.image;
    }

    public List<SyndEntry> getEntries() {
	return this.entries;
    }

    public List<Module> getModules() {
	return this.modules;
    }

    public List<SyndPerson> getAuthors() {
	return this.authors;
    }

    public List<SyndPerson> getContributors() {
	return this.contributors;
    }

    public List<Element> getForeignMarkup() {
	return this.foreignMarkup;
    }

    public WireFeed getWireFeed() {
	return this.wireFeed;
    }

    public boolean isPreserveWireFeed() {
	return this.preserveWireFeed;
    }

    public static Converters getConverters() {
	return CONVERTERS;
    }

    public static Set<String> getIgnoreProperties() {
	return IGNORE_PROPERTIES;
    }

    public void setEncoding(String encoding) {
	this.encoding = encoding;
    }

    public void setUri(String uri) {
	this.uri = uri;
    }

    public void setTitle(SyndContent title) {
    }

    public void setDescription(SyndContent description) {
    }

    public void setFeedType(String feedType) {
	this.feedType = feedType;
    }

    public void setLink(String link) {
	this.link = link;
    }

    public void setWebMaster(String webMaster) {
	this.webMaster = webMaster;
    }

    public void setManagingEditor(String managingEditor) {
	this.managingEditor = managingEditor;
    }

    public void setDocs(String docs) {
	this.docs = docs;
    }

    public void setGenerator(String generator) {
	this.generator = generator;
    }

    public void setStyleSheet(String styleSheet) {
	this.styleSheet = styleSheet;
    }

    public void setLinks(List<SyndLink> links) {
	this.links = links;
    }

    public void setIcon(SyndImage icon) {
	this.icon = icon;
    }

    public void setImage(SyndImage image) {
	this.image = image;
    }

    public void setEntries(List<SyndEntry> entries) {
	this.entries = entries;
    }

    public void setModules(List<Module> modules) {
	this.modules = modules;
    }

    public void setAuthors(List<SyndPerson> authors) {
	this.authors = authors;
    }

    public void setContributors(List<SyndPerson> contributors) {
	this.contributors = contributors;
    }

    public void setForeignMarkup(List<Element> foreignMarkup) {
	this.foreignMarkup = foreignMarkup;
    }

    public void setWireFeed(WireFeed wireFeed) {
	this.wireFeed = wireFeed;
    }

    public void setPreserveWireFeed(boolean preserveWireFeed) {
	this.preserveWireFeed = preserveWireFeed;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
	return null;

    }

    @Override
    public Class<? extends CopyFrom> getInterface() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void copyFrom(CopyFrom obj) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<String> getSupportedFeedTypes() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public WireFeed createWireFeed() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public WireFeed createWireFeed(String feedType) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public WireFeed originalWireFeed() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean isPreservingWireFeed() {
	// TODO Auto-generated method stub
	return false;
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
    public String getDescription() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setDescription(String description) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public SyndContent getDescriptionEx() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setDescriptionEx(SyndContent description) {
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
    public String getAuthor() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setAuthor(String author) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getCopyright() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setCopyright(String copyright) {
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
    public String getLanguage() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setLanguage(String language) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Module getModule(String uri) {
	// TODO Auto-generated method stub
	return null;
    }

}

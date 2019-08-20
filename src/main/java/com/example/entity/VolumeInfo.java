package com.example.entity;

import java.util.List;

public class VolumeInfo {

	private String title;
	private String subtitle;
	private List<String> authors;
	private String publisher;
	private String publishedDate;
	private String description;
	private List<IndustryIdentifier> industryIdentifiers;
	private ReadingMode readingModes;
	private Long pageCount;
	private String printType;
	private List<String> categories;
	private String maturityRating;
	private Boolean allowAnonLogging;
	private String contentVersion;
	private PanelizationSummary panelizationSummary;
	private ImageLink imageLinks;
	private String language;
	private String previewLink;
	private String infoLink;
	private String canonicalVolumeLink;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<IndustryIdentifier> getIndustryIdentifiers() {
		return industryIdentifiers;
	}
	public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
		this.industryIdentifiers = industryIdentifiers;
	}
	public ReadingMode getReadingModes() {
		return readingModes;
	}
	public void setReadingModes(ReadingMode readingModes) {
		this.readingModes = readingModes;
	}
	public Long getPageCount() {
		return pageCount;
	}
	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}
	public String getPrintType() {
		return printType;
	}
	public void setPrintType(String printType) {
		this.printType = printType;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public String getMaturityRating() {
		return maturityRating;
	}
	public void setMaturityRating(String maturityRating) {
		this.maturityRating = maturityRating;
	}
	public Boolean getAllowAnonLogging() {
		return allowAnonLogging;
	}
	public void setAllowAnonLogging(Boolean allowAnonLogging) {
		this.allowAnonLogging = allowAnonLogging;
	}
	public String getContentVersion() {
		return contentVersion;
	}
	public void setContentVersion(String contentVersion) {
		this.contentVersion = contentVersion;
	}
	public PanelizationSummary getPanelizationSummary() {
		return panelizationSummary;
	}
	public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
		this.panelizationSummary = panelizationSummary;
	}
	public ImageLink getImageLinks() {
		return imageLinks;
	}
	public void setImageLinks(ImageLink imageLinks) {
		this.imageLinks = imageLinks;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPreviewLink() {
		return previewLink;
	}
	public void setPreviewLink(String previewLink) {
		this.previewLink = previewLink;
	}
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}
	public String getCanonicalVolumeLink() {
		return canonicalVolumeLink;
	}
	public void setCanonicalVolumeLink(String canonicalVolumeLink) {
		this.canonicalVolumeLink = canonicalVolumeLink;
	}
	
}

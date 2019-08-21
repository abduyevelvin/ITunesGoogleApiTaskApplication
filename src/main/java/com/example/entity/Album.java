package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class convertible for ITunes alum API JSON
 * The class contains fields which is appropriate to JSON tags
 * Generated setter and getter methods of class fields
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {

	private String wrapperType;
	private String kind;
	private Long artistId;
	private Long collectionId;
	private Long trackId;
	private String artistName;
	private String collectionName;
	private String trackName;
	private String collectionCensoredName;
	private String trackCensoredName;
	private String artistViewUrl;
	private String collectionViewUrl;
	private String trackViewUrl;
	private String previewUrl;
	private String artworkUrl60;
	private String artworkUrl100;
	private Double collectionPrice;
	private Double trackPrice;
	private String collectionExplicitness;
	private String trackExplicitness;
	private Long discCount;
	private Long discNumber;
	private Long trackCount;
	private Long trackNumber;
	private Long trackTimeMillis;
	private String country;
	private String currency;
	private String primaryGenreName;
	
	public String getWrapperType() {
		return wrapperType;
	}
	public void setWrapperType(String wrapperType) {
		this.wrapperType = wrapperType;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Long getArtistId() {
		return artistId;
	}
	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}
	public Long getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}
	public Long getTrackId() {
		return trackId;
	}
	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}
	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}
	public String getTrackCensoredName() {
		return trackCensoredName;
	}
	public void setTrackCensoredName(String trackCensoredName) {
		this.trackCensoredName = trackCensoredName;
	}
	public String getArtistViewUrl() {
		return artistViewUrl;
	}
	public void setArtistViewUrl(String artistViewUrl) {
		this.artistViewUrl = artistViewUrl;
	}
	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}
	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}
	public String getTrackViewUrl() {
		return trackViewUrl;
	}
	public void setTrackViewUrl(String trackViewUrl) {
		this.trackViewUrl = trackViewUrl;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getArtworkUrl60() {
		return artworkUrl60;
	}
	public void setArtworkUrl60(String artworkUrl60) {
		this.artworkUrl60 = artworkUrl60;
	}
	public String getArtworkUrl100() {
		return artworkUrl100;
	}
	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}
	public Double getCollectionPrice() {
		return collectionPrice;
	}
	public void setCollectionPrice(Double collectionPrice) {
		this.collectionPrice = collectionPrice;
	}
	public Double getTrackPrice() {
		return trackPrice;
	}
	public void setTrackPrice(Double trackPrice) {
		this.trackPrice = trackPrice;
	}
	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}
	public void setCollectionExplicitness(String collectionExplicitness) {
		this.collectionExplicitness = collectionExplicitness;
	}
	public String getTrackExplicitness() {
		return trackExplicitness;
	}
	public void setTrackExplicitness(String trackExplicitness) {
		this.trackExplicitness = trackExplicitness;
	}
	public Long getDiscCount() {
		return discCount;
	}
	public void setDiscCount(Long discCount) {
		this.discCount = discCount;
	}
	public Long getDiscNumber() {
		return discNumber;
	}
	public void setDiscNumber(Long discNumber) {
		this.discNumber = discNumber;
	}
	public Long getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}
	public Long getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(Long trackNumber) {
		this.trackNumber = trackNumber;
	}
	public Long getTrackTimeMillis() {
		return trackTimeMillis;
	}
	public void setTrackTimeMillis(Long trackTimeMillis) {
		this.trackTimeMillis = trackTimeMillis;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrimaryGenreName() {
		return primaryGenreName;
	}
	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}
	
	@Override
	public String toString() {
		return "Album [wrapperType=" + wrapperType + ", kind=" + kind + ", artistId=" + artistId + ", collectionId="
				+ collectionId + ", trackId=" + trackId + ", artistName=" + artistName + ", collectionName="
				+ collectionName + ", trackName=" + trackName + ", collectionCensoredName=" + collectionCensoredName
				+ ", trackCensoredName=" + trackCensoredName + ", artistViewUrl=" + artistViewUrl
				+ ", collectionViewUrl=" + collectionViewUrl + ", trackViewUrl=" + trackViewUrl + ", previewUrl="
				+ previewUrl + ", artworkUrl60=" + artworkUrl60 + ", artworkUrl100=" + artworkUrl100
				+ ", collectionPrice=" + collectionPrice + ", trackPrice=" + trackPrice + ", collectionExplicitness="
				+ collectionExplicitness + ", trackExplicitness=" + trackExplicitness + ", discCount=" + discCount
				+ ", discNumber=" + discNumber + ", trackCount=" + trackCount + ", trackNumber=" + trackNumber
				+ ", trackTimeMillis=" + trackTimeMillis + ", country=" + country + ", currency=" + currency
				+ ", primaryGenreName=" + primaryGenreName + "]";
	}	
}

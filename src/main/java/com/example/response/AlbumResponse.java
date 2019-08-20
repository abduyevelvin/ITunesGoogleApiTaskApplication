package com.example.response;

public class AlbumResponse {
	
	private String title;
	private String artist;
	private String kind;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return "AlbumResponse [title=" + title + ", artist=" + artist + ", kind=" + kind + "]";
	}
	
	
}

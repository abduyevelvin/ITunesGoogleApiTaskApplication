package com.example.response;

/**
 * Java class for giving response to the end user.
 * Generated setter and getter methods of class fields
 * 
 * @author Abduyev Elvin
 * 
 */
public class AlbumResponse implements Comparable<AlbumResponse> {
	
	/** Represents the title of albums.
	*/
	private String title;
	/** Represents the artist of albums.
	*/
	private String artist;
	/** Represents the kind of data.
	*/
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

	/**
	 * The method for ordering result regarding song title
	 * 
	 * @param AlbumResponse accepting albums
	 * @return ordered albums by title
	 */
	@Override
	public int compareTo(AlbumResponse response) {
		int order = this.title.compareTo(response.title);
		return order;
	}
	
	@Override
	public String toString() {
		return "AlbumResponse [title=" + title + ", artist=" + artist + ", kind=" + kind + "]";
	}
	
}

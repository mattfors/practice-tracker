package com.fors.practice.model;

import java.util.Date;

public class Song {
	
	private String songId;
	private String title;
	private String artist;
	private Date createDate;
	private String createUsr;
	private String genreId;
	
	public String getSongId() {
		return songId;
	}
	public void setSongId(String songId) {
		this.songId = songId;
	}
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUsr() {
		return createUsr;
	}
	public void setCreateUsr(String createUsr) {
		this.createUsr = createUsr;
	}
	public String getGenreId() {
		return genreId;
	}
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}

	
}

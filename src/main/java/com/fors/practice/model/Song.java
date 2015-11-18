package com.fors.practice.model;

import java.time.LocalDateTime;

public class Song {
	
	private String songId;
	private String title;
	private String artist;
	private LocalDateTime createDate;
	private String createUsr;
	private String genraId;
	
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getCreateUsr() {
		return createUsr;
	}
	public void setCreateUsr(String createUsr) {
		this.createUsr = createUsr;
	}
	public String getGenraId() {
		return genraId;
	}
	public void setGenraId(String genraId) {
		this.genraId = genraId;
	}

	
}

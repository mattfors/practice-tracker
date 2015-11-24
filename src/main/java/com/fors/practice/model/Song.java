package com.fors.practice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "song", catalog = "practrac", uniqueConstraints = {@UniqueConstraint(columnNames = "song_id") })
public class Song {
	
	private String songId;
	private String title;
	private String artist;
	private Date createDate;
	private String createUsr;
	private String genreId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "song_id", unique = true, nullable = false)
	public String getSongId() {
		return songId;
	}
	public void setSongId(String songId) {
		this.songId = songId;
	}
	@Column(name = "title", length = 255)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "artist", length = 255)
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}	
	@Column(name = "create_date")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "user_id")
	public String getCreateUsr() {
		return createUsr;
	}
	public void setCreateUsr(String createUsr) {
		this.createUsr = createUsr;
	}
	@Column(name = "genre_id")
	public String getGenreId() {
		return genreId;
	}
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}

	
}

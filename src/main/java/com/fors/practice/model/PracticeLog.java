package com.fors.practice.model;

import java.time.LocalDateTime;

public class PracticeLog {
	
	private String logId;
	private String userId;
	private String songId;
	private LocalDateTime createDate;
	private String typeId;
	private int duration;
	private int bpm;
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSongId() {
		return songId;
	}
	public void setSongId(String songId) {
		this.songId = songId;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

}

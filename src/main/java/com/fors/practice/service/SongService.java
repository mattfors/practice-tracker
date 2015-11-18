package com.fors.practice.service;

import org.springframework.stereotype.Component;

import com.fors.practice.model.Song;

@Component
public class SongService {

	public Song getExampleSong(){
		Song s = new Song();
		s.setArtist("Cy Colemman");
		s.setCreateUsr("mfors");
		s.setGenreId("Jazz");
		s.setTitle("When In Rome");
		s.setSongId("001");
		return s;
	}
}

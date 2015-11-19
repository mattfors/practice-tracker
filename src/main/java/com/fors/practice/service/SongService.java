package com.fors.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fors.practice.model.Song;

@Component
public class SongService {

	public List<Song> getExampleSongs(){
		List<Song> songs = new ArrayList<Song>();
		songs.add(getExampleSong());
		songs.add(getExampleSong2());
		
		return songs;
		
	}
	
	public Song getExampleSong(){
		Song s = new Song();
		s.setArtist("Cy Colemman");
		s.setCreateUsr("mfors");
		s.setGenreId("Jazz");
		s.setTitle("When In Rome");
		s.setSongId("001");
		return s;
	}
	
	public Song getExampleSong2(){
		Song s = new Song();
		s.setArtist("Gary Stewart");
		s.setCreateUsr("mfors");
		s.setGenreId("Country");
		s.setTitle("Empty Glass");
		s.setSongId("002");
		return s;
	}
}

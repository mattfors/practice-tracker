package com.fors.practice.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fors.practice.model.Song;
import com.fors.practice.service.SongService;

@Path("/song")
public class SongResource {

	@Inject
	private SongService songService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Song pong() {
		return songService.getExampleSong();
	}
}

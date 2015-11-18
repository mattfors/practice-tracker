package com.fors.practice.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fors.practice.service.PingService;

@Path("/ping2")
public class InjectResource {

	@Inject
	private PingService ping;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pong() {
		return ping.pong();
	}
}

package com.ffbit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Path("jsonresources")
@Produces(MediaType.APPLICATION_JSON)
public class JsonResource {

    private Map<String,String> map = Collections.singletonMap("name", "value");

    @GET
    @Path("{id}")
    public Map<String, String> getObject(@PathParam("id") String id) {
        return map;
    }

    @GET
    public Collection<Map.Entry<String, String>> index() {
        return map.entrySet();
    }

}

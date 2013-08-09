package com.ffbit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Map;

@Path("jsonresource")
public class JsonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getObject() {
        return Collections.<String, String>singletonMap("name", "value");
    }

}

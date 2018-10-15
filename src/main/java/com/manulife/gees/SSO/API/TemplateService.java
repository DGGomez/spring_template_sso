package com.manulife.gees.SSO.API;

import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TemplateService {
    private Map<Integer,Response> mem = new HashMap<Integer,Response>();
    public Response getResponse(int id) {

        return mem.get(id);
    }

    public int createResponse(Response response) {
        mem.put(response.getId(),response);
        return response.getId();
    }

    public Response updateResponse(Response response){
        mem.get(response.getId()).setValue(response.getValue());
        return mem.get(response.getId());
    }

    public void deleteResponse(int id){
        mem.remove(id);
    }

}
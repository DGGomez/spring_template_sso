package com.manulife.gees.SSO.API;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ResponseController {
    @Autowired
    TemplateService service;

    @ApiOperation(value = "Create Value")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Created successfully"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "Share not found"),
            @ApiResponse(code = 422, message = "Error occured")
    })
    @RequestMapping(value = "/api/createResponse", method = RequestMethod.POST, consumes = "application/json")
    public int createResponse(@RequestBody Response response) throws IOException, InterruptedException {
        service.createResponse(response);
        return service.createResponse(response);

    }

    @ApiOperation(value = "Get Response")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get successful"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "Share not found"),
            @ApiResponse(code = 422, message = "Error occured")
    })
    @RequestMapping(value = "/api/getResponse/{id}", method = RequestMethod.GET)
    public Response getResponse(@PathVariable("id") int id) throws IOException, InterruptedException {

        return service.getResponse(id);

    }
    @ApiOperation(value = "update Response")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "asdf successful"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "Share not found"),
            @ApiResponse(code = 422, message = "Error occured")
    })
    @RequestMapping(value = "/api/updateResponse", method = RequestMethod.PATCH, consumes = "application/json")
    public Response updateResponse(@RequestBody Response response) throws IOException, InterruptedException {

        return service.updateResponse(response);

    }

    @ApiOperation(value = "Delete Directory")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted successfully"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "Share not found"),
            @ApiResponse(code = 422, message = "Error occured")
    })
    @RequestMapping(value = "/api/delete/{id}", method = RequestMethod.DELETE)
    public void deleteDirectory(@PathVariable("id") int id) throws IOException, InterruptedException {
        service.deleteResponse(id);
    }

}

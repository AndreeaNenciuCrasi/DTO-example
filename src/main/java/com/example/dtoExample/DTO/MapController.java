package com.example.dtoExample.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("/map")
    @ResponseBody
    public List<UserLocationDTO> getAllUsersLocation() {
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation();
        return usersLocation;
    }
}

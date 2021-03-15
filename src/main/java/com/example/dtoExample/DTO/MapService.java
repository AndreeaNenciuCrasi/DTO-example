package com.example.dtoExample.DTO;

import com.example.dtoExample.Location.model.Location;
import com.example.dtoExample.User.model.User;
import com.example.dtoExample.User.repo.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserLocationDTO> getAllUsersLocation() {
        return ((List<User>) userRepository
                .findAll())
                .stream()
                .map(this::convertToUserLocationDTO)
                .collect(Collectors.toList());
    }

//    private UserLocationDTO convertToUserLocationDTO(User user) {
//        UserLocationDTO userLocationDTO = new UserLocationDTO();
//        userLocationDTO.setUserId(user.getId());
//        userLocationDTO.setUsername(user.getUsername());
//        Location location = (Location) user.getLocation();
//        userLocationDTO.setLat(location.getLat());
//        userLocationDTO.setLng(location.getLng());
//        userLocationDTO.setPlace(location.getPlace());
//        return userLocationDTO;
//    }

    private UserLocationDTO convertToUserLocationDTO(User user) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        UserLocationDTO userLocationDTO = modelMapper
                .map(user, UserLocationDTO.class);
        return userLocationDTO;
    }
}
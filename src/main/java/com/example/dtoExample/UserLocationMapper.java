//package com.example.dtoExample;
//
//import com.example.dtoExample.DTO.UserLocationDTO;
//import com.example.dtoExample.Location.model.Location;
//import com.example.dtoExample.User.model.User;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//
//@Mapper
//public interface UserLocationMapper {
//    UserLocationMapper INSTANCE = Mappers.getMapper(UserLocationMapper.class);
//
//    @Mapping(source = "user.id", target = "userId")
//    UserLocationDTO toDto(User user, Location location);
//}

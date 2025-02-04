package com.trainibit.first_api.mapper.impl;

import com.trainibit.first_api.entity.User;
<<<<<<< HEAD
import com.trainibit.first_api.mapper.UserMapper;
import com.trainibit.first_api.request.UserRequestPost;
import com.trainibit.first_api.response.UserResponse;
=======
import com.trainibit.first_api.mapper.FederalStateMapper;
import com.trainibit.first_api.mapper.RolesByUserMapper;
import com.trainibit.first_api.mapper.UserMapper;
import com.trainibit.first_api.request.UserRequestPost;
import com.trainibit.first_api.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> c572bc0 (primera api)
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserMapperImpl implements UserMapper {
<<<<<<< HEAD
=======
    @Autowired
    private FederalStateMapper federalStateMapper;

    @Autowired
    private RolesByUserMapper rolesByUserMapper;

>>>>>>> c572bc0 (primera api)
    @Override
    public UserResponse entityToResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setEmail(user.getEmail());
        userResponse.setCreatedDate(user.getCreatedDate());
        userResponse.setUpdatedDate(user.getUpdatedDate());
        userResponse.setUuid(user.getUuid());
<<<<<<< HEAD
        userResponse.setFederalState(user.getFederalState());
        userResponse.setRoles(user.getRoles());
=======
        userResponse.setFederalState(federalStateMapper.entityToResponse(user.getFederalState()));
        userResponse.setRoles(rolesByUserMapper.entityToResponseList(user.getRoles().stream().filter(role -> role.getActivated()).toList()));
>>>>>>> c572bc0 (primera api)

        LocalDate birthdate = user.getBirthdate();
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthdate, currentDate);

        userResponse.setBirthDate(birthdate);
<<<<<<< HEAD
        userResponse.setAge(period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days" );
=======
        userResponse.setAge(
                period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days");
>>>>>>> c572bc0 (primera api)

        userResponse.setPlanet(user.getPlanet());

        return userResponse;
    }

    @Override
    public List<UserResponse> entityToResponseList(List<User> userList) {
        List<UserResponse> userResponseList = new ArrayList<>();

        userList.forEach(user -> userResponseList.add(entityToResponse(user)));

        return userResponseList;
    }

    @Override
    public User requestToEntity(UserRequestPost userRequest) {
        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
<<<<<<< HEAD
        user.setBirthdate(userRequest.getBirthdate());

        return user;
    }
}
=======
        user.setBirthdate(LocalDate.parse(userRequest.getBirthdate()));

        return user;
    }
}
>>>>>>> c572bc0 (primera api)

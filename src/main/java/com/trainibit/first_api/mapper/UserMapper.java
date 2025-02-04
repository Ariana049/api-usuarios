package com.trainibit.first_api.mapper;

import com.trainibit.first_api.entity.User;
import com.trainibit.first_api.request.UserRequestPost;
import com.trainibit.first_api.response.UserResponse;

import java.util.List;

public interface UserMapper {
    UserResponse entityToResponse(User user);
<<<<<<< HEAD
    List<UserResponse> entityToResponseList(List<User> userList);
    User requestToEntity(UserRequestPost userRequest);
}
=======

    List<UserResponse> entityToResponseList(List<User> userList);

    User requestToEntity(UserRequestPost userRequest);
}
>>>>>>> c572bc0 (primera api)

package org.tundor.data.mappers;

import org.domain.models.userRoles.accountInformation.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.data.DTOs.UserInfoDTO;

@Mapper
public interface InfoMapper {

    InfoMapper INSTANCE = Mappers.getMapper(InfoMapper.class);


    UserInfo toDomain (UserInfoDTO userInfo);

    UserInfoDTO toDTO (UserInfo userInfo);
}

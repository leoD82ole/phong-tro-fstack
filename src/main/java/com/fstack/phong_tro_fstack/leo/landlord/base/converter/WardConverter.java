package com.fstack.phong_tro_fstack.leo.landlord.base.converter;

import com.fstack.phong_tro_fstack.leo.landlord.base.dto.WardDTO;
import com.fstack.phong_tro_fstack.leo.landlord.base.entity.WardEntity;
import org.springframework.stereotype.Component;

@Component
public class WardConverter {
    public WardEntity toEntity(WardDTO wardDTO){
        WardEntity wardEntity=new WardEntity();
        wardEntity.setId(wardDTO.getId());
        wardEntity.setName(wardDTO.getName());
        wardEntity.setType(wardDTO.getType());
        wardEntity.setDistrictId(wardDTO.getIdDistrict());
        return wardEntity;
    }

    public WardDTO toDTO(WardEntity wardEntity){
        WardDTO wardDTO=new WardDTO();
        wardDTO.setId(wardEntity.getId());
        wardDTO.setName(wardEntity.getName());
        wardDTO.setType(wardEntity.getType());
        wardDTO.setIdDistrict(wardEntity.getDistrictId());
        return wardDTO;
    }
}

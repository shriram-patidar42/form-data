
package com.formData.service;

import com.formData.dto.InformationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService {

    InformationDto createUser(InformationDto informationDto);

    List<InformationDto> getAllUser();
}

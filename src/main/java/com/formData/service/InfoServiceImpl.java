package com.formData.service;

import com.formData.dto.InformationDto;
import com.formData.entity.Information;
import com.formData.repositoty.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;
    private final ModelMapper modelMapper;

    @Override
    public InformationDto createUser(InformationDto informationDto) {

        informationDto.setId(UUID.randomUUID().toString());

        // DTO → Entity
        Information information =
                modelMapper.map(informationDto, Information.class);

        Information saved =
                infoRepository.save(information);

        // Entity → DTO
        return modelMapper.map(saved, InformationDto.class);
    }

    @Override
    public List<InformationDto> getAllUser() {
        List<Information> informationList = infoRepository.findAll();
        List<InformationDto> informationDtoList= informationList.stream().map(information -> modelMapper.map(information, InformationDto.class)).collect(Collectors.toList());
        return informationDtoList;
    }
}

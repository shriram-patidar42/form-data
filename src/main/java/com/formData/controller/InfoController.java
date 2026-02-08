package com.formData.controller;

import com.formData.dto.InformationDto;
import com.formData.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5174") // Vite default port
public class InfoController {

    @Autowired
    private  InfoService infoService;

    @PostMapping
    public ResponseEntity<InformationDto> create(
            @RequestBody InformationDto dto) {

        return ResponseEntity.ok(infoService.createUser(dto));
    }

    @GetMapping
    public ResponseEntity<List<InformationDto>> getAll(){
        return ResponseEntity.ok(infoService.getAllUser());
    }

    @GetMapping("/api")
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("Succesffully running ");
    }
}

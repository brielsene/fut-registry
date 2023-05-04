package br.com.fut.futregistry.controller;

import br.com.fut.futregistry.domain.time.TimeRequestDto;
import br.com.fut.futregistry.domain.time.TimeResponseDto;
import br.com.fut.futregistry.domain.time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @PostMapping
    public ResponseEntity cadastrar (@RequestBody TimeRequestDto data){
        timeService.cadastrar(data);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<TimeResponseDto>>listar(){
        return new ResponseEntity<>(timeService.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TimeResponseDto>timeById(@PathVariable("id")Long id){
        return new ResponseEntity<>(timeService.timeById(id), HttpStatus.OK);
    }
}

package br.com.fut.futregistry.domain.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeService {
    @Autowired
    private TimeRepository repository;

    public void cadastrar(TimeRequestDto data){
        Time time = new Time(data);
        repository.save(time);
        System.out.println(time.getNome());


    }

    public List<TimeResponseDto>listar(){
        List<Time> all = repository.findAll();
        return all.stream().map(TimeResponseDto::new).toList();
    }

    public TimeResponseDto timeById(Long id){
        Optional<Time> byId = repository.findById(id);

            TimeResponseDto time = new TimeResponseDto(byId.get());
            return time;



    }
}

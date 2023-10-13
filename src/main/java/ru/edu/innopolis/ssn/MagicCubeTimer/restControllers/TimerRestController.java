package ru.edu.innopolis.ssn.MagicCubeTimer.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import ru.edu.innopolis.ssn.MagicCubeTimer.dto.RequestTimeDto;
import ru.edu.innopolis.ssn.MagicCubeTimer.dto.ResponseTimeDto;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.SolvingTime;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.User;
import ru.edu.innopolis.ssn.MagicCubeTimer.repositories.SolvingTimeRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TimerRestController {

    private final SolvingTimeRepository timeRepository;

    public TimerRestController(SolvingTimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @PostMapping("/time")
    public ResponseEntity<HttpStatus> postTime(@RequestBody RequestTimeDto timeDto, @AuthenticationPrincipal User user) {
        SolvingTime time = new SolvingTime();
        System.out.println(timeDto.getTime());
        time.setTime(timeDto.getTime());
        time.setUser(user);
        timeRepository.save(time);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/time")
    public List<ResponseTimeDto> getTimeList(@AuthenticationPrincipal User user) {
        List<SolvingTime> timeList = timeRepository.findAllByUser(user);
        return timeList.stream()
                .map(time -> new ResponseTimeDto(time.getId(), time.getTime(), time.getUser().getId()))
                .collect(Collectors.toList());
    }
}

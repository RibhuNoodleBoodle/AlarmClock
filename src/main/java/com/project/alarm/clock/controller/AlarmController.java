package com.project.alarm.clock.controller;

import com.project.alarm.clock.model.Alarm;
import com.project.alarm.clock.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alarms")
public class AlarmController {

    private final AlarmService alarmService;

    @Autowired
    public AlarmController(AlarmService alarmService) {
        this.alarmService = alarmService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Alarm>> getAllAlarms() {
        List<Alarm> alarms = alarmService.getAllAlarms();
        return new ResponseEntity<>(alarms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alarm> getAlarmById(@PathVariable("id") Long id) {
        return alarmService.getAlarmById(id)
                .map(alarm -> new ResponseEntity<>(alarm, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<Alarm> createAlarm(@RequestBody Alarm alarm) {
        alarmService.saveAlarm(alarm);
        return new ResponseEntity<>(alarm, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alarm> updateAlarm(@PathVariable("id") Long id, @RequestBody Alarm alarm) {
        Optional<Alarm> existingAlarm = alarmService.getAlarmById(id);
        if (existingAlarm.isPresent()) {
            Alarm updatedAlarm = existingAlarm.get();
            updatedAlarm.setHour(alarm.getHour());
            updatedAlarm.setMinute(alarm.getMinute());
            updatedAlarm.setAmPm(alarm.getAmPm());
            alarmService.saveAlarm(updatedAlarm);
            return new ResponseEntity<>(updatedAlarm, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAlarm(@PathVariable("id") Long id) {
        alarmService.deleteAlarmById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
package com.project.alarm.clock.service;

import com.project.alarm.clock.model.Alarm;
import com.project.alarm.clock.repository.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlarmService  {

    private final AlarmRepository alarmRepository;

    @Autowired
    public AlarmService(AlarmRepository alarmRepository) {
        this.alarmRepository = alarmRepository;
    }

    public List<Alarm> getAllAlarms() {
        return alarmRepository.findAll();
    }

    public Optional<Alarm> getAlarmById(Long id) {
        return alarmRepository.findById(id);
    }

    public void saveAlarm(Alarm alarm) {
        alarmRepository.save(alarm);
    }

    public void deleteAlarmById(Long id) {
        alarmRepository.deleteById(id);
    }
}
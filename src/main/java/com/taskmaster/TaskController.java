package com.taskmaster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final MetricsService metricsService;

    public TaskController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/tasks")
    public String getTasks() {
        logger.info("Fetching all tasks");
        return "List of tasks";
    }

    @PostMapping("/tasks")
    public String createTask() {
        logger.info("Creating a new task");
        metricsService.recordTaskCreated();
        return "Task created successfully";
    }
}

package com.estaine.cityquest.entity;

import com.estaine.cityquest.entity.enums.SubtaskOrder;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by Estaine on 11.04.2016.
 */
@Entity
public class Task {
    private int taskId;
    private String name;
    private String description;
    private SubtaskOrder subtaskOrder;
    private Timestamp deadline;
    private Set<Subtask> subtasks;

    @Id
    @Column(name = "task_id")
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "subtask_order")
    public SubtaskOrder getSubtaskOrder() {
        return subtaskOrder;
    }

    public void setSubtaskOrder(SubtaskOrder subtaskOrder) {
        this.subtaskOrder = subtaskOrder;
    }

    @Basic
    @Column(name = "deadline")
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    public Set<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(Set<Subtask> subtasks) {
        this.subtasks = subtasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (taskId != task.taskId) return false;
        if (subtaskOrder != task.subtaskOrder) return false;
        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        if (description != null ? !description.equals(task.description) : task.description != null) return false;
        if (deadline != null ? !deadline.equals(task.deadline) : task.deadline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + subtaskOrder.ordinal();
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        return result;
    }
}

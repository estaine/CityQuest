package com.estaine.cityquest.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Estaine on 11.04.2016.
 */
@Entity
public class Subtask {
    private int subtaskId;
    private Task task;
    private String name;
    private String description;
    private String answer;
    private String comment;
    private Integer attemptLimit;
    private Set<Image> images;
    private Set<Team> teams;

    @Id
    @Column(name = "subtask_id")
    public int getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(int subtaskId) {
        this.subtaskId = subtaskId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "task_id", nullable = false)
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
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

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "attempt_limit")
    public Integer getAttemptLimit() {
        return attemptLimit;
    }

    public void setAttemptLimit(Integer attemptLimit) {
        this.attemptLimit = attemptLimit;
    }


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "subtask_image",
            joinColumns = {
                    @JoinColumn(name = "subtask_id", nullable = false, updatable = false) },
            inverseJoinColumns = {
                    @JoinColumn(name = "image_id",
                    nullable = false, updatable = false) })
    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subtask subtask = (Subtask) o;

        if (subtaskId != subtask.subtaskId) return false;
        if (name != null ? !name.equals(subtask.name) : subtask.name != null) return false;
        if (description != null ? !description.equals(subtask.description) : subtask.description != null) return false;
        if (answer != null ? !answer.equals(subtask.answer) : subtask.answer != null) return false;
        if (comment != null ? !comment.equals(subtask.comment) : subtask.comment != null) return false;
        if (attemptLimit != null ? !attemptLimit.equals(subtask.attemptLimit) : subtask.attemptLimit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subtaskId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (attemptLimit != null ? attemptLimit.hashCode() : 0);
        return result;
    }

}

package com.estaine.cityquest.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Estaine on 11.04.2016.
 */
@Entity
@Table(name = "mark", schema = "", catalog = "cityquest")
public class Mark {
    private int teamSubtaskId;
    private Team team;
    private Subtask subtask;
    private Timestamp start;
    private Timestamp finish;
    private Integer attemptsUsed;
    private Integer penalty;

    @Id
    @Column(name = "team_subtask_id")
    public int getTeamSubtaskId() {
        return teamSubtaskId;
    }

    public void setTeamSubtaskId(int teamSubtaskId) {
        this.teamSubtaskId = teamSubtaskId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "subtask_id", nullable = false)
    public Subtask getSubtask() {
        return subtask;
    }

    public void setSubtask(Subtask subtask) {
        this.subtask = subtask;
    }

    @Basic
    @Column(name = "start")
    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Basic
    @Column(name = "finish")
    public Timestamp getFinish() {
        return finish;
    }

    public void setFinish(Timestamp finish) {
        this.finish = finish;
    }

    @Basic
    @Column(name = "attempts_used")
    public Integer getAttemptsUsed() {
        return attemptsUsed;
    }

    public void setAttemptsUsed(Integer attemptsUsed) {
        this.attemptsUsed = attemptsUsed;
    }

    @Basic
    @Column(name = "penalty")
    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mark that = (Mark) o;

        if (teamSubtaskId != that.teamSubtaskId) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (finish != null ? !finish.equals(that.finish) : that.finish != null) return false;
        if (attemptsUsed != null ? !attemptsUsed.equals(that.attemptsUsed) : that.attemptsUsed != null) return false;
        if (penalty != null ? !penalty.equals(that.penalty) : that.penalty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamSubtaskId;
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        result = 31 * result + (attemptsUsed != null ? attemptsUsed.hashCode() : 0);
        result = 31 * result + (penalty != null ? penalty.hashCode() : 0);
        return result;
    }
}

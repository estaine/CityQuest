package com.estaine.cityquest.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Estaine on 11.04.2016.
 */
@Entity
public class Team {
    private int teamId;
    private String name;
    private Set<Subtask> subtasks;

    @Id
    @Column(name = "team_id")
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "mark",
            joinColumns = {
                    @JoinColumn(name = "team_id", nullable = false, updatable = false) },
            inverseJoinColumns = {
                    @JoinColumn(name = "subtask_id",
                            nullable = false, updatable = false) })
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

        Team team = (Team) o;

        if (teamId != team.teamId) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

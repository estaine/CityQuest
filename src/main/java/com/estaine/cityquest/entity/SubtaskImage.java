package com.estaine.cityquest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Estaine on 11.04.2016.
 */
@Entity
@Table(name = "subtask_image", schema = "", catalog = "cityquest")
public class SubtaskImage {
    private int subtaskImageId;

    @Id
    @Column(name = "subtask_image_id")
    public int getSubtaskImageId() {
        return subtaskImageId;
    }

    public void setSubtaskImageId(int subtaskImageId) {
        this.subtaskImageId = subtaskImageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubtaskImage that = (SubtaskImage) o;

        if (subtaskImageId != that.subtaskImageId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return subtaskImageId;
    }
}

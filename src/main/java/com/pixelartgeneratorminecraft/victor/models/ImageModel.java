package com.pixelartgeneratorminecraft.victor.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.pixelartgeneratorminecraft.victor.enums.ImageStatusEnum;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_images")
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private ImageStatusEnum status;

    private int x_resolucao;

    private int y_resolucao;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ImageStatusEnum status) {
        this.status = status;
    }

    public int getX_resolucao() {
        return x_resolucao;
    }

    public void setX_resolucao(int x_resolucao) {
        this.x_resolucao = x_resolucao;
    }

    public int getY_resolucao() {
        return y_resolucao;
    }

    public void setY_resolucao(int y_resolucao) {
        this.y_resolucao = y_resolucao;
    }
}

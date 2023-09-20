package com.shopspace.shopspacewebservice.dto;

public class BrandDTO {
    private Long id;
    private String name;
    private Integer status;

    public BrandDTO() {
    }

    public BrandDTO(Long id, String name, Integer status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BrandDTO{" + "id=" + id + ", name='" + name + '\'' + ", status=" + status + '}';
    }
}

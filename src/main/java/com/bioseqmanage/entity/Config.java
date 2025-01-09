package com.bioseqmanage.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="config")
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int configId;
    private String name;
    private String logo;

    /**
     * 配置ID
     * @return
     */
    public int getConfigId() {
        return this.configId;
    }
    /**
     * 配置ID
     * @param configId
     */
    public void setConfigId(int configId) {
        this.configId = configId;
    }
    /**
     * 系统名称
     * @return
     */
    public String getName() {
        return this.name;
    }
    /**
     * 系统名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 系统logo
     * @return
     */
    public String getLogo() {
        return this.logo;
    }
    /**
     * 系统logo
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }
}

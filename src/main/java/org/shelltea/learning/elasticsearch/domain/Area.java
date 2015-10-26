package org.shelltea.learning.elasticsearch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @author Xiong Shuhong(xiongsh@youyuan.com)
 *         Created on 2015/10/26.
 */
@Entity
public class Area implements Serializable {
    private static final long serialVersionUID = 1073693697110806836L;
    @Column
    private String provinceName;
    @Column
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

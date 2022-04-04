package com.rzit.SERIALIZABLE;

import java.io.Serializable;

/**
 * Created by Ranjith on 7/17/2017.
 */
public class CCard extends  Payment  implements Serializable {
    String cName;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}

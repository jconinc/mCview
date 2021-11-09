package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0034UcrRegistrationPK implements Serializable {
    @Id
    @Column(name = "MCS_T0034_SEQ")
    private String mcsT0034Seq;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0034UcrRegistrationPK that = (McsT0034UcrRegistrationPK) o;
        return Objects.equals(mcsT0034Seq, that.mcsT0034Seq) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcsT0034Seq);
    }
}

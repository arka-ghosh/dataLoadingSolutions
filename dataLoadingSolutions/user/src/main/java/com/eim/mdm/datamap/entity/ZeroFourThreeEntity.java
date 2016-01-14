/**@(#) ZeroFourThreeEntity.java
Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
Usage is subject to license terms. Any unauthorized usage will be prosecuted.*/
package com.eim.mdm.datamap.entity;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;
import java.util.List;
import org.apache.solr.client.solrj.beans.Field;

/**
 * Entity class to store data to zeroFourThree column family.
 */
@Table(name = "zeroFourThree")
class ZeroFourThreeEntity {

    @Column(name = "zeroFourThreeOne")
    @Field("zeroFourThreeOne")
    private String zeroFourThreeOne;

    @Column(name = "zeroFourThreeTwo_zeroTwentyOne")
    @Field("zeroFourThreeTwo_zeroTwentyOne")
    private String zeroFourThreeTwoZeroTwentyOne;

    @Column(name = "zeroFourThreeThree")
    @Field("zeroFourThreeThree")
    private List<String> zeroFourThreeThree;

    @Column(name = "zeroFourThreeFour")
    @Field("zeroFourThreeFour")
    private List<String> zeroFourThreeFour;

    /**Method to access zeroFourThreeOne
@return the zeroFourThreeOne*/
    public String getZeroFourThreeOne() {
        return this.zeroFourThreeOne;
    }

    /**Method to access zeroFourThreeTwoZeroTwentyOne
@return the zeroFourThreeTwoZeroTwentyOne*/
    public String getZeroFourThreeTwoZeroTwentyOne() {
        return this.zeroFourThreeTwoZeroTwentyOne;
    }

    /**Method to access zeroFourThreeThree
@return the zeroFourThreeThree*/
    public List<String> getZeroFourThreeThree() {
        return this.zeroFourThreeThree;
    }

    /**Method to access zeroFourThreeFour
@return the zeroFourThreeFour*/
    public List<String> getZeroFourThreeFour() {
        return this.zeroFourThreeFour;
    }

    /**Method to mutate zeroFourThreeOne
@param zeroFourThreeOne the zeroFourThreeOne to set*/
    public void setZeroFourThreeOne(final String zeroFourThreeOne) {
        this.zeroFourThreeOne = zeroFourThreeOne;
    }

    /**Method to mutate zeroFourThreeTwoZeroTwentyOne
@param zeroFourThreeTwoZeroTwentyOne the zeroFourThreeTwoZeroTwentyOne to set*/
    public void setZeroFourThreeTwoZeroTwentyOne(final String zeroFourThreeTwoZeroTwentyOne) {
        this.zeroFourThreeTwoZeroTwentyOne = zeroFourThreeTwoZeroTwentyOne;
    }

    /**Method to mutate zeroFourThreeThree
@param zeroFourThreeThree the zeroFourThreeThree to set*/
    public void setZeroFourThreeThree(final List<String> zeroFourThreeThree) {
        this.zeroFourThreeThree = zeroFourThreeThree;
    }

    /**Method to mutate zeroFourThreeFour
@param zeroFourThreeFour the zeroFourThreeFour to set*/
    public void setZeroFourThreeFour(final List<String> zeroFourThreeFour) {
        this.zeroFourThreeFour = zeroFourThreeFour;
    }

    /**The equals method
@see java.lang.Object#equals(java.lang.Object)*/
    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ZeroFourThreeEntity))
            return false;
        final ZeroFourThreeEntity other = (ZeroFourThreeEntity) o;
        if (!other.canEqual((java.lang.Object) this))
            return false;
        final java.lang.Object this$zeroFourThreeOne = this.getZeroFourThreeOne();
        final java.lang.Object other$zeroFourThreeOne = other.getZeroFourThreeOne();
        if (this$zeroFourThreeOne == null ? other$zeroFourThreeOne != null : !this$zeroFourThreeOne.equals(other$zeroFourThreeOne))
            return false;
        final java.lang.Object this$zeroFourThreeTwoZeroTwentyOne = this.getZeroFourThreeTwoZeroTwentyOne();
        final java.lang.Object other$zeroFourThreeTwoZeroTwentyOne = other.getZeroFourThreeTwoZeroTwentyOne();
        if (this$zeroFourThreeTwoZeroTwentyOne == null ? other$zeroFourThreeTwoZeroTwentyOne != null : !this$zeroFourThreeTwoZeroTwentyOne.equals(other$zeroFourThreeTwoZeroTwentyOne))
            return false;
        final java.lang.Object this$zeroFourThreeThree = this.getZeroFourThreeThree();
        final java.lang.Object other$zeroFourThreeThree = other.getZeroFourThreeThree();
        if (this$zeroFourThreeThree == null ? other$zeroFourThreeThree != null : !this$zeroFourThreeThree.equals(other$zeroFourThreeThree))
            return false;
        final java.lang.Object this$zeroFourThreeFour = this.getZeroFourThreeFour();
        final java.lang.Object other$zeroFourThreeFour = other.getZeroFourThreeFour();
        if (this$zeroFourThreeFour == null ? other$zeroFourThreeFour != null : !this$zeroFourThreeFour.equals(other$zeroFourThreeFour))
            return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ZeroFourThreeEntity;
    }

    /**The hashCode method
@see java.lang.Object#hashCode()*/
    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $zeroFourThreeOne = this.getZeroFourThreeOne();
        result = result * PRIME + ($zeroFourThreeOne == null ? 43 : $zeroFourThreeOne.hashCode());
        final java.lang.Object $zeroFourThreeTwoZeroTwentyOne = this.getZeroFourThreeTwoZeroTwentyOne();
        result = result * PRIME + ($zeroFourThreeTwoZeroTwentyOne == null ? 43 : $zeroFourThreeTwoZeroTwentyOne.hashCode());
        final java.lang.Object $zeroFourThreeThree = this.getZeroFourThreeThree();
        result = result * PRIME + ($zeroFourThreeThree == null ? 43 : $zeroFourThreeThree.hashCode());
        final java.lang.Object $zeroFourThreeFour = this.getZeroFourThreeFour();
        result = result * PRIME + ($zeroFourThreeFour == null ? 43 : $zeroFourThreeFour.hashCode());
        return result;
    }

    /**The toString method
@see java.lang.Object#toString()*/
    @java.lang.Override
    public java.lang.String toString() {
        return "ZeroFourThreeEntity(zeroFourThreeOne=" + this.getZeroFourThreeOne() + ", zeroFourThreeTwoZeroTwentyOne=" + this.getZeroFourThreeTwoZeroTwentyOne() + ", zeroFourThreeThree=" + this.getZeroFourThreeThree() + ", zeroFourThreeFour=" + this.getZeroFourThreeFour() + ")";
    }
}

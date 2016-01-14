/**@(#) OneOneEntity.java
Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
Usage is subject to license terms. Any unauthorized usage will be prosecuted.*/
package com.eim.mdm.datamap.entity;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;
import java.util.List;
import org.apache.solr.client.solrj.beans.Field;

/**
 * Entity class to store data to OneOne column family.
 */
@Table(name = "OneOne")
class OneOneEntity {

    @Column(name = "zeroSeventeenOne")
    @Field("zeroSeventeenOne")
    private String zeroSeventeenOne;

    @Column(name = "zeroOneOne")
    @Field("zeroOneOne")
    private String zeroOneOne;

    @Column(name = "zeroOneTwo")
    @Field("zeroOneTwo")
    private String zeroOneTwo;

    @Column(name = "zeroOneThree")
    @Field("zeroOneThree")
    private String zeroOneThree;

    @Column(name = "zeroOneFour")
    @Field("zeroOneFour")
    private long zeroOneFour;

    @Column(name = "zeroOneFive")
    @Field("zeroOneFive")
    private boolean zeroOneFive;

    @Column(name = "zeroOneSix")
    @Field("zeroOneSix")
    private List<String> zeroOneSix;

    @Column(name = "zeroOneSeven_zeroTenOne")
    @Field("zeroOneSeven_zeroTenOne")
    private String zeroOneSevenZeroTenOne;

    @Column(name = "zeroOneSeven_zeroTenTwo")
    @Field("zeroOneSeven_zeroTenTwo")
    private String zeroOneSevenZeroTenTwo;

    @Column(name = "zeroOneEight")
    @Field("zeroOneEight")
    private String zeroOneEight;

    @Column(name = "oneOneOne_zeroTwoOne")
    @Field("oneOneOne_zeroTwoOne")
    private String oneOneOneZeroTwoOne;

    @Column(name = "oneOneOne_zeroTwoTwo")
    @Field("oneOneOne_zeroTwoTwo")
    private String oneOneOneZeroTwoTwo;

    @Column(name = "oneOneTwo_zeroThreeOne")
    @Field("oneOneTwo_zeroThreeOne")
    private String oneOneTwoZeroThreeOne;

    @Column(name = "oneOneTwo_zeroThreeTwo")
    @Field("oneOneTwo_zeroThreeTwo")
    private String oneOneTwoZeroThreeTwo;

    @Column(name = "oneOneTwo_zeroThreeThree")
    @Field("oneOneTwo_zeroThreeThree")
    private String oneOneTwoZeroThreeThree;

    /**Method to access zeroSeventeenOne
@return the zeroSeventeenOne*/
    public String getZeroSeventeenOne() {
        return this.zeroSeventeenOne;
    }

    /**Method to access zeroOneOne
@return the zeroOneOne*/
    public String getZeroOneOne() {
        return this.zeroOneOne;
    }

    /**Method to access zeroOneTwo
@return the zeroOneTwo*/
    public String getZeroOneTwo() {
        return this.zeroOneTwo;
    }

    /**Method to access zeroOneThree
@return the zeroOneThree*/
    public String getZeroOneThree() {
        return this.zeroOneThree;
    }

    /**Method to access zeroOneFour
@return the zeroOneFour*/
    public long getZeroOneFour() {
        return this.zeroOneFour;
    }

    /**Method to access zeroOneFive
@return the zeroOneFive*/
    public boolean isZeroOneFive() {
        return this.zeroOneFive;
    }

    /**Method to access zeroOneSix
@return the zeroOneSix*/
    public List<String> getZeroOneSix() {
        return this.zeroOneSix;
    }

    /**Method to access zeroOneSevenZeroTenOne
@return the zeroOneSevenZeroTenOne*/
    public String getZeroOneSevenZeroTenOne() {
        return this.zeroOneSevenZeroTenOne;
    }

    /**Method to access zeroOneSevenZeroTenTwo
@return the zeroOneSevenZeroTenTwo*/
    public String getZeroOneSevenZeroTenTwo() {
        return this.zeroOneSevenZeroTenTwo;
    }

    /**Method to access zeroOneEight
@return the zeroOneEight*/
    public String getZeroOneEight() {
        return this.zeroOneEight;
    }

    /**Method to access oneOneOneZeroTwoOne
@return the oneOneOneZeroTwoOne*/
    public String getOneOneOneZeroTwoOne() {
        return this.oneOneOneZeroTwoOne;
    }

    /**Method to access oneOneOneZeroTwoTwo
@return the oneOneOneZeroTwoTwo*/
    public String getOneOneOneZeroTwoTwo() {
        return this.oneOneOneZeroTwoTwo;
    }

    /**Method to access oneOneTwoZeroThreeOne
@return the oneOneTwoZeroThreeOne*/
    public String getOneOneTwoZeroThreeOne() {
        return this.oneOneTwoZeroThreeOne;
    }

    /**Method to access oneOneTwoZeroThreeTwo
@return the oneOneTwoZeroThreeTwo*/
    public String getOneOneTwoZeroThreeTwo() {
        return this.oneOneTwoZeroThreeTwo;
    }

    /**Method to access oneOneTwoZeroThreeThree
@return the oneOneTwoZeroThreeThree*/
    public String getOneOneTwoZeroThreeThree() {
        return this.oneOneTwoZeroThreeThree;
    }

    /**Method to mutate zeroSeventeenOne
@param zeroSeventeenOne the zeroSeventeenOne to set*/
    public void setZeroSeventeenOne(final String zeroSeventeenOne) {
        this.zeroSeventeenOne = zeroSeventeenOne;
    }

    /**Method to mutate zeroOneOne
@param zeroOneOne the zeroOneOne to set*/
    public void setZeroOneOne(final String zeroOneOne) {
        this.zeroOneOne = zeroOneOne;
    }

    /**Method to mutate zeroOneTwo
@param zeroOneTwo the zeroOneTwo to set*/
    public void setZeroOneTwo(final String zeroOneTwo) {
        this.zeroOneTwo = zeroOneTwo;
    }

    /**Method to mutate zeroOneThree
@param zeroOneThree the zeroOneThree to set*/
    public void setZeroOneThree(final String zeroOneThree) {
        this.zeroOneThree = zeroOneThree;
    }

    /**Method to mutate zeroOneFour
@param zeroOneFour the zeroOneFour to set*/
    public void setZeroOneFour(final long zeroOneFour) {
        this.zeroOneFour = zeroOneFour;
    }

    /**Method to mutate zeroOneFive
@param zeroOneFive the zeroOneFive to set*/
    public void setZeroOneFive(final boolean zeroOneFive) {
        this.zeroOneFive = zeroOneFive;
    }

    /**Method to mutate zeroOneSix
@param zeroOneSix the zeroOneSix to set*/
    public void setZeroOneSix(final List<String> zeroOneSix) {
        this.zeroOneSix = zeroOneSix;
    }

    /**Method to mutate zeroOneSevenZeroTenOne
@param zeroOneSevenZeroTenOne the zeroOneSevenZeroTenOne to set*/
    public void setZeroOneSevenZeroTenOne(final String zeroOneSevenZeroTenOne) {
        this.zeroOneSevenZeroTenOne = zeroOneSevenZeroTenOne;
    }

    /**Method to mutate zeroOneSevenZeroTenTwo
@param zeroOneSevenZeroTenTwo the zeroOneSevenZeroTenTwo to set*/
    public void setZeroOneSevenZeroTenTwo(final String zeroOneSevenZeroTenTwo) {
        this.zeroOneSevenZeroTenTwo = zeroOneSevenZeroTenTwo;
    }

    /**Method to mutate zeroOneEight
@param zeroOneEight the zeroOneEight to set*/
    public void setZeroOneEight(final String zeroOneEight) {
        this.zeroOneEight = zeroOneEight;
    }

    /**Method to mutate oneOneOneZeroTwoOne
@param oneOneOneZeroTwoOne the oneOneOneZeroTwoOne to set*/
    public void setOneOneOneZeroTwoOne(final String oneOneOneZeroTwoOne) {
        this.oneOneOneZeroTwoOne = oneOneOneZeroTwoOne;
    }

    /**Method to mutate oneOneOneZeroTwoTwo
@param oneOneOneZeroTwoTwo the oneOneOneZeroTwoTwo to set*/
    public void setOneOneOneZeroTwoTwo(final String oneOneOneZeroTwoTwo) {
        this.oneOneOneZeroTwoTwo = oneOneOneZeroTwoTwo;
    }

    /**Method to mutate oneOneTwoZeroThreeOne
@param oneOneTwoZeroThreeOne the oneOneTwoZeroThreeOne to set*/
    public void setOneOneTwoZeroThreeOne(final String oneOneTwoZeroThreeOne) {
        this.oneOneTwoZeroThreeOne = oneOneTwoZeroThreeOne;
    }

    /**Method to mutate oneOneTwoZeroThreeTwo
@param oneOneTwoZeroThreeTwo the oneOneTwoZeroThreeTwo to set*/
    public void setOneOneTwoZeroThreeTwo(final String oneOneTwoZeroThreeTwo) {
        this.oneOneTwoZeroThreeTwo = oneOneTwoZeroThreeTwo;
    }

    /**Method to mutate oneOneTwoZeroThreeThree
@param oneOneTwoZeroThreeThree the oneOneTwoZeroThreeThree to set*/
    public void setOneOneTwoZeroThreeThree(final String oneOneTwoZeroThreeThree) {
        this.oneOneTwoZeroThreeThree = oneOneTwoZeroThreeThree;
    }

    /**The equals method
@see java.lang.Object#equals(java.lang.Object)*/
    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OneOneEntity))
            return false;
        final OneOneEntity other = (OneOneEntity) o;
        if (!other.canEqual((java.lang.Object) this))
            return false;
        final java.lang.Object this$zeroSeventeenOne = this.getZeroSeventeenOne();
        final java.lang.Object other$zeroSeventeenOne = other.getZeroSeventeenOne();
        if (this$zeroSeventeenOne == null ? other$zeroSeventeenOne != null : !this$zeroSeventeenOne.equals(other$zeroSeventeenOne))
            return false;
        final java.lang.Object this$zeroOneOne = this.getZeroOneOne();
        final java.lang.Object other$zeroOneOne = other.getZeroOneOne();
        if (this$zeroOneOne == null ? other$zeroOneOne != null : !this$zeroOneOne.equals(other$zeroOneOne))
            return false;
        final java.lang.Object this$zeroOneTwo = this.getZeroOneTwo();
        final java.lang.Object other$zeroOneTwo = other.getZeroOneTwo();
        if (this$zeroOneTwo == null ? other$zeroOneTwo != null : !this$zeroOneTwo.equals(other$zeroOneTwo))
            return false;
        final java.lang.Object this$zeroOneThree = this.getZeroOneThree();
        final java.lang.Object other$zeroOneThree = other.getZeroOneThree();
        if (this$zeroOneThree == null ? other$zeroOneThree != null : !this$zeroOneThree.equals(other$zeroOneThree))
            return false;
        if (this.getZeroOneFour() != other.getZeroOneFour())
            return false;
        if (this.isZeroOneFive() != other.isZeroOneFive())
            return false;
        final java.lang.Object this$zeroOneSix = this.getZeroOneSix();
        final java.lang.Object other$zeroOneSix = other.getZeroOneSix();
        if (this$zeroOneSix == null ? other$zeroOneSix != null : !this$zeroOneSix.equals(other$zeroOneSix))
            return false;
        final java.lang.Object this$zeroOneSevenZeroTenOne = this.getZeroOneSevenZeroTenOne();
        final java.lang.Object other$zeroOneSevenZeroTenOne = other.getZeroOneSevenZeroTenOne();
        if (this$zeroOneSevenZeroTenOne == null ? other$zeroOneSevenZeroTenOne != null : !this$zeroOneSevenZeroTenOne.equals(other$zeroOneSevenZeroTenOne))
            return false;
        final java.lang.Object this$zeroOneSevenZeroTenTwo = this.getZeroOneSevenZeroTenTwo();
        final java.lang.Object other$zeroOneSevenZeroTenTwo = other.getZeroOneSevenZeroTenTwo();
        if (this$zeroOneSevenZeroTenTwo == null ? other$zeroOneSevenZeroTenTwo != null : !this$zeroOneSevenZeroTenTwo.equals(other$zeroOneSevenZeroTenTwo))
            return false;
        final java.lang.Object this$zeroOneEight = this.getZeroOneEight();
        final java.lang.Object other$zeroOneEight = other.getZeroOneEight();
        if (this$zeroOneEight == null ? other$zeroOneEight != null : !this$zeroOneEight.equals(other$zeroOneEight))
            return false;
        final java.lang.Object this$oneOneOneZeroTwoOne = this.getOneOneOneZeroTwoOne();
        final java.lang.Object other$oneOneOneZeroTwoOne = other.getOneOneOneZeroTwoOne();
        if (this$oneOneOneZeroTwoOne == null ? other$oneOneOneZeroTwoOne != null : !this$oneOneOneZeroTwoOne.equals(other$oneOneOneZeroTwoOne))
            return false;
        final java.lang.Object this$oneOneOneZeroTwoTwo = this.getOneOneOneZeroTwoTwo();
        final java.lang.Object other$oneOneOneZeroTwoTwo = other.getOneOneOneZeroTwoTwo();
        if (this$oneOneOneZeroTwoTwo == null ? other$oneOneOneZeroTwoTwo != null : !this$oneOneOneZeroTwoTwo.equals(other$oneOneOneZeroTwoTwo))
            return false;
        final java.lang.Object this$oneOneTwoZeroThreeOne = this.getOneOneTwoZeroThreeOne();
        final java.lang.Object other$oneOneTwoZeroThreeOne = other.getOneOneTwoZeroThreeOne();
        if (this$oneOneTwoZeroThreeOne == null ? other$oneOneTwoZeroThreeOne != null : !this$oneOneTwoZeroThreeOne.equals(other$oneOneTwoZeroThreeOne))
            return false;
        final java.lang.Object this$oneOneTwoZeroThreeTwo = this.getOneOneTwoZeroThreeTwo();
        final java.lang.Object other$oneOneTwoZeroThreeTwo = other.getOneOneTwoZeroThreeTwo();
        if (this$oneOneTwoZeroThreeTwo == null ? other$oneOneTwoZeroThreeTwo != null : !this$oneOneTwoZeroThreeTwo.equals(other$oneOneTwoZeroThreeTwo))
            return false;
        final java.lang.Object this$oneOneTwoZeroThreeThree = this.getOneOneTwoZeroThreeThree();
        final java.lang.Object other$oneOneTwoZeroThreeThree = other.getOneOneTwoZeroThreeThree();
        if (this$oneOneTwoZeroThreeThree == null ? other$oneOneTwoZeroThreeThree != null : !this$oneOneTwoZeroThreeThree.equals(other$oneOneTwoZeroThreeThree))
            return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof OneOneEntity;
    }

    /**The hashCode method
@see java.lang.Object#hashCode()*/
    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $zeroSeventeenOne = this.getZeroSeventeenOne();
        result = result * PRIME + ($zeroSeventeenOne == null ? 43 : $zeroSeventeenOne.hashCode());
        final java.lang.Object $zeroOneOne = this.getZeroOneOne();
        result = result * PRIME + ($zeroOneOne == null ? 43 : $zeroOneOne.hashCode());
        final java.lang.Object $zeroOneTwo = this.getZeroOneTwo();
        result = result * PRIME + ($zeroOneTwo == null ? 43 : $zeroOneTwo.hashCode());
        final java.lang.Object $zeroOneThree = this.getZeroOneThree();
        result = result * PRIME + ($zeroOneThree == null ? 43 : $zeroOneThree.hashCode());
        final long $zeroOneFour = this.getZeroOneFour();
        result = result * PRIME + (int) ($zeroOneFour >>> 32 ^ $zeroOneFour);
        result = result * PRIME + (this.isZeroOneFive() ? 79 : 97);
        final java.lang.Object $zeroOneSix = this.getZeroOneSix();
        result = result * PRIME + ($zeroOneSix == null ? 43 : $zeroOneSix.hashCode());
        final java.lang.Object $zeroOneSevenZeroTenOne = this.getZeroOneSevenZeroTenOne();
        result = result * PRIME + ($zeroOneSevenZeroTenOne == null ? 43 : $zeroOneSevenZeroTenOne.hashCode());
        final java.lang.Object $zeroOneSevenZeroTenTwo = this.getZeroOneSevenZeroTenTwo();
        result = result * PRIME + ($zeroOneSevenZeroTenTwo == null ? 43 : $zeroOneSevenZeroTenTwo.hashCode());
        final java.lang.Object $zeroOneEight = this.getZeroOneEight();
        result = result * PRIME + ($zeroOneEight == null ? 43 : $zeroOneEight.hashCode());
        final java.lang.Object $oneOneOneZeroTwoOne = this.getOneOneOneZeroTwoOne();
        result = result * PRIME + ($oneOneOneZeroTwoOne == null ? 43 : $oneOneOneZeroTwoOne.hashCode());
        final java.lang.Object $oneOneOneZeroTwoTwo = this.getOneOneOneZeroTwoTwo();
        result = result * PRIME + ($oneOneOneZeroTwoTwo == null ? 43 : $oneOneOneZeroTwoTwo.hashCode());
        final java.lang.Object $oneOneTwoZeroThreeOne = this.getOneOneTwoZeroThreeOne();
        result = result * PRIME + ($oneOneTwoZeroThreeOne == null ? 43 : $oneOneTwoZeroThreeOne.hashCode());
        final java.lang.Object $oneOneTwoZeroThreeTwo = this.getOneOneTwoZeroThreeTwo();
        result = result * PRIME + ($oneOneTwoZeroThreeTwo == null ? 43 : $oneOneTwoZeroThreeTwo.hashCode());
        final java.lang.Object $oneOneTwoZeroThreeThree = this.getOneOneTwoZeroThreeThree();
        result = result * PRIME + ($oneOneTwoZeroThreeThree == null ? 43 : $oneOneTwoZeroThreeThree.hashCode());
        return result;
    }

    /**The toString method
@see java.lang.Object#toString()*/
    @java.lang.Override
    public java.lang.String toString() {
        return "OneOneEntity(zeroSeventeenOne=" + this.getZeroSeventeenOne() + ", zeroOneOne=" + this.getZeroOneOne() + ", zeroOneTwo=" + this.getZeroOneTwo() + ", zeroOneThree=" + this.getZeroOneThree() + ", zeroOneFour=" + this.getZeroOneFour() + ", zeroOneFive=" + this.isZeroOneFive() + ", zeroOneSix=" + this.getZeroOneSix() + ", zeroOneSevenZeroTenOne=" + this.getZeroOneSevenZeroTenOne() + ", zeroOneSevenZeroTenTwo=" + this.getZeroOneSevenZeroTenTwo() + ", zeroOneEight=" + this.getZeroOneEight() + ", oneOneOneZeroTwoOne=" + this.getOneOneOneZeroTwoOne() + ", oneOneOneZeroTwoTwo=" + this.getOneOneOneZeroTwoTwo() + ", oneOneTwoZeroThreeOne=" + this.getOneOneTwoZeroThreeOne() + ", oneOneTwoZeroThreeTwo=" + this.getOneOneTwoZeroThreeTwo() + ", oneOneTwoZeroThreeThree=" + this.getOneOneTwoZeroThreeThree() + ")";
    }
}

package com.citibanamex.api.bne.saveremoteauthorization.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BBS_OWN_ACCOUNT")
public class model implements Serializable{

    @Column(name = "ACCOUNT_NUMBER")
    @Id
    private String ACCOUNT_NUMBER;

    @Column(name = "CONTRACT_NUMBER")
    private String CONTRACT_NUMBER;

    @Column(name = "PRODUCT_CODE")
    private String PRODUCT_CODE;

    @Column(name = "INSTRUMENT_CODE")
    private String INSTRUMENT_CODE;

    @Column(name = "BRANCH")
    private String BRANCH;

    @Column(name = "ACCOUNT_NAME")
    private String ACCOUNT_NAME;

    @Column(name = "ACCOUNT_NICKNAME")
    private String ACCOUNT_NICKNAME;

    @Column(name = "ACCOUNT_TYPE")
    private String ACCOUNT_TYPE;

    @Column(name = "CURRENCY")
    private String CURRENCY;

    @Column(name = "STARTING_DATE")
    private String STARTING_DATE;

    @Column(name = "BANK_ELEC_USAGE")
    private String BANK_ELEC_USAGE;

    @Column(name = "CLIENT_RELATION")
    private String CLIENT_RELATION;

    @Column(name = "DATE")
    private String DATE;

    @Column(name = "TIME")
    private String TIME;

    @Column(name = "CELL_NUMBER")
    private String CELL_NUMBER;

    @Column(name = "LAST_PAY")
    private String LAST_PAY;

    @Column(name = "LAST_PAY_DATE")
    private String LAST_PAY_DATE;

    public model(String ACCOUNT_NUMBER, String CONTRACT_NUMBER, String PRODUCT_CODE, String INSTRUMENT_CODE, String BRANCH,
            String ACCOUNT_NAME, String ACCOUNT_NICKNAME, String ACCOUNT_TYPE, String CURRENCY, String STARTING_DATE,
            String BANK_ELEC_USAGE, String CLIENT_RELATION, String DATE, String TIME, String CELL_NUMBER, String LAST_PAY,
            String LAST_PAY_DATE) {

        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.CONTRACT_NUMBER = CONTRACT_NUMBER;
        this.PRODUCT_CODE = PRODUCT_CODE;
        this.INSTRUMENT_CODE = INSTRUMENT_CODE;
        this.BRANCH = BRANCH;
        this.ACCOUNT_NAME = ACCOUNT_NAME;
        this.ACCOUNT_NICKNAME = ACCOUNT_NICKNAME;
        this.ACCOUNT_TYPE = ACCOUNT_TYPE;
        this.CURRENCY = CURRENCY;
        this.STARTING_DATE = STARTING_DATE;
        this.BANK_ELEC_USAGE = BANK_ELEC_USAGE;
        this.CLIENT_RELATION = CLIENT_RELATION;
        this.DATE = DATE;
        this.TIME = TIME;
        this.CELL_NUMBER = CELL_NUMBER;
        this.LAST_PAY = LAST_PAY;
        this.LAST_PAY_DATE = LAST_PAY_DATE;

    }

    /**
     * @return the ACCOUNT_NUMBER
     */
    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    /**
     * @param ACCOUNT_NUMBER the ACCOUNT_NUMBER to set
     */
    public void setACCOUNT_NUMBER(String ACCOUNT_NUMBER) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    /**
     * @return the CONTRACT_NUMBER
     */
    public String getCONTRACT_NUMBER() {
        return CONTRACT_NUMBER;
    }

    /**
     * @param CONTRACT_NUMBER the CONTRACT_NUMBER to set
     */
    public void setCONTRACT_NUMBER(String CONTRACT_NUMBER) {
        this.CONTRACT_NUMBER = CONTRACT_NUMBER;
    }

    /**
     * @return the PRODUCT_CODE
     */
    public String getPRODUCT_CODE() {
        return PRODUCT_CODE;
    }

    /**
     * @param PRODUCT_CODE the PRODUCT_CODE to set
     */
    public void setPRODUCT_CODE(String PRODUCT_CODE) {
        this.PRODUCT_CODE = PRODUCT_CODE;
    }

    /**
     * @return the INSTRUMENT_CODE
     */
    public String getINSTRUMENT_CODE() {
        return INSTRUMENT_CODE;
    }

    /**
     * @param INSTRUMENT_CODE the INSTRUMENT_CODE to set
     */
    public void setINSTRUMENT_CODE(String INSTRUMENT_CODE) {
        this.INSTRUMENT_CODE = INSTRUMENT_CODE;
    }

    /**
     * @return the BRANCH
     */
    public String getBRANCH() {
        return BRANCH;
    }

    /**
     * @param BRANCH the BRANCH to set
     */
    public void setBRANCH(String BRANCH) {
        this.BRANCH = BRANCH;
    }

    /**
     * @return the ACCOUNT_NAME
     */
    public String getACCOUNT_NAME() {
        return ACCOUNT_NAME;
    }

    /**
     * @param ACCOUNT_NAME the ACCOUNT_NAME to set
     */
    public void setACCOUNT_NAME(String ACCOUNT_NAME) {
        this.ACCOUNT_NAME = ACCOUNT_NAME;
    }

    /**
     * @return the ACCOUNT_NICKNAME
     */
    public String getACCOUNT_NICKNAME() {
        return ACCOUNT_NICKNAME;
    }

    /**
     * @param ACCOUNT_NICKNAME the ACCOUNT_NICKNAME to set
     */
    public void setACCOUNT_NICKNAME(String ACCOUNT_NICKNAME) {
        this.ACCOUNT_NICKNAME = ACCOUNT_NICKNAME;
    }

    /**
     * @return the ACCOUNT_TYPE
     */
    public String getACCOUNT_TYPE() {
        return ACCOUNT_TYPE;
    }

    /**
     * @param ACCOUNT_TYPE the ACCOUNT_TYPE to set
     */
    public void setACCOUNT_TYPE(String ACCOUNT_TYPE) {
        this.ACCOUNT_TYPE = ACCOUNT_TYPE;
    }

    /**
     * @return the CURRENCY
     */
    public String getCURRENCY() {
        return CURRENCY;
    }

    /**
     * @param CURRENCY the CURRENCY to set
     */
    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    /**
     * @return the STARTING_DATE
     */
    public String getSTARTING_DATE() {
        return STARTING_DATE;
    }

    /**
     * @param STARTING_DATE the STARTING_DATE to set
     */
    public void setSTARTING_DATE(String STARTING_DATE) {
        this.STARTING_DATE = STARTING_DATE;
    }

    /**
     * @return the BANK_ELEC_USAGE
     */
    public String getBANK_ELEC_USAGE() {
        return BANK_ELEC_USAGE;
    }

    /**
     * @param BANK_ELEC_USAGE the BANK_ELEC_USAGE to set
     */
    public void setBANK_ELEC_USAGE(String BANK_ELEC_USAGE) {
        this.BANK_ELEC_USAGE = BANK_ELEC_USAGE;
    }

    /**
     * @return the CLIENT_RELATION
     */
    public String getCLIENT_RELATION() {
        return CLIENT_RELATION;
    }

    /**
     * @param CLIENT_RELATION the CLIENT_RELATION to set
     */
    public void setCLIENT_RELATION(String CLIENT_RELATION) {
        this.CLIENT_RELATION = CLIENT_RELATION;
    }

    /**
     * @return the DATE
     */
    public String getDATE() {
        return DATE;
    }

    /**
     * @param DATE the DATE to set
     */
    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    /**
     * @return the TIME
     */
    public String getTIME() {
        return TIME;
    }

    /**
     * @param TIME the TIME to set
     */
    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    /**
     * @return the CELL_NUMBER
     */
    public String getCELL_NUMBER() {
        return CELL_NUMBER;
    }

    /**
     * @param CELL_NUMBER the CELL_NUMBER to set
     */
    public void setCELL_NUMBER(String CELL_NUMBER) {
        this.CELL_NUMBER = CELL_NUMBER;
    }

    /**
     * @return the LAST_PAY
     */
    public String getLAST_PAY() {
        return LAST_PAY;
    }

    /**
     * @param LAST_PAY the LAST_PAY to set
     */
    public void setLAST_PAY(String LAST_PAY) {
        this.LAST_PAY = LAST_PAY;
    }

    /**
     * @return the LAST_PAY_DATE
     */
    public String getLAST_PAY_DATE() {
        return LAST_PAY_DATE;
    }

    /**
     * @param LAST_PAY_DATE the LAST_PAY_DATE to set
     */
    public void setLAST_PAY_DATE(String LAST_PAY_DATE) {
        this.LAST_PAY_DATE = LAST_PAY_DATE;
    }

}

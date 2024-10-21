package com.example.newMock.Model;

import lombok.Data;

import java.math.BigDecimal;

@Data

public class ResponseDTO {


    private String rqUID;
    private String clientId;
    private String account;
    private BigDecimal balance;
    private String currency;
    private BigDecimal maxLimit;


}




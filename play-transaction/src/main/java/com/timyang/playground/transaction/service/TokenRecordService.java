package com.timyang.playground.transaction.service;

import com.timyang.playground.transaction.entitys.TokenRecord;
import org.springframework.stereotype.Service;

@Service
public interface TokenRecordService {

    void saveTokenRecord(TokenRecord record);

    void updateTokenRecord(String username, TokenRecord record);
}
